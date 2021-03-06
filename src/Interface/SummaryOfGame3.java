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
public class SummaryOfGame3 extends javax.swing.JFrame {

    updateSummary t = new updateSummary();
    GameType gametype = new GameType();

    int leaderTOp[] = null;
    int topTot[] = null;

    public SummaryOfGame3() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        btnQuit.setContentAreaFilled(false);
        btnQuit.setBorder(null);
        btnPlayAgain.setContentAreaFilled(false);
        btnPlayAgain.setBorder(null);
        t.start();
        t.sleepThread();
        t.shutdown();
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

        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btnPlayAgain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        txtName2 = new javax.swing.JLabel();
        txtName0 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        level1score0 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        level2score0 = new javax.swing.JLabel();
        level3score0 = new javax.swing.JLabel();
        level4score0 = new javax.swing.JLabel();
        level5score0 = new javax.swing.JLabel();
        total0 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        level1score2 = new javax.swing.JLabel();
        level2score2 = new javax.swing.JLabel();
        level3score2 = new javax.swing.JLabel();
        level4score2 = new javax.swing.JLabel();
        level5score2 = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtWon = new javax.swing.JLabel();

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hbd.gif"))); // NOI18N
        jLabel37.setText("jLabel6");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 490, 420));

        btnPlayAgain.setBackground(new java.awt.Color(0, 255, 0));
        btnPlayAgain.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnPlayAgain.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayAgain.setText("PLAY AGAIN");
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 150, 40));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        btnQuit.setBackground(new java.awt.Color(56, 185, 33));
        btnQuit.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-shutdown-25.png"))); // NOI18N
        btnQuit.setText("QUIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 150, 40));

        txtName2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtName2.setForeground(new java.awt.Color(0, 0, 255));
        txtName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName2.setText("name 1");
        jPanel1.add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 190, 23));

        txtName0.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtName0.setForeground(new java.awt.Color(0, 0, 255));
        txtName0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName0.setText("name 1");
        jPanel1.add(txtName0, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 200, 23));

        txtName1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txtName1.setForeground(new java.awt.Color(0, 0, 255));
        txtName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName1.setText("name 1");
        jPanel1.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 200, 23));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 80, 80));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/3rd.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/1st.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 110, 130));

        level1score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level1score0.setForeground(new java.awt.Color(51, 255, 0));
        level1score0.setText("Level 1");
        jPanel1.add(level1score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 71, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LEVEL 1 -");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 86, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LEVEL 2 -");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 86, -1));

        level2score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level2score0.setForeground(new java.awt.Color(51, 255, 0));
        level2score0.setText("Level 2 ");
        jPanel1.add(level2score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 71, -1));

        level3score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level3score0.setForeground(new java.awt.Color(51, 255, 0));
        level3score0.setText("Level 3 ");
        jPanel1.add(level3score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 71, -1));

        level4score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level4score0.setForeground(new java.awt.Color(51, 255, 0));
        level4score0.setText("Level 4 ");
        jPanel1.add(level4score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 71, -1));

        level5score0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level5score0.setForeground(new java.awt.Color(51, 255, 0));
        level5score0.setText("Level 5 ");
        jPanel1.add(level5score0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 71, -1));

        total0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total0.setForeground(new java.awt.Color(51, 0, 51));
        total0.setText("Total ");
        jPanel1.add(total0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 71, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TOTAL   -");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 86, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LEVEL 5 -");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 86, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LEVEL 4 -");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 86, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("LEVEL 1 -");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 86, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LEVEL 2 -");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 86, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("LEVEL 3 -");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 86, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LEVEL 4 -");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 86, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("LEVEL 5 -");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 86, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TOTAL   -");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 86, -1));

        total1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total1.setForeground(new java.awt.Color(51, 0, 51));
        total1.setText("Total");
        jPanel1.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 71, -1));

        level5score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level5score1.setForeground(new java.awt.Color(0, 255, 0));
        level5score1.setText("Level 5 ");
        jPanel1.add(level5score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 71, -1));

        level4score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level4score1.setForeground(new java.awt.Color(0, 255, 0));
        level4score1.setText("Level 4 ");
        jPanel1.add(level4score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 71, -1));

        level3score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level3score1.setForeground(new java.awt.Color(0, 255, 0));
        level3score1.setText("Level 3 ");
        jPanel1.add(level3score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 71, -1));

        level2score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level2score1.setForeground(new java.awt.Color(0, 255, 0));
        level2score1.setText("Level 2 ");
        jPanel1.add(level2score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 71, -1));

        level1score1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level1score1.setForeground(new java.awt.Color(0, 255, 0));
        level1score1.setText("Level 1");
        jPanel1.add(level1score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 71, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LEVEL 3 -");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 86, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/2nd.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 110, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/summary.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("LEVEL 1 -");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 86, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("LEVEL 2 -");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 86, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("LEVEL 3 -");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 86, -1));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("LEVEL 4 -");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 86, -1));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("LEVEL 5 -");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 86, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("TOTAL   -");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 86, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/summary.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        level1score2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level1score2.setForeground(new java.awt.Color(0, 255, 0));
        level1score2.setText("Level 1");
        jPanel1.add(level1score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        level2score2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level2score2.setForeground(new java.awt.Color(0, 255, 0));
        level2score2.setText("Level 2");
        jPanel1.add(level2score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        level3score2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level3score2.setForeground(new java.awt.Color(0, 255, 0));
        level3score2.setText("Level 3");
        jPanel1.add(level3score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        level4score2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level4score2.setForeground(new java.awt.Color(0, 255, 0));
        level4score2.setText("Level 4");
        jPanel1.add(level4score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        level5score2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level5score2.setForeground(new java.awt.Color(0, 255, 0));
        level5score2.setText("Level 5 ");
        jPanel1.add(level5score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        total2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total2.setForeground(new java.awt.Color(51, 0, 51));
        total2.setText("Total ");
        jPanel1.add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/summary.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hbd.gif"))); // NOI18N
        jLabel38.setText("jLabel6");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 490, 420));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        txtWon.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        txtWon.setForeground(new java.awt.Color(0, 0, 153));
        txtWon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWon.setText("SUMMARY");
        jPanel1.add(txtWon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel level1score0;
    public static javax.swing.JLabel level1score1;
    public static javax.swing.JLabel level1score2;
    public static javax.swing.JLabel level2score0;
    public static javax.swing.JLabel level2score1;
    public static javax.swing.JLabel level2score2;
    public static javax.swing.JLabel level3score0;
    public static javax.swing.JLabel level3score1;
    public static javax.swing.JLabel level3score2;
    public static javax.swing.JLabel level4score0;
    public static javax.swing.JLabel level4score1;
    public static javax.swing.JLabel level4score2;
    public static javax.swing.JLabel level5score0;
    public static javax.swing.JLabel level5score1;
    public static javax.swing.JLabel level5score2;
    public static javax.swing.JLabel total0;
    public static javax.swing.JLabel total1;
    public static javax.swing.JLabel total2;
    public static javax.swing.JLabel txtName0;
    public static javax.swing.JLabel txtName1;
    public static javax.swing.JLabel txtName2;
    public static javax.swing.JLabel txtWon;
    // End of variables declaration//GEN-END:variables
}
