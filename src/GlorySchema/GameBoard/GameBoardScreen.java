/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.GameBoard;

import GlorySchema.Score;
import GlorySchema.ThreadsToUpdateUI.updateGameBoard;
import GlorySchema.UpdateUI;
import GlorySchema.WordSearch;
import Interface.GameResult;
import Interface.SummaryOfGame;
import java.util.Timer;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author deela
 */
public class GameBoardScreen extends javax.swing.JFrame {
    GameBoard G = new GameBoard();
    Score score = new Score();
    
 //   UpdateUI updateUI =new UpdateUI();
    /**
     * Creates new form GameBoard
     */
    public GameBoardScreen() {
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        setSize(1100, 630);
        setLocationRelativeTo(null);
        initComponents();
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tblScoreBoard.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        
        GameBoard G = new GameBoard();
        G.getInitialLetter();
        String x = String.valueOf(G.getInitialLetter1());
        btnFirst.setText(x);
        String y = String.valueOf(G.getInitialLetter2());
        btnSecond.setText(y);
        String z = String.valueOf(G.getInitialLetter3());
        btnThird.setText(z);
        
        G.saveInitialLetters(x,y,z);

    updateGameBoard t = new updateGameBoard();
    t.start();
    t.sleepThread();
    t.shutdown();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtMainWord = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        player1L = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player3L = new javax.swing.JLabel();
        player4L = new javax.swing.JLabel();
        player2L = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnThird = new javax.swing.JButton();
        btnForth = new javax.swing.JButton();
        btnFifth = new javax.swing.JButton();
        btnSixth = new javax.swing.JButton();
        btnSeventh = new javax.swing.JButton();
        btnEighth = new javax.swing.JButton();
        btnNineth = new javax.swing.JButton();
        btnTenth = new javax.swing.JButton();
        btnEleventh = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnSecond = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tblScoreBoard = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEXT LETTER");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 250, 50));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 580, 120, 40));

        jPanel2.setBackground(new java.awt.Color(153, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("03.59");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 140, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORE BOARD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("VOWEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 150, 40));

        txtMainWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMainWordActionPerformed(evt);
            }
        });
        jPanel1.add(txtMainWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 820, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GAME TIME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 110, 30));

        jPanel4.setBackground(new java.awt.Color(153, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("MIKE");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PLAYER NAME");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLAYER NAME");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MainMenu");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 120, 40));

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("CONSTANT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 150, 40));

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("MainMenu");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 120, 40));

        jPanel5.setBackground(new java.awt.Color(102, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Initial Letters"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player1L.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player1L, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 40));

        player3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 40));

        player2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 130, 40));

        player4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 110, 40));

        player1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        player3L.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player3L, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 60, 40));

        player4L.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player4L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 60, 40));

        player2L.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel5.add(player2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1080, 50));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        btnThird.setBackground(new java.awt.Color(255, 204, 0));
        btnThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdActionPerformed(evt);
            }
        });
        jPanel1.add(btnThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 50, 50));

        btnForth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForthActionPerformed(evt);
            }
        });
        jPanel1.add(btnForth, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 50, 50));

        btnFifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFifthActionPerformed(evt);
            }
        });
        jPanel1.add(btnFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 50, 50));

        btnSixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixthActionPerformed(evt);
            }
        });
        jPanel1.add(btnSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 50, 50));

        btnSeventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeventhActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 50, 50));

        btnEighth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEighthActionPerformed(evt);
            }
        });
        jPanel1.add(btnEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 50, 50));

        btnNineth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNinethActionPerformed(evt);
            }
        });
        jPanel1.add(btnNineth, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 50, 50));

        btnTenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenthActionPerformed(evt);
            }
        });
        jPanel1.add(btnTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 50, 50));

        btnEleventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleventhActionPerformed(evt);
            }
        });
        jPanel1.add(btnEleventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 50, 50));

        btnFirst.setBackground(new java.awt.Color(255, 204, 0));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 50, 50));

        btnSecond.setBackground(new java.awt.Color(255, 204, 0));
        btnSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondActionPerformed(evt);
            }
        });
        jPanel1.add(btnSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, 50));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 420));

        tblScoreBoard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "Title 2"
            }
        ));
        jPanel1.add(tblScoreBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 44, 170, 80));

        jButton6.setBackground(new java.awt.Color(0, 204, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("GO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 90, 70));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
       String Y= txtMainWord.getText().toString();
        String X = btnFirst.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnFirst.setEnabled(false);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String x; 
                  

        if(btnForth.getText().trim()=="" || btnForth.getText()==null){
        G.getVowel();
         x = String.valueOf(G.getSelectedVowel()); 
         btnForth.setText(x);
             
         }
        else if(btnFifth.getText().trim()=="" || btnFifth.getText()==null){
         G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnFifth.setText(x);
        }
       else if(btnSixth.getText().trim()=="" || btnSixth.getText()==null){
          G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnSixth.setText(x);
        }
        else if(btnSeventh.getText().trim()=="" || btnSeventh.getText()==null){
         G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnSeventh.setText(x);
        }
        else if(btnEighth.getText().trim()=="" || btnEighth.getText()==null){
         G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnEighth.setText(x);
        }
        else if(btnNineth.getText().trim()=="" || btnNineth.getText()==null){
         G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnNineth.setText(x);
        }
        else if(btnTenth.getText().trim()=="" || btnTenth.getText()==null){
         G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnTenth.setText(x);
        }
        else if(btnEleventh.getText().trim()=="" || btnEleventh.getText()==null){
         G.getVowel();
          x = String.valueOf(G.getSelectedVowel()); 
         btnEleventh.setText(x);
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnThird.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnThird.setEnabled(false);
    }//GEN-LAST:event_btnThirdActionPerformed

    private void txtMainWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMainWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMainWordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GameBoard G = new GameBoard();
        String x; 
                  

        if(btnForth.getText().trim()=="" || btnForth.getText()==null){
        G.getConstent();
         x = String.valueOf(G.getSelectedConst()); 
         btnForth.setText(x);
             
         }
        else if(btnFifth.getText().trim()=="" || btnFifth.getText()==null){
         G.getConstent();
         x = String.valueOf(G.getSelectedConst()); 
         btnFifth.setText(x);
        }
       else if(btnSixth.getText().trim()=="" || btnSixth.getText()==null){
          G.getConstent();
         x = String.valueOf(G.getSelectedConst()); 
         btnSixth.setText(x);
        }
        else if(btnSeventh.getText().trim()=="" || btnSeventh.getText()==null){
         G.getConstent();
         x = String.valueOf(G.getSelectedConst()); 
         btnSeventh.setText(x);
        }
        else if(btnEighth.getText().trim()=="" || btnEighth.getText()==null){
        G.getConstent();
         x = String.valueOf(G.getSelectedConst());  
         btnEighth.setText(x);
        }
        else if(btnNineth.getText().trim()=="" || btnNineth.getText()==null){
        G.getConstent();
         x = String.valueOf(G.getSelectedConst()); 
         btnNineth.setText(x);
        }
        else if(btnTenth.getText().trim()=="" || btnTenth.getText()==null){
         G.getConstent();
         x = String.valueOf(G.getSelectedConst()); 
         btnTenth.setText(x);
        }
        else if(btnEleventh.getText().trim()=="" || btnEleventh.getText()==null){
         G.getConstent();
         x = String.valueOf(G.getSelectedConst());  
         btnEleventh.setText(x);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnSecond.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnSecond.setEnabled(false);
        
    }//GEN-LAST:event_btnSecondActionPerformed

    private void btnForthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForthActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnForth.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnForth.setEnabled(false);
    }//GEN-LAST:event_btnForthActionPerformed

    private void btnFifthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFifthActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnFifth.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnFifth.setEnabled(false);
    }//GEN-LAST:event_btnFifthActionPerformed

    private void btnSixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixthActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnSixth.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnSixth.setEnabled(false);
    }//GEN-LAST:event_btnSixthActionPerformed

    private void btnSeventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeventhActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnSeventh.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnSeventh.setEnabled(false);
    }//GEN-LAST:event_btnSeventhActionPerformed

    private void btnEighthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEighthActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnEighth.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnEighth.setEnabled(false);
    }//GEN-LAST:event_btnEighthActionPerformed

    private void btnNinethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNinethActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnNineth.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnNineth.setEnabled(false);
    }//GEN-LAST:event_btnNinethActionPerformed

    private void btnTenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenthActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnTenth.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnTenth.setEnabled(false);
    }//GEN-LAST:event_btnTenthActionPerformed

    private void btnEleventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleventhActionPerformed
        // TODO add your handling code here:
        String Y= txtMainWord.getText().toString();
        String X = btnEleventh.getText().toString();
        String Z = Y.concat(X);
        txtMainWord.setText(Z);
        btnEleventh.setEnabled(false);
    }//GEN-LAST:event_btnEleventhActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        WordSearch w = new WordSearch();
        w.setWord(txtMainWord.getText());
        w.matchWord();
        System.out.println("Debug word" + w.isCheckSpell());
        if(w.isCheckSpell()==true){
        score.getTotalScore(txtMainWord.getText().trim(), btnFirst.getText().trim(), btnSecond.getText().trim(), btnThird.getText().trim(),w.isCheckSpell() );
        GameBoard.levelNo += 1;
         
      
        if(GameBoard.levelNo>5){
            SummaryOfGame summary= new SummaryOfGame();
            summary.setVisible(true);
            this.dispose();
        }
        else{
           //level result 
           GameResult result= new GameResult();
           result.setVisible(true);
           this.dispose();
           
        }
        
        }else{
           // JOptionPane.showMessageDialog(rootPane, "Wrong word");
             score.getTotalScore(txtMainWord.getText().trim(), btnFirst.getText().trim(), btnSecond.getText().trim(), btnThird.getText().trim(),w.isCheckSpell());
             GameBoard.levelNo += 1;
            if(GameBoard.levelNo>5){
            SummaryOfGame summary= new SummaryOfGame();
            summary.setVisible(true);
            this.dispose();
        }
        else{
           //level result 
           GameResult result= new GameResult();
           result.setVisible(true);
           this.dispose();
           
        }
         }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoardScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEighth;
    private javax.swing.JButton btnEleventh;
    private javax.swing.JButton btnFifth;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnForth;
    private javax.swing.JButton btnNineth;
    private javax.swing.JButton btnSecond;
    private javax.swing.JButton btnSeventh;
    private javax.swing.JButton btnSixth;
    private javax.swing.JButton btnTenth;
    private javax.swing.JButton btnThird;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel player1;
    public static javax.swing.JLabel player1L;
    public static javax.swing.JLabel player2;
    public static javax.swing.JLabel player2L;
    public static javax.swing.JLabel player3;
    public static javax.swing.JLabel player3L;
    public static javax.swing.JLabel player4;
    public static javax.swing.JLabel player4L;
    public static javax.swing.JTable tblScoreBoard;
    private javax.swing.JTextField txtMainWord;
    // End of variables declaration//GEN-END:variables
}
