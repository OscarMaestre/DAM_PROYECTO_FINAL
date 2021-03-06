/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import utilities.Utilidades;

/**
 *
 * @author erome
 */
public class ApplicationServer implements Runnable{
    
    private int PORT;
    private String username;
    private ServerSocket socketServidor;
    private boolean exit = false;
    private SQLiteManager man;
    

    public ApplicationServer(int PORT, String username) {
        this.PORT = PORT;
        this.username = username;
        this.man = SQLiteManager.getSingletonInstance();
    }
    
    public void stop(){
        exit = true;
        man.executeNonQuery("UPDATE USERS SET ONLINE=FALSE WHERE USERNAME='"+username+"';");
        try {
            socketServidor.close();
        } catch (IOException ex) {
            
        }
    }
    
    @Override
    public void run() {
        try {
            socketServidor=
                    new ServerSocket(this.PORT);
            while (!exit){
                /*1. Esperar que llegue una petición*/
                Socket socketConCliente;
                socketConCliente=socketServidor.accept();
                ApplicationServer.PetitionResolver p=new ApplicationServer.PetitionResolver(socketConCliente, this);
                Thread hiloAsociado=new Thread(p);
                if(!exit)            
                    hiloAsociado.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(ApplicationServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private class PetitionResolver implements Runnable{
        private Socket socket;
        private ApplicationServer stoppable;
        
        public PetitionResolver(Socket socket, ApplicationServer stoppable){
            this.socket = socket;
            this.stoppable = stoppable;
        }
        
        @Override
        public void run(){
            try {
                resolvePetition();
            } catch (IOException ex) {
                Logger.getLogger(ApplicationServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        private void resolvePetition() throws IOException{
            BufferedReader bfr = Utilidades.getBufferedReader(socket.getInputStream());
            PrintWriter pw = Utilidades.getPrintWriter(socket.getOutputStream());
            
            //Checking username is correct for this server port
            String user = bfr.readLine();
            if(user.equals(username))
                pw.println("1");
            else
                pw.println("-1");
            pw.flush();
            
            //Getting petition code
            int code = Integer.parseInt(bfr.readLine());
            switch(code){
                case PROTOCOL_CODES.LOGOUT:
                    LogOutPetition();
                    break;
                case PROTOCOL_CODES.ROLEINFO:
                {
                    try {
                        RoleInfo(bfr, pw);
                    } catch (SQLException ex) {
                        Logger.getLogger(ApplicationServer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

            }
        }
        
        private void LogOutPetition(){
            stoppable.stop();
        }
        
        private void RoleInfo(BufferedReader bfr, PrintWriter pw) throws IOException, SQLException{
            String rolename = bfr.readLine();
            String sql = "SELECT PERMNAME FROM PERM, ROLES_PERM, ROLES WHERE ROLES.ROLENAME = '"+rolename+"' AND ROLES.IDROLE=ROLES_PERM.IDROLE AND ROLES_PERM.IDPERM=PERM.IDPERM;";
            ResultSet rs = man.executeQuery(sql);
            while(rs.next()){
                pw.println(rs.getString(1));
                pw.flush();
            }
            pw.println("END");
            pw.flush();
        }
        
    }
    
    public interface PROTOCOL_CODES{
        public static int LOGOUT = 0;
        public static int ROLEINFO = 1;
    }
}
