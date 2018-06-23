/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.GameBoard;

import GlorySchema.Score;
import static GlorySchema.ThreadsToUpdateUI.AllPlayerDone.moved;
import GlorySchema.ThreadsToUpdateUI.updateGameBoard;
import GlorySchema.timer;
import Interface.LoginScreen;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author deela
 */
public class GameBoardScreen extends javax.swing.JFrame {

    GameBoard G = new GameBoard();
    Score score = new Score();
    int counter = 10;
    boolean isIt = false;

    //   UpdateUI updateUI =new UpdateUI();
    /**
     * Creates new form GameBoard
     */
    public GameBoardScreen() {
        moved = false;
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tblScoreBoard.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);

        // get the initial letter to player
        G.getInitialLetter();
        String x = String.valueOf(G.getInitialLetter1());
        btnFirst.setText(x);
        String y = String.valueOf(G.getInitialLetter2());
        btnSecond.setText(y);
        String z = String.valueOf(G.getInitialLetter3());
        btnThird.setText(z);

        G.saveInitialLetters(x, y, z);

        updateGameBoard t = new updateGameBoard();
        t.start();
        t.sleepThread();
        t.shutdown();

        (new Thread(new timer())).start();

        txtName.setText(LoginScreen.PlayerName);
//        timer t1 = new timer();

//        t1.runTheTime();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtMainWord = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
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
        tblScoreBoard = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEXT LETTER");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 250, 50));

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("s");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 30, 40));

        txtTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTime.setText("180");
        jPanel2.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 140, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORE BOARD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("VOWEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 120, 40));

        txtMainWord.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        txtMainWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMainWordActionPerformed(evt);
            }
        });
        jPanel1.add(txtMainWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 720, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GAME TIME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 110, 30));

        jPanel4.setBackground(new java.awt.Color(153, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("MIKE");
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 40));

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton4.setText("CONSTANT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 120, 40));

        jPanel5.setBackground(new java.awt.Color(171, 19, 19));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Initial Letters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 50));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        btnThird.setBackground(new java.awt.Color(255, 204, 0));
        btnThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdActionPerformed(evt);
            }
        });
        jPanel1.add(btnThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 50, 50));

        btnForth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForthActionPerformed(evt);
            }
        });
        jPanel1.add(btnForth, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 50, 50));

        btnFifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFifthActionPerformed(evt);
            }
        });
        jPanel1.add(btnFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 50, 50));

        btnSixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixthActionPerformed(evt);
            }
        });
        jPanel1.add(btnSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 50, 50));

        btnSeventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeventhActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 50, 50));

        btnEighth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEighthActionPerformed(evt);
            }
        });
        jPanel1.add(btnEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 50, 50));

        btnNineth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNinethActionPerformed(evt);
            }
        });
        jPanel1.add(btnNineth, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 50, 50));

        btnTenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenthActionPerformed(evt);
            }
        });
        jPanel1.add(btnTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 50, 50));

        btnEleventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleventhActionPerformed(evt);
            }
        });
        jPanel1.add(btnEleventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 220, 50, 50));

        btnFirst.setBackground(new java.awt.Color(255, 204, 0));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 50, 50));

        btnSecond.setBackground(new java.awt.Color(255, 204, 0));
        btnSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondActionPerformed(evt);
            }
        });
        jPanel1.add(btnSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 50, 50));

        tblScoreBoard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "Title 2"
            }
        ));
        jPanel1.add(tblScoreBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 44, 170, 80));

        jButton6.setBackground(new java.awt.Color(0, 204, 255));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-ok-25.png"))); // NOI18N
        jButton6.setText("Done");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 490, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-euro-money-100.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 100, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        txtMainWord.setText(txtMainWord.getText() + btnFirst.getText());
        btnFirst.setEnabled(false);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String x;

        if ("".equals(btnForth.getText().trim()) || btnForth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnForth.setText(x);

        } else if ("".equals(btnFifth.getText().trim()) || btnFifth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnFifth.setText(x);
        } else if ("".equals(btnSixth.getText().trim()) || btnSixth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnSixth.setText(x);
        } else if ("".equals(btnSeventh.getText().trim()) || btnSeventh.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnSeventh.setText(x);
        } else if ("".equals(btnEighth.getText().trim()) || btnEighth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnEighth.setText(x);
        } else if ("".equals(btnNineth.getText().trim()) || btnNineth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnNineth.setText(x);
        } else if ("".equals(btnTenth.getText().trim()) || btnTenth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnTenth.setText(x);
        } else if ("".equals(btnEleventh.getText().trim()) || btnEleventh.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnEleventh.setText(x);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdActionPerformed
        txtMainWord.setText(txtMainWord.getText() + btnThird.getText());
        btnThird.setEnabled(false);
    }//GEN-LAST:event_btnThirdActionPerformed

    private void txtMainWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMainWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMainWordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GameBoard G = new GameBoard();
        String x;

        if ("".equals(btnForth.getText().trim()) || btnForth.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnForth.setText(x);

        } else if ("".equals(btnFifth.getText().trim()) || btnFifth.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnFifth.setText(x);
        } else if ("".equals(btnSixth.getText().trim()) || btnSixth.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnSixth.setText(x);
        } else if ("".equals(btnSeventh.getText().trim()) || btnSeventh.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnSeventh.setText(x);
        } else if ("".equals(btnEighth.getText().trim()) || btnEighth.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnEighth.setText(x);
        } else if ("".equals(btnNineth.getText().trim()) || btnNineth.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnNineth.setText(x);
        } else if ("".equals(btnTenth.getText().trim()) || btnTenth.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnTenth.setText(x);
        } else if ("".equals(btnEleventh.getText().trim()) || btnEleventh.getText() == null) {
            G.getConstent();
            x = String.valueOf(G.getSelectedConst());
            btnEleventh.setText(x);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondActionPerformed
        txtMainWord.setText(txtMainWord.getText() + btnSecond.getText());
        btnSecond.setEnabled(false);

    }//GEN-LAST:event_btnSecondActionPerformed

    private void btnForthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForthActionPerformed
        if (!"".equals(btnForth.getText().trim()) || btnForth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnForth.getText());
            btnForth.setEnabled(false);
        }
    }//GEN-LAST:event_btnForthActionPerformed

    private void btnFifthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFifthActionPerformed
        if (!"".equals(btnFifth.getText().trim()) || btnFifth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnFifth.getText());
            btnFifth.setEnabled(false);
        }
    }//GEN-LAST:event_btnFifthActionPerformed

    private void btnSixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixthActionPerformed
        if (!"".equals(btnSixth.getText().trim()) || btnSixth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnSixth.getText());
            btnSixth.setEnabled(false);
        }
    }//GEN-LAST:event_btnSixthActionPerformed

    private void btnSeventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeventhActionPerformed
        if (!"".equals(btnSeventh.getText().trim()) || btnSeventh.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnSeventh.getText());
            btnSeventh.setEnabled(false);
        }
    }//GEN-LAST:event_btnSeventhActionPerformed

    private void btnEighthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEighthActionPerformed
        if (!"".equals(btnEighth.getText().trim()) || btnEighth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnEighth.getText());
            btnEighth.setEnabled(false);
        }
    }//GEN-LAST:event_btnEighthActionPerformed

    private void btnNinethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNinethActionPerformed
        if (!"".equals(btnNineth.getText().trim()) || btnNineth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnNineth.getText());
            btnNineth.setEnabled(false);
        }
    }//GEN-LAST:event_btnNinethActionPerformed

    private void btnTenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenthActionPerformed
        if (!"".equals(btnTenth.getText().trim()) || btnTenth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnTenth.getText());
            btnTenth.setEnabled(false);
        }
    }//GEN-LAST:event_btnTenthActionPerformed

    private void btnEleventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleventhActionPerformed
        if (!"".equals(btnEleventh.getText().trim()) || btnEleventh.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnEleventh.getText());
            btnEleventh.setEnabled(false);
        }
    }//GEN-LAST:event_btnEleventhActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        G.skipLevel(txtMainWord.getText());
//        WordSearch w = new WordSearch();
//        w.setWord(txtMainWord.getText());
//        w.matchWord();
//        System.out.println("Debug word" + w.isCheckSpell());
//        if (w.isCheckSpell() == true) {
//            score.getTotalScore(txtMainWord.getText().trim(), btnFirst.getText().trim(), btnSecond.getText().trim(), btnThird.getText().trim(), w.isCheckSpell());
//
//        } else {
//            // JOptionPane.showMessageDialog(rootPane, "Wrong word");
//            score.getTotalScore(txtMainWord.getText().trim(), btnFirst.getText().trim(), btnSecond.getText().trim(), btnThird.getText().trim(), w.isCheckSpell());
//
//        }
//        
////        GameBoard.levelNo += 1;
////        if (GameBoard.levelNo > 5) {
////            SummaryOfGame summary = new SummaryOfGame();
////            summary.setVisible(true);
////            this.dispose();
////        } else {
////            //level result 
////            GameResult result = new GameResult();
////            result.setVisible(true);
////            this.dispose();
////
////        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
//            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GameBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GameBoardScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEighth;
    private javax.swing.JButton btnEleventh;
    private javax.swing.JButton btnFifth;
    public static javax.swing.JButton btnFirst;
    private javax.swing.JButton btnForth;
    private javax.swing.JButton btnNineth;
    public static javax.swing.JButton btnSecond;
    private javax.swing.JButton btnSeventh;
    private javax.swing.JButton btnSixth;
    private javax.swing.JButton btnTenth;
    public static javax.swing.JButton btnThird;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    public static javax.swing.JTextField txtMainWord;
    private javax.swing.JLabel txtName;
    public static javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}
