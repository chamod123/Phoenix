/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import GlorySchema.GameBoard.GameBoard;
import GlorySchema.GameType;
import GlorySchema.ThreadsToUpdateUI.updateSummary;

/**
 *
 * @author Nipuni
 */
public class SummaryOfGame2 extends javax.swing.JFrame {

    updateSummary t = new updateSummary();
    GameType gametype = new GameType();
    int leaderTOp[] = null;
    int topTot[] = null;

    public SummaryOfGame2() {
//        moved = false;

        setUndecorated(true);
        initComponents();
        btnQuit.setContentAreaFilled(false);
        btnQuit.setBorder(null);
        btnPlayAgain.setContentAreaFilled(false);
        btnPlayAgain.setBorder(null);
        setLocationRelativeTo(null);
       // setLocationRelativeTo(null);

        // player2.setBorder( null );
        // player2.setOpaque(false);
        // player2.setVisible(false);
        // ShowGrid();
        t.start();
        t.sleepThread();
        t.shutdown();
//        getTopTot();
        //sort() ;
        // summaryTbl.setOpaque(true);
    }

    /**
     * Creates new form SummaryOfGame
     *
     * /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPlayAgain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        txtName0 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        level5score1 = new javax.swing.JLabel();
        level4score1 = new javax.swing.JLabel();
        level3score1 = new javax.swing.JLabel();
        level2score1 = new javax.swing.JLabel();
        level1score1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtWon = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        level1score0 = new javax.swing.JLabel();
        level2score0 = new javax.swing.JLabel();
        level3score0 = new javax.swing.JLabel();
        level4score0 = new javax.swing.JLabel();
        level5score0 = new javax.swing.JLabel();
        total0 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPlayAgain.setBackground(new java.awt.Color(0, 255, 0));
        btnPlayAgain.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnPlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayAgain.setText("PLAY AGAIN");
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 170, 40));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 70, 80));

        btnQuit.setBackground(new java.awt.Color(56, 185, 33));
        btnQuit.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-shutdown-25.png"))); // NOI18N
        btnQuit.setText("QUIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 160, 40));

        txtName0.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtName0.setForeground(new java.awt.Color(0, 0, 255));
        txtName0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName0.setText("name 1");
        jPanel1.add(txtName0, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 200, 23));

        txtName1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtName1.setForeground(new java.awt.Color(0, 0, 255));
        txtName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName1.setText("name 1");
        jPanel1.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 200, 23));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 80, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/1st.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 110, 130));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/2nd.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, 130));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LEVEL 1 -");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 86, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LEVEL 2 -");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 86, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("LEVEL 3 -");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 86, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LEVEL 4 -");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 86, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("LEVEL 5 -");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 86, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TOTAL   -");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 86, -1));

        total1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total1.setForeground(new java.awt.Color(51, 0, 51));
        total1.setText("Total");
        jPanel1.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 71, -1));

        level5score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level5score1.setForeground(new java.awt.Color(0, 255, 0));
        level5score1.setText("Level 5 ");
        jPanel1.add(level5score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 71, -1));

        level4score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level4score1.setForeground(new java.awt.Color(0, 255, 0));
        level4score1.setText("Level 4 ");
        jPanel1.add(level4score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 71, -1));

        level3score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level3score1.setForeground(new java.awt.Color(0, 255, 0));
        level3score1.setText("Level 3 ");
        jPanel1.add(level3score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 71, -1));

        level2score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level2score1.setForeground(new java.awt.Color(0, 255, 0));
        level2score1.setText("Level 2 ");
        jPanel1.add(level2score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 71, -1));

        level1score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level1score1.setForeground(new java.awt.Color(0, 255, 0));
        level1score1.setText("Level 1");
        jPanel1.add(level1score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 71, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LEVEL 1 -");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 86, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LEVEL 2 -");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 86, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LEVEL 3 -");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 86, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LEVEL 4 -");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 86, -1));

        txtWon.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        txtWon.setForeground(new java.awt.Color(0, 0, 153));
        txtWon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWon.setText("SUMMARY");
        jPanel1.add(txtWon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 340, 40));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LEVEL 5 -");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 86, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TOTAL   -");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 86, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/summary.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        level1score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level1score0.setForeground(new java.awt.Color(51, 255, 0));
        level1score0.setText("Level 1");
        jPanel1.add(level1score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        level2score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level2score0.setForeground(new java.awt.Color(51, 255, 0));
        level2score0.setText("Level 2 ");
        jPanel1.add(level2score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        level3score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level3score0.setForeground(new java.awt.Color(51, 255, 0));
        level3score0.setText("Level 3 ");
        jPanel1.add(level3score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        level4score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level4score0.setForeground(new java.awt.Color(51, 255, 0));
        level4score0.setText("Level 4 ");
        jPanel1.add(level4score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        level5score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level5score0.setForeground(new java.awt.Color(51, 255, 0));
        level5score0.setText("Level 5 ");
        jPanel1.add(level5score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        total0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total0.setForeground(new java.awt.Color(51, 0, 51));
        total0.setText("Total ");
        jPanel1.add(total0, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/summary.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hbd.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 490, 460));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hbd.gif"))); // NOI18N
        jLabel20.setText("jLabel6");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 490, 420));

        jLabel28.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        SelectGame selectgame = new SelectGame();
        selectgame.setVisible(true);
        gametype.deleteTable();
        GameBoard.levelNo=1;
        this.dispose();
    }//GEN-LAST:event_btnPlayAgainActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed

        gametype.deleteTable();
        this.dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

//    private void ShowGrid() {
//        String data[][] = null;
//
//        String colu[] = new String[]{"Rank", "Player", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Total"};
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
//        summaryTbl.setModel(model);
//        summaryTbl.getTableHeader().setPreferredSize(new Dimension(summaryTbl.getTableHeader().getPreferredSize().width, 35));
//        JTableHeader head = summaryTbl.getTableHeader();
//        head.setFont(head.getFont().deriveFont(Font.BOLD));
//
//        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
//        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
//        // tblGames.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
//
//        // model.setRowCount(20);
//        TableColumn colou10 = summaryTbl.getColumnModel().getColumn(0);
//        colou10.setMinWidth(80);
//        colou10.setPreferredWidth(80);
//        colou10.setMaxWidth(80);
//
//    }
//    private void getTopTot() {
//        try {
//            ResultSet rs = null;
//
//            rs = summary.getTopScore();
//            ResultSetMetaData rsmd = rs.getMetaData();
//
//            rs.last();
//            int count = rs.getRow();
//            rs.beforeFirst();
//            topTot = new int[count];
//            int x = 0;
//            while (rs.next()) {
//                Vector v = new Vector();
//
//                v.add(topTot[x] = rs.getInt("Total"));
//                //confirm = rs.getInt("confirm");
//                x = x + 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    private void getLeaderTop() {
//        try {
//            ResultSet rs = null;
//
//            rs = summary.getLeaderTopScore();
//            ResultSetMetaData rsmd = rs.getMetaData();
//
//            rs.last();
//            int count = rs.getRow();
//            rs.beforeFirst();
//            leaderTOp = new int[count];
//            int x = 0;
//            while (rs.next()) {
//                Vector v = new Vector();
//
//                v.add(leaderTOp[x] = rs.getInt("Score"));
//                //confirm = rs.getInt("confirm");
//                x = x + 1;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }

    /* public void sort() 
    {
    int n = topTot.length;
    int m= leaderTOp.length;
    for (int i = 1; i < n; i++)
    {
        for (int j = i; j > 0; j--)
        {
            if (topTot[i] > leaderTOp[j])
            {
               topTot[i]=leaderTOp[j];
                 
            }
                
            else break;
        }
    }
}*/
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
//            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SummaryOfGame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JButton btnQuit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel level1score0;
    public static javax.swing.JLabel level1score1;
    public static javax.swing.JLabel level2score0;
    public static javax.swing.JLabel level2score1;
    public static javax.swing.JLabel level3score0;
    public static javax.swing.JLabel level3score1;
    public static javax.swing.JLabel level4score0;
    public static javax.swing.JLabel level4score1;
    public static javax.swing.JLabel level5score0;
    public static javax.swing.JLabel level5score1;
    public static javax.swing.JLabel total0;
    public static javax.swing.JLabel total1;
    public static javax.swing.JLabel txtName0;
    public static javax.swing.JLabel txtName1;
    public static javax.swing.JLabel txtWon;
    // End of variables declaration//GEN-END:variables
}
