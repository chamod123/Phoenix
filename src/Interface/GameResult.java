/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import GlorySchema.GameBoard.GameBoardScreen;
import GlorySchema.GameBoard.GameBoard;
import GlorySchema.ThreadsToUpdateUI.updateGameResult;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author MELANI
 */
public class GameResult extends javax.swing.JFrame {

    public GameResult() {
//        moved = false;
        setUndecorated(true);
        initComponents();
        player0.setVisible(false);
        levelScore0.setVisible(false);
        total0.setVisible(false);
        player1.setVisible(false);
        levelScore1.setVisible(false);
        total1.setVisible(false);
        player2.setVisible(false);
        levelScore2.setVisible(false);
        total2.setVisible(false);
        player3.setVisible(false);
        levelScore3.setVisible(false);
        total3.setVisible(false);
        btnNext.setContentAreaFilled( false );
        btnNext.setBorder( null );
        //set visible false for all lable
        setLocationRelativeTo(null);
//        tblGames.setBorder( null );
//        tblGames.setOpaque(false);
//
//        //ShowGrid();
//        tblGames.setOpaque(true);
        levelScore.setText("Level " + (GameBoard.levelNo - 1) + " Score");

        updateGameResult t = new updateGameResult();
        t.start();
        t.sleepThread();
        t.shutdown();
    }

//    public void getLevelRanking() {
//        Results results = new Results();
//         try {
//            ResultSet rs = null;
//            String data[][] = null;
//
//            rs = results.getRanking(GameBord.levelNo-1);
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
//                v.add(data[x][0] = rs.getString("Name"));
//                v.add(data[x][1] = rs.getString("Level"+(GameBord.levelNo-1)+"Score"));
//                v.add(data[x][2] = rs.getString("Total"));
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
//        
//    }
//    private void ShowGrid() {
//        String data[][] = null;
//        String colu[] = new String[]{"Player", "Level Score", "Total"};
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
//        tblGames.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
//        tblGames.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
//        tblGames.setShowGrid(false);
//        tblGames.setBorder( null );
//        tblGames.setOpaque(false);
//        // model.setRowCount(20);
//        TableColumn col0 = tblGames.getColumnModel().getColumn(1);
//        col0.setMinWidth(40);
//        col0.setPreferredWidth(40);
//        col0.setMaxWidth(40);
//
//        TableColumn col1 = tblGames.getColumnModel().getColumn(1);
//        col1.setMinWidth(40);
//        col1.setPreferredWidth(40);
//        col1.setMaxWidth(40);
//
//        TableColumn col2 = tblGames.getColumnModel().getColumn(2);
//        col2.setMinWidth(40);
//        col2.setPreferredWidth(40);
//        col2.setMaxWidth(40);
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
        levelScore = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player0 = new javax.swing.JLabel();
        levelScore0 = new javax.swing.JLabel();
        levelScore1 = new javax.swing.JLabel();
        levelScore2 = new javax.swing.JLabel();
        levelScore3 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        total3 = new javax.swing.JLabel();
        total0 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        levelScore.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        levelScore.setForeground(new java.awt.Color(0, 0, 153));
        levelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelScore.setText("SCORE");
        jPanel1.add(levelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 50, 50));

        player1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        player1.setText("jLabel1");
        jPanel1.add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, -1));

        player2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        player2.setText("jLabel1");
        jPanel1.add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, -1));

        player3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player3.setForeground(new java.awt.Color(255, 255, 255));
        player3.setText("jLabel1");
        jPanel1.add(player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 140, -1));

        player0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        player0.setForeground(new java.awt.Color(255, 255, 255));
        player0.setText("player1");
        jPanel1.add(player0, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 120, -1));

        levelScore0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        levelScore0.setForeground(new java.awt.Color(255, 255, 255));
        levelScore0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelScore0.setText("level1");
        jPanel1.add(levelScore0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 60, -1));

        levelScore1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        levelScore1.setForeground(new java.awt.Color(255, 255, 255));
        levelScore1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelScore1.setText("jLabel1");
        jPanel1.add(levelScore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 60, -1));

        levelScore2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        levelScore2.setForeground(new java.awt.Color(255, 255, 255));
        levelScore2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelScore2.setText("jLabel1");
        jPanel1.add(levelScore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 60, -1));

        levelScore3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        levelScore3.setForeground(new java.awt.Color(255, 255, 255));
        levelScore3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        levelScore3.setText("jLabel1");
        jPanel1.add(levelScore3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 60, -1));

        total1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total1.setForeground(new java.awt.Color(255, 255, 255));
        total1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total1.setText("jLabel1");
        jPanel1.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 50, -1));

        total2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total2.setForeground(new java.awt.Color(255, 255, 255));
        total2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total2.setText("jLabel1");
        jPanel1.add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 50, -1));

        total3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total3.setForeground(new java.awt.Color(255, 255, 255));
        total3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total3.setText("jLabel1");
        jPanel1.add(total3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 60, -1));

        total0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total0.setForeground(new java.awt.Color(255, 255, 255));
        total0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total0.setText("total");
        jPanel1.add(total0, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 50, -1));

        btnNext.setBackground(new java.awt.Color(0, 204, 255));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/result.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallleaves.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/smallleaves.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if ((GameBoard.levelNo - 1) < 5) {
            GameBoardScreen gameBoard = new GameBoardScreen();
            gameBoard.setVisible(true);
            this.dispose();
        } else {
            SummaryOfGame summary = new SummaryOfGame();
            summary.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnNextActionPerformed

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
//            java.util.logging.Logger.getLogger(GameResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GameResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GameResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GameResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GameResult().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel levelScore;
    public static javax.swing.JLabel levelScore0;
    public static javax.swing.JLabel levelScore1;
    public static javax.swing.JLabel levelScore2;
    public static javax.swing.JLabel levelScore3;
    public static javax.swing.JLabel player0;
    public static javax.swing.JLabel player1;
    public static javax.swing.JLabel player2;
    public static javax.swing.JLabel player3;
    public static javax.swing.JLabel total0;
    public static javax.swing.JLabel total1;
    public static javax.swing.JLabel total2;
    public static javax.swing.JLabel total3;
    // End of variables declaration//GEN-END:variables
}
