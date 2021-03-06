/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedList;
import utilities.Utilidades;

/**
 *
 * @author erome
 */
public class ApplicationClient{
    private static final String ServerIP = "127.0.0.1";
    private String username;
    private int port;
    
    public ApplicationClient(String username, int port){
        this.username = username;
        this.port = port;
    }
    
    public void SendLogOut() throws IOException{
        Socket conexion;
        InetSocketAddress direccionServidor;
        direccionServidor=
           new InetSocketAddress(ServerIP, port);
        conexion=new Socket();
        //Sending HandShake
        conexion.connect(direccionServidor);
        
        //Getting streams
        PrintWriter pw=Utilidades.getPrintWriter(conexion.getOutputStream());
        BufferedReader bfr=Utilidades.getBufferedReader(conexion.getInputStream());
        
        //Protocol - User checking
        pw.println(username);
        pw.flush();
        
        boolean check = Integer.parseInt(bfr.readLine()) == 1;
        
        if(check){
            pw.println(0); //LOGOUT CODE = 0
            pw.flush();
        }

        
        //Closing connection with login server
        bfr.close();
        pw.close();
        conexion.close();
    }
    
    public LinkedList<String> AskForRoleInfo(String rolename) throws IOException{
        LinkedList<String> resultado = new LinkedList<>();
        
        Socket conexion;
        InetSocketAddress direccionServidor;
        direccionServidor=
           new InetSocketAddress(ServerIP, port);
        conexion=new Socket();
        //Sending HandShake
        conexion.connect(direccionServidor);
        
        //Getting streams
        PrintWriter pw=Utilidades.getPrintWriter(conexion.getOutputStream());
        BufferedReader bfr=Utilidades.getBufferedReader(conexion.getInputStream());
        
        //Protocol - User checking        
        pw.println(username);
        pw.flush();
        
        pw.println("1"); //ASK
        pw.flush();
        
        int confirmation = Integer.parseInt(bfr.readLine());
        if(confirmation == 1){
            pw.println(rolename);
            pw.flush();

            String linea = "";
            while(!linea.equals("END")){
                linea = bfr.readLine();
                if(!linea.equals("END"))
                    resultado.add(linea);
            }
        }

        
        //Closing connection with login server
        bfr.close();
        pw.close();
        
        return resultado;
    }
}
