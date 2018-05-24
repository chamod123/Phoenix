/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import GlorySchema.GameType;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author CHAMOD
 */
public class SelectGame extends javax.swing.JFrame {

    GameType game = new GameType();

    public SelectGame() {
        initComponents();
        ShowGrid();
        getGameData(); // show current Games
        //rdb2Player.setOpaque(false);
        tblGames.setOpaque(true);
    }

    private void getGameData() {
        try {
            ResultSet rs = null;
            String data[][] = null;

            rs = game.getGameTypes("");
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) tblGames.getModel();
                v.add(data[x][0] = rs.getString("PoolId"));
                v.add(data[x][1] = rs.getString("TypeId"));
//                v.add(data[x][2] = rs.getString(""));
//                v.add(data[x][3] = rs.getString(""));
//                v.add(data[x][4] = rs.getString(""));
                dtf.addRow(v);
                //confirm = rs.getInt("confirm");
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ShowGrid() {
        String data[][] = null;
        String colu[] = new String[]{"Game Id", "Game Type", "Connected players"};
        DefaultTableModel model = new DefaultTableModel(data, colu) {
            //@Override
            public boolean isCellEditable(int x, int y) {
                if (y == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        tblGames.setModel(model);
        tblGames.getTableHeader().setPreferredSize(new Dimension(tblGames.getTableHeader().getPreferredSize().width, 35));
        JTableHeader head = tblGames.getTableHeader();
        head.setFont(head.getFont().deriveFont(Font.BOLD));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        // tblGames.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        model.setRowCount(20);
        TableColumn colou10 = tblGames.getColumnModel().getColumn(0);
        colou10.setMinWidth(80);
        colou10.setPreferredWidth(80);
        colou10.setMaxWidth(80);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdb2Player = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGames = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Select the Game Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 290, -1));

        rdb2Player.setBackground(null
        );
        buttonGroup1.add(rdb2Player);
        rdb2Player.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        rdb2Player.setForeground(new java.awt.Color(204, 255, 255));
        rdb2Player.setText("2 Player Game");
        rdb2Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2PlayerActionPerformed(evt);
            }
        });
        jPanel1.add(rdb2Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jRadioButton3.setBackground(null
        );
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(204, 255, 255));
        jRadioButton3.setText("3 Player Game");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jRadioButton4.setBackground(null
        );
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(204, 255, 255));
        jRadioButton4.setText("4 Player Game");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        tblGames.setBackground(new java.awt.Color(204, 128, 59));
        tblGames.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblGames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblGames);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 610, 230));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Current Online Games");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 810, 40));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Play");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 457, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/game.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 3, 830, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void rdb2PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb2PlayerActionPerformed

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
            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb2Player;
    private javax.swing.JTable tblGames;
    // End of variables declaration//GEN-END:variables
}
