/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Db.DataBase;
import GlorySchema.Validation;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author deela
 */
public class LoginScreen extends javax.swing.JFrame {

    public static String PlayerId;
    public static String PlayerName;

    Validation value = new Validation();

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {

        setUndecorated(true);
//        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
//        setSize(852, 480);
        initComponents();

        setLocationRelativeTo(null);

        //  btnLoging.setBackground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        btnLoging = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblLog = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("UserName");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, 20));

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 200, 40));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, 20));

        txt_password.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 200, 40));

        jButton3.setBackground(new java.awt.Color(56, 185, 33));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-shutdown-25.png"))); // NOI18N
        jButton3.setText("Quit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 120, 40));

        btnLoging.setBackground(new java.awt.Color(56, 185, 33));
        btnLoging.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnLoging.setForeground(new java.awt.Color(255, 255, 255));
        btnLoging.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-user-engagement-male-25.png"))); // NOI18N
        btnLoging.setText("Loging");
        btnLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogingActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 120, 40));

        jButton2.setBackground(new java.awt.Color(56, 185, 33));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-add-user-male-25.png"))); // NOI18N
        jButton2.setText("Signin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, 40));
        jPanel2.add(lblLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 240));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogingActionPerformed
        if (!value.checkNull(txtUsername.getText(), "User name")) {
            return;
        } else if (!value.checkNull(txt_password.getText(), "Password")) {
            return;
        }

        try {
            DataBase db = new DataBase();
            String username = txtUsername.getText();
            ResultSet rs = null;

            String query = "SELECT * FROM player WHERE UserName  = '" + username + "'";
            rs = (ResultSet) db.fetch(query);
            if (rs.next()) {
                PlayerName = rs.getString("Name");
                PlayerId = rs.getString("UserId");
                if (txt_password.getText().equals(rs.getString("Password"))) {
                    // JOptionPane.showMessageDialog(null, "Success", "InfoBox: " + "Done", JOptionPane.INFORMATION_MESSAGE);
                    SelectGame breq = new SelectGame();
                    breq.setVisible(true);
                    this.dispose();
                    breq = null;

                } else {
                    JOptionPane.showMessageDialog(null, "Failed", "InfoBox: " + "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegisterScreen register = new RegisterScreen();
        register.setVisible(true);
        this.dispose();

//  txtUsername.setText(null);
        //  txt_password.setText(null);
        //  this.hide();
        //  new RegisterScreen().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//            if ("Metal".equals(info.getName())) {
//                javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                MetalLookAndFeel.setCurrentTheme(new OceanTheme());
//                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                break;
//            }

            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoging;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLog;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
