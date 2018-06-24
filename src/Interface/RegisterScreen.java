/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import GlorySchema.Player;
import GlorySchema.Validation;
import static Interface.RegisterScreen.cPassword;

/**
 *
 * @author Niroshima
 */
public class RegisterScreen extends javax.swing.JFrame {

    Player Details = new Player();

    public static String UserId;
    public static String Name;
    public static String Email;
    public static String UserName;
    public static String password;
    public static String cPassword;

    /**
     * Creates new form RegisterScreen
     */
    public RegisterScreen() {

        setUndecorated(true);
        validate();
        initComponents();
        btn_register.setContentAreaFilled( false );
        btn_register.setBorder( null );
        btn_mainmenu.setContentAreaFilled( false );
        btn_mainmenu.setBorder( null );
        uName.setOpaque(false);
        uName.setBorder( null );
        email.setOpaque(false);
        email.setBorder( null );
        Password.setOpaque(false);
        Password.setBorder( null );
        confirm_password.setOpaque(false);
        confirm_password.setBorder( null );
        setLocationRelativeTo(null);
        //btn_register.setBackground(Color.GREEN);
        UpdateUserID();
        uId.setVisible(false);
        name.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        uId = new javax.swing.JTextField();
        uName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        confirm_password = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        btn_mainmenu = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(834, 727));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uId.setEditable(false);
        uId.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uId.setText(" ");
        uId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uIdActionPerformed(evt);
            }
        });
        jPanel1.add(uId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 30, 30));

        uName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        uName.setText(" ");
        uName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uNameFocusLost(evt);
            }
        });
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });
        jPanel1.add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 260, 30));

        Password.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 260, 30));

        confirm_password.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 270, 30));

        btn_register.setBackground(new java.awt.Color(56, 185, 33));
        btn_register.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 100, 50));

        btn_mainmenu.setBackground(new java.awt.Color(56, 185, 33));
        btn_mainmenu.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btn_mainmenu.setForeground(new java.awt.Color(255, 255, 255));
        btn_mainmenu.setToolTipText("");
        btn_mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainmenuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mainmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 100, 50));

        email.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 260, 30));

        name.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 30, 30));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 120, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/register.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 380, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uIdActionPerformed

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        name.setText(uName.getText().trim());
    }//GEN-LAST:event_uNameActionPerformed

    private void btn_mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainmenuActionPerformed
        new LoginScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_mainmenuActionPerformed

    public void UpdateUserID() {
        int Id = Details.getUserID();
        uId.setText(String.valueOf(Id));
    }


    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed

        UserId = uId.getText();
        Name = name.getText();
        Email = email.getText();
        UserName = uName.getText();
        password = new String(Password.getPassword());
        cPassword = new String(confirm_password.getPassword());
        ValidateDetails();

    }//GEN-LAST:event_btn_registerActionPerformed

    public boolean ValidateDetails() {
        try {
            Validation val = new Validation();
            if (!val.checkNull(uId.getText(), "UserId")) {
                return true;
            }
            if (!val.checkNull(name.getText(), "Name")) {
                return true;
            }
            if (!val.checkNumaric(Name, "Name")) {
                return true;
            }
            if (!val.checkNull(email.getText(), "Email")) {
                return true;
            }
            if (val.checkEmail(Email)) {
            }
            if (!val.checkNull(uName.getText(), "UserName")) {
                return true;
            }
            if (val.checkNull(new String(Password.getPassword()), "Password")) {
                if (val.checkPasswordLength(new String(Password.getPassword()))) {
                }
            }
            if (!val.checkNull(new String(confirm_password.getPassword()), "Confirm Password")) {
                return true;
            }
            if (!val.comfirmPassword(password, cPassword)) {
                return true;
            } else {
                Player insert = new Player();
                int result = insert.insertDetails(UserId, Name, Email, UserName, password);// Insert data to the Player table in DB

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Data Saved Successfully");
                    new LoginScreen().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Data not saved");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please recheck your information");
        }
        return true;
    }


    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void uNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uNameFocusLost
       name.setText(uName.getText().trim());
    }//GEN-LAST:event_uNameFocusLost

    private void confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    public javax.swing.JButton btn_mainmenu;
    private javax.swing.JButton btn_register;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField uId;
    private javax.swing.JTextField uName;
    // End of variables declaration//GEN-END:variables
}
