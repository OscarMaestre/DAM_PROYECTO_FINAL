/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistence.ApplicationClient;

/**
 *
 * @author erome
 */
public class MenuGUI extends javax.swing.JFrame {
    ApplicationClient appClient;
    LoginGUI parent;
    String username;
    String rolename;
    
    public MenuGUI(String username,String rolename, int port, LoginGUI parent) {
        this();
        this.parent = parent;
        this.username = username;
        this.rolename = rolename;
        this.appClient = new ApplicationClient(username, port);
        this.lblUsername.setText(username);
        this.lblRolename.setText(rolename);
    }
    
    public MenuGUI() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        btnProfile = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnPreferences = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnMenu = new RSMaterialComponent.RSButtonMaterialIconOne();
        btnLogOut = new RSMaterialComponent.RSButtonMaterialIconOne();
        MainPanel = new javax.swing.JPanel();
        btnMenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new RSMaterialComponent.RSLabelTextIcon();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblRolename = new RSMaterialComponent.RSLabelTextIcon();
        btnRoleinfo = new RSMaterialComponent.RSButtonIconOne();
        ActionScroll = new javax.swing.JScrollPane();
        ActionPanel = new javax.swing.JPanel();
        btnAdminUsers = new newscomponents.RSButtonGradientIcon_new();
        btnAdminProfiles = new newscomponents.RSButtonGradientIcon_new();
        btnAdminRoles = new newscomponents.RSButtonGradientIcon_new();
        btnSendAdverts = new newscomponents.RSButtonGradientIcon_new();
        btnSendEmail = new newscomponents.RSButtonGradientIcon_new();
        OverMainPanel = new javax.swing.JPanel();
        btnNewSale = new newscomponents.RSButtonBigIcon_new();
        btnPrintSaleTicket = new newscomponents.RSButtonBigIcon_new();
        btnViewAdverts = new newscomponents.RSButtonBigIcon_new();
        btnSaleStatistics = new newscomponents.RSButtonBigIcon_new();
        btnRegisterProduct = new newscomponents.RSButtonBigIcon_new();
        btnInMail = new newscomponents.RSButtonBigIcon_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MenuPanel.setBackground(new java.awt.Color(37, 45, 223));

        btnProfile.setText("Profile");
        btnProfile.setBackgroundHover(new java.awt.Color(0, 0, 51));
        btnProfile.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);

        btnPreferences.setText("Preferences");
        btnPreferences.setBackgroundHover(new java.awt.Color(0, 0, 51));
        btnPreferences.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS);

        btnMenu.setText("Menu");
        btnMenu.setBackgroundHover(new java.awt.Color(0, 0, 51));
        btnMenu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnLogOut.setText("LogOut");
        btnLogOut.setBackgroundHover(new java.awt.Color(255, 0, 0));
        btnLogOut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogOut.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnLogOut.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.RIGHT);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPreferences, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreferences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuPanel.setBackground(new java.awt.Color(102, 102, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        btnMenuPanel.setBorder(dropShadowBorder1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Connected as");

        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Username");
        lblUsername.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Permission level");

        lblRolename.setForeground(new java.awt.Color(255, 255, 255));
        lblRolename.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRolename.setText("Rolename");
        lblRolename.setFont(new java.awt.Font("Roboto Bold", 1, 11)); // NOI18N
        lblRolename.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FINGERPRINT);
        lblRolename.setSizeIcon(25.0F);

        btnRoleinfo.setBackground(new java.awt.Color(102, 102, 255));
        btnRoleinfo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO_OUTLINE);
        btnRoleinfo.setSizeIcon(18.0F);
        btnRoleinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoleinfoActionPerformed(evt);
            }
        });

        ActionScroll.setBackground(new java.awt.Color(204, 204, 255));
        ActionScroll.setHorizontalScrollBar(null);

        btnAdminUsers.setText("Admin Users");
        btnAdminUsers.setEnabled(false);
        btnAdminUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdminUsers.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);

        btnAdminProfiles.setText("Admin Profiles");
        btnAdminProfiles.setEnabled(false);
        btnAdminProfiles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdminProfiles.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CONTACTS);

        btnAdminRoles.setText("Admin Roles");
        btnAdminRoles.setEnabled(false);
        btnAdminRoles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdminRoles.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FINGERPRINT);

        btnSendAdverts.setText("Send Adverts");
        btnSendAdverts.setEnabled(false);
        btnSendAdverts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSendAdverts.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        btnSendEmail.setText("Send Email");
        btnSendEmail.setEnabled(false);
        btnSendEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSendEmail.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EMAIL);

        javax.swing.GroupLayout ActionPanelLayout = new javax.swing.GroupLayout(ActionPanel);
        ActionPanel.setLayout(ActionPanelLayout);
        ActionPanelLayout.setHorizontalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdminUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAdminProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAdminRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSendAdverts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ActionPanelLayout.setVerticalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionPanelLayout.createSequentialGroup()
                .addComponent(btnAdminUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAdminProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAdminRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSendAdverts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ActionScroll.setViewportView(ActionPanel);

        javax.swing.GroupLayout btnMenuPanelLayout = new javax.swing.GroupLayout(btnMenuPanel);
        btnMenuPanel.setLayout(btnMenuPanelLayout);
        btnMenuPanelLayout.setHorizontalGroup(
            btnMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(btnMenuPanelLayout.createSequentialGroup()
                .addGroup(btnMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(btnMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(btnMenuPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRolename, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRoleinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ActionScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMenuPanelLayout.setVerticalGroup(
            btnMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btnMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRolename, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRoleinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActionScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainPanel.add(btnMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 220, 317));

        OverMainPanel.setBackground(new java.awt.Color(204, 204, 255));

        btnNewSale.setText("New Sale");
        btnNewSale.setEnabled(false);
        btnNewSale.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MONETIZATION_ON);

        btnPrintSaleTicket.setText("Print Sale Ticket");
        btnPrintSaleTicket.setEnabled(false);
        btnPrintSaleTicket.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PRINT);

        btnViewAdverts.setText("View Adverts");
        btnViewAdverts.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO);

        btnSaleStatistics.setText("Sale Statistics");
        btnSaleStatistics.setEnabled(false);
        btnSaleStatistics.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EQUALIZER);

        btnRegisterProduct.setText("Register Product");
        btnRegisterProduct.setEnabled(false);
        btnRegisterProduct.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);

        btnInMail.setText("In Mail");
        btnInMail.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MAIL_OUTLINE);
        btnInMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OverMainPanelLayout = new javax.swing.GroupLayout(OverMainPanel);
        OverMainPanel.setLayout(OverMainPanelLayout);
        OverMainPanelLayout.setHorizontalGroup(
            OverMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverMainPanelLayout.createSequentialGroup()
                .addGroup(OverMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OverMainPanelLayout.createSequentialGroup()
                        .addComponent(btnRegisterProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaleStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OverMainPanelLayout.createSequentialGroup()
                        .addComponent(btnNewSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintSaleTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OverMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewAdverts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        OverMainPanelLayout.setVerticalGroup(
            OverMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OverMainPanelLayout.createSequentialGroup()
                .addGroup(OverMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintSaleTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAdverts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OverMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaleStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        MainPanel.add(OverMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        try {
            this.appClient.SendLogOut();
            parent.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(MenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        showHideMenu();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnRoleinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleinfoActionPerformed
        try {
            LinkedList<String> perms = this.appClient.AskForRoleInfo(rolename);
            String texto = "";
            for(String s : perms)
                texto+=s+"\n";
            
            JOptionPane.showMessageDialog(this, texto);            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRoleinfoActionPerformed

    private void btnInMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInMailActionPerformed
        InMailGUI mail = new InMailGUI(this);
        this.setVisible(false);
        mail.setVisible(true);
    }//GEN-LAST:event_btnInMailActionPerformed
    
    private void showHideMenu(){
        int position = OverMainPanel.getX();
        if(position > 5){
            //Libreria modificada RojeruSan de animaciones
            Animacion.Animacion.mover_izquierda(220, 0, 2, 2, OverMainPanel);
            Animacion.Animacion.mover_izquierda(0, -220, 2, 2, btnMenuPanel);
        }else{
            Animacion.Animacion.mover_derecha(0, 220, 2, 2, OverMainPanel);
            Animacion.Animacion.mover_derecha(-220, 0, 2, 2, btnMenuPanel);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionPanel;
    private javax.swing.JScrollPane ActionScroll;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel OverMainPanel;
    private newscomponents.RSButtonGradientIcon_new btnAdminProfiles;
    private newscomponents.RSButtonGradientIcon_new btnAdminRoles;
    private newscomponents.RSButtonGradientIcon_new btnAdminUsers;
    private newscomponents.RSButtonBigIcon_new btnInMail;
    private RSMaterialComponent.RSButtonMaterialIconOne btnLogOut;
    private RSMaterialComponent.RSButtonMaterialIconOne btnMenu;
    private javax.swing.JPanel btnMenuPanel;
    private newscomponents.RSButtonBigIcon_new btnNewSale;
    private RSMaterialComponent.RSButtonMaterialIconOne btnPreferences;
    private newscomponents.RSButtonBigIcon_new btnPrintSaleTicket;
    private RSMaterialComponent.RSButtonMaterialIconOne btnProfile;
    private newscomponents.RSButtonBigIcon_new btnRegisterProduct;
    private RSMaterialComponent.RSButtonIconOne btnRoleinfo;
    private newscomponents.RSButtonBigIcon_new btnSaleStatistics;
    private newscomponents.RSButtonGradientIcon_new btnSendAdverts;
    private newscomponents.RSButtonGradientIcon_new btnSendEmail;
    private newscomponents.RSButtonBigIcon_new btnViewAdverts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSLabelTextIcon lblRolename;
    private RSMaterialComponent.RSLabelTextIcon lblUsername;
    // End of variables declaration//GEN-END:variables
}
