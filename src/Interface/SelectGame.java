/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import GlorySchema.GameType;
import GlorySchema.ThreadsToUpdateUI.OnlineUser;

/**
 *
 * @author CHAMOD
 */
public class SelectGame extends javax.swing.JFrame {

    GameType game = new GameType();
    public static int gameTypeid = 0;

    public SelectGame() {
        setUndecorated(true);
        initComponents();
//        ShowGrid();
//        getGameData(); // show current Games

        //rdb2Player.setOpaque(false);
//        tblGames.setOpaque(true);
        setLocationRelativeTo(null);
    }

//    private void getGameData() {
//        try {
//            ResultSet rs = null;
//            String data[][] = null;
//
//            rs = game.getGameTypes("");
//            ResultSetMetaData rsmd = rs.getMetaData();
//
//            rs.last();
//            int count = rs.getRow();
//            rs.beforeFirst();
//            data = new String[count][5];
//            int x = 0;
//            while (rs.next()) {
//                Vector v = new Vector();
//                DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) tblGames.getModel();
//                v.add(data[x][0] = rs.getString("gameId"));
//                v.add(data[x][1] = rs.getString("Description"));
//                v.add(data[x][2] = rs.getString("currentPlayers"));
////                v.add(data[x][3] = rs.getString(""));
////                v.add(data[x][4] = rs.getString(""));
//                dtf.addRow(v);
//                //confirm = rs.getInt("confirm");
//                x = x + 1;
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//    private void ShowGrid() {
//        String data[][] = null;
//        String colu[] = new String[]{"Game Id", "Game Type", "Connected players"};
//        DefaultTableModel model = new DefaultTableModel(data, colu) {
//            //@Override
//            public boolean isCellEditable(int x, int y) {
//                if (y == 1) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        };
//
//        tblGames.setModel(model);
//        tblGames.getTableHeader().setPreferredSize(new Dimension(tblGames.getTableHeader().getPreferredSize().width, 35));
//        JTableHeader head = tblGames.getTableHeader();
//        head.setFont(head.getFont().deriveFont(Font.BOLD));
//
//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        // tblGames.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
//
//        // model.setRowCount(20);
//        TableColumn colou10 = tblGames.getColumnModel().getColumn(0);
//        colou10.setMinWidth(80);
//        colou10.setPreferredWidth(80);
//        colou10.setMaxWidth(80);
//
//    }

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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chk2Player = new javax.swing.JRadioButton();
        chk3Player = new javax.swing.JRadioButton();
        chk4Player = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/help.png"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 40, -1));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Select Game ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 150, -1));

        chk2Player.setBackground(null
        );
        buttonGroup1.add(chk2Player);
        chk2Player.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        chk2Player.setText("2 Player");
        chk2Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2PlayerActionPerformed(evt);
            }
        });
        jPanel1.add(chk2Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 220, 80));

        chk3Player.setBackground(null
        );
        buttonGroup1.add(chk3Player);
        chk3Player.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        chk3Player.setText("3 Player");
        chk3Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3PlayerActionPerformed(evt);
            }
        });
        jPanel1.add(chk3Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 220, 80));

        chk4Player.setBackground(null
        );
        buttonGroup1.add(chk4Player);
        chk4Player.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        chk4Player.setText("4 Player");
        chk4Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4PlayerActionPerformed(evt);
            }
        });
        jPanel1.add(chk4Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 220, 80));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 120, 40));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-game-controller-25.png"))); // NOI18N
        jButton1.setText("Play");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 120, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 530));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk3PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk3PlayerActionPerformed

    private void chk4PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk4PlayerActionPerformed

    private void chk2PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2PlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2PlayerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (chk2Player.isSelected()) {
            gameTypeid = 1;
        } else if (chk3Player.isSelected()) {
            gameTypeid = 2;
        } else if (chk4Player.isSelected()) {
            gameTypeid = 3;
        }

        game.connectWithGame(gameTypeid);

        OnlineUser t = new OnlineUser();
        t.start();
        //t.sleepThread();
//        t.shutdown();

//        GameBoardScreen gameBoard = new GameBoardScreen();
//        gameBoard.setVisible(true);
//        this.dispose();
//        ShowGrid();
//        getGameData(); // show current Games

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
//         timer t1=new timer();
// t1.runTheTime();
    }//GEN-LAST:event_jButton1MouseClicked

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SelectGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SelectGame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chk2Player;
    private javax.swing.JRadioButton chk3Player;
    private javax.swing.JRadioButton chk4Player;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
