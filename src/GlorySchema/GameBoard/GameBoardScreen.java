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
import java.awt.Color;
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
    public static boolean isdone = false;

    /**
     * Creates new form GameBoard
     */
    public GameBoardScreen() {
        moved = false;
        setUndecorated(true);
        initComponents();
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.setBorder(null);
        btnUndo.setContentAreaFilled(false);
        btnUndo.setBorder(null);
        btnDone.setContentAreaFilled(false);
        btnDone.setBorder(null);
        setLocationRelativeTo(null);
        gisLoad.setVisible(false);
        gisLoad1.setVisible(false);
        txtLevel.setText("Level " + (GameBoard.levelNo));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tblScoreBoard.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);

        String x = getInitial();
        btnFirst.setText(x);
        String y = getInitial();
        btnSecond.setText(y);
        String z = getInitial();
        btnThird.setText(z);

        G.saveInitialLetters(x, y, z);

        updateGameBoard t = new updateGameBoard();
        t.start();
        t.sleepThread();
        t.shutdown();

        (new Thread(new timer(this))).start();

        txtName.setText(LoginScreen.PlayerName);

    }

    public String getInitial() {
        String x;
        G.getInitialLetter();
        x = String.valueOf(G.getInitialLetter1());

        if (x.equals("W") || x.equals("X") || x.equals("Q") || x.equals("Z") || x.equals("J")) {
            if (x.equals(btnFirst.getText()) || x.equals(btnSecond.getText()) || x.equals(btnThird.getText()) || x.equals(btnForth.getText()) || x.equals(btnFifth.getText()) || x.equals(btnSixth.getText()) || x.equals(btnSeventh.getText()) || x.equals(btnEighth.getText()) || x.equals(btnNineth.getText()) || x.equals(btnTenth.getText()) || x.equals(btnEleventh.getText())) {
                x = setConsonant();
            }
        }

        int count = 0;
        if (x.equals(btnFirst.getText())) {
            count = count + 1;
        }  if (x.equals(btnSecond.getText())) {
            count = count + 1;
        }  if (x.equals(btnThird.getText())) {
            count = count + 1;
        }  if (x.equals(btnForth.getText())) {
            count = count + 1;
        }  if (x.equals(btnFifth.getText())) {
            count = count + 1;
        }  if (x.equals(btnSixth.getText())) {
            count = count + 1;
        }  if (x.equals(btnSeventh.getText())) {
            count = count + 1;
        }  if (x.equals(btnEighth.getText())) {
            count = count + 1;
        }  if (x.equals(btnNineth.getText())) {
            count = count + 1;
        }  if (x.equals(btnTenth.getText())) {
            count = count + 1;
        }  if (x.equals(btnEleventh.getText())) {
            count = count + 1;
        }
        if (count >= 2) {
            x = setConsonant();
        }

        return x;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gisLoad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtAlet = new javax.swing.JLabel();
        gisLoad1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTimePanal = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtMainWord = new javax.swing.JTextField();
        txtLevel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        btnConsonant = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        player1L = new javax.swing.JLabel();
        player3 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        player4 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        player3L = new javax.swing.JLabel();
        player4L = new javax.swing.JLabel();
        player2L = new javax.swing.JLabel();
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
        btnDone = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        gisLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/little-loader.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAlet.setBackground(new java.awt.Color(255, 153, 0));
        txtAlet.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        txtAlet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtAlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 340, 20));

        gisLoad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loader.gif"))); // NOI18N
        jPanel1.add(gisLoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 260, 260));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEXT LETTER");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 240, 50));

        txtTimePanal.setBackground(new java.awt.Color(102, 255, 102));
        txtTimePanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("s");
        txtTimePanal.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 50));

        txtTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTime.setText("100");
        txtTimePanal.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 50));

        jPanel1.add(txtTimePanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 110, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SCORE BOARD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("VOWEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 140, 40));

        txtMainWord.setEditable(false);
        txtMainWord.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        txtMainWord.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMainWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMainWordActionPerformed(evt);
            }
        });
        txtMainWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMainWordKeyPressed(evt);
            }
        });
        jPanel1.add(txtMainWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 520, 50));

        txtLevel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtLevel.setForeground(new java.awt.Color(255, 255, 255));
        txtLevel.setText("GAME TIME");
        jPanel1.add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 220, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Name");
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, 40));

        btnConsonant.setBackground(new java.awt.Color(51, 204, 255));
        btnConsonant.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnConsonant.setText("CONSONANT");
        btnConsonant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsonantActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsonant, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 140, 40));

        jPanel5.setBackground(new java.awt.Color(51, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Initial Letters", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        player1L.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player1L, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 40));

        player3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 40));

        player2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 130, 40));

        player4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 110, 40));

        player1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        player3L.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player3L, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 60, 40));

        player4L.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player4L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 60, 40));

        player2L.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel5.add(player2L, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 1080, 50));

        btnThird.setBackground(new java.awt.Color(255, 204, 0));
        btnThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdActionPerformed(evt);
            }
        });
        jPanel1.add(btnThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 50, 50));

        btnForth.setBackground(new java.awt.Color(102, 255, 51));
        btnForth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForthActionPerformed(evt);
            }
        });
        jPanel1.add(btnForth, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 50, 50));

        btnFifth.setBackground(new java.awt.Color(102, 255, 51));
        btnFifth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFifthActionPerformed(evt);
            }
        });
        jPanel1.add(btnFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 50, 50));

        btnSixth.setBackground(new java.awt.Color(102, 255, 51));
        btnSixth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixthActionPerformed(evt);
            }
        });
        jPanel1.add(btnSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 50, 50));

        btnSeventh.setBackground(new java.awt.Color(102, 255, 51));
        btnSeventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeventhActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 50, 50));

        btnEighth.setBackground(new java.awt.Color(102, 255, 51));
        btnEighth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEighthActionPerformed(evt);
            }
        });
        jPanel1.add(btnEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 50, 50));

        btnNineth.setBackground(new java.awt.Color(102, 255, 51));
        btnNineth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNinethActionPerformed(evt);
            }
        });
        jPanel1.add(btnNineth, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 50, 50));

        btnTenth.setBackground(new java.awt.Color(102, 255, 51));
        btnTenth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenthActionPerformed(evt);
            }
        });
        jPanel1.add(btnTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 50, 50));

        btnEleventh.setBackground(new java.awt.Color(102, 255, 51));
        btnEleventh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleventhActionPerformed(evt);
            }
        });
        jPanel1.add(btnEleventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 50, 50));

        btnFirst.setBackground(new java.awt.Color(255, 204, 0));
        btnFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFirstMouseClicked(evt);
            }
        });
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 50, 50));

        btnSecond.setBackground(new java.awt.Color(255, 204, 0));
        btnSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondActionPerformed(evt);
            }
        });
        jPanel1.add(btnSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 50, 50));

        tblScoreBoard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "Title 2"
            }
        ));
        jPanel1.add(tblScoreBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 170, 80));

        btnDone.setBackground(new java.awt.Color(0, 204, 255));
        btnDone.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-ok-25.png"))); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 160, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-euro-money-100.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 100, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoenix50.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 50, 50));

        btnRefresh.setBackground(new java.awt.Color(153, 153, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/refresh1.png"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 50, 50));

        btnUndo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/retry.png"))); // NOI18N
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUndo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 80, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btn.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/time-loading-gif.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 50, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gameBoard.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 900, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        txtMainWord.setText(txtMainWord.getText() + btnFirst.getText());
        btnFirst.setEnabled(false);
        setAlet();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String x;

        if ("".equals(btnForth.getText().trim()) || btnForth.getText() == null) {
            G.getVowel();
            x = String.valueOf(G.getSelectedVowel());
            btnForth.setText(x);
            btnUndo.setEnabled(true);
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
        setAlet();
    }//GEN-LAST:event_btnThirdActionPerformed

    private void txtMainWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMainWordActionPerformed
        setAlet();
    }//GEN-LAST:event_txtMainWordActionPerformed

    public String setConsonant() {
        String x;
        G.getConstent();
        x = String.valueOf(G.getSelectedConst());
        if (x.equals("W") || x.equals("X") || x.equals("Q") || x.equals("Z") || x.equals("J")) {
            if (x.equals(btnFirst.getText()) || x.equals(btnSecond.getText()) || x.equals(btnThird.getText()) || x.equals(btnForth.getText()) || x.equals(btnFifth.getText()) || x.equals(btnSixth.getText()) || x.equals(btnSeventh.getText()) || x.equals(btnEighth.getText()) || x.equals(btnNineth.getText()) || x.equals(btnTenth.getText()) || x.equals(btnEleventh.getText())) {
                x = setConsonant();
            }
        }

        int count = 0;
        if (x.equals(btnFirst.getText())) {
            count = count + 1;
        }  if (x.equals(btnSecond.getText())) {
            count = count + 1;
        }  if (x.equals(btnThird.getText())) {
            count = count + 1;
        }  if (x.equals(btnForth.getText())) {
            count = count + 1;
        }  if (x.equals(btnFifth.getText())) {
            count = count + 1;
        }  if (x.equals(btnSixth.getText())) {
            count = count + 1;
        }  if (x.equals(btnSeventh.getText())) {
            count = count + 1;
        }  if (x.equals(btnEighth.getText())) {
            count = count + 1;
        }  if (x.equals(btnNineth.getText())) {
            count = count + 1;
        }  if (x.equals(btnTenth.getText())) {
            count = count + 1;
        }  if (x.equals(btnEleventh.getText())) {
            count = count + 1;
        }
        if (count >= 2) {
            x = setConsonant();
        }
        return x;
    }

    private void btnConsonantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsonantActionPerformed
        if ("".equals(btnForth.getText().trim()) || btnForth.getText() == null) {
            btnForth.setText(setConsonant());
            btnUndo.setEnabled(true);
        } else if ("".equals(btnFifth.getText().trim()) || btnFifth.getText() == null) {
            btnFifth.setText(setConsonant());
        } else if ("".equals(btnSixth.getText().trim()) || btnSixth.getText() == null) {
            btnSixth.setText(setConsonant());
        } else if ("".equals(btnSeventh.getText().trim()) || btnSeventh.getText() == null) {
            btnSeventh.setText(setConsonant());
        } else if ("".equals(btnEighth.getText().trim()) || btnEighth.getText() == null) {
            btnEighth.setText(setConsonant());
        } else if ("".equals(btnNineth.getText().trim()) || btnNineth.getText() == null) {
            btnNineth.setText(setConsonant());
        } else if ("".equals(btnTenth.getText().trim()) || btnTenth.getText() == null) {
            btnTenth.setText(setConsonant());
        } else if ("".equals(btnEleventh.getText().trim()) || btnEleventh.getText() == null) {
            btnEleventh.setText(setConsonant());
        }


    }//GEN-LAST:event_btnConsonantActionPerformed

    private void btnSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondActionPerformed
        txtMainWord.setText(txtMainWord.getText() + btnSecond.getText());
        btnSecond.setEnabled(false);
        setAlet();
    }//GEN-LAST:event_btnSecondActionPerformed

    private void btnForthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForthActionPerformed
        if (!"".equals(btnForth.getText().trim()) || btnForth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnForth.getText());
            btnForth.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnForthActionPerformed

    private void btnFifthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFifthActionPerformed
        if (!"".equals(btnFifth.getText().trim()) || btnFifth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnFifth.getText());
            btnFifth.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnFifthActionPerformed

    private void btnSixthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixthActionPerformed
        if (!"".equals(btnSixth.getText().trim()) || btnSixth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnSixth.getText());
            btnSixth.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnSixthActionPerformed

    private void btnSeventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeventhActionPerformed
        if (!"".equals(btnSeventh.getText().trim()) || btnSeventh.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnSeventh.getText());
            btnSeventh.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnSeventhActionPerformed

    private void btnEighthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEighthActionPerformed
        if (!"".equals(btnEighth.getText().trim()) || btnEighth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnEighth.getText());
            btnEighth.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnEighthActionPerformed

    private void btnNinethActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNinethActionPerformed
        if (!"".equals(btnNineth.getText().trim()) || btnNineth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnNineth.getText());
            btnNineth.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnNinethActionPerformed

    private void btnTenthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenthActionPerformed
        if (!"".equals(btnTenth.getText().trim()) || btnTenth.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnTenth.getText());
            btnTenth.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnTenthActionPerformed

    private void btnEleventhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleventhActionPerformed
        if (!"".equals(btnEleventh.getText().trim()) || btnEleventh.getText().trim() != null) {
            txtMainWord.setText(txtMainWord.getText() + btnEleventh.getText());
            btnEleventh.setEnabled(false);
            setAlet();
        }
    }//GEN-LAST:event_btnEleventhActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        btnDone.setEnabled(false);
        gisLoad.setVisible(true);
        gisLoad1.setVisible(true);
        if (!isdone) {
            isdone = true;
            G.skipLevel(txtMainWord.getText(), this);
        }

    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        btnFirst.setEnabled(true);
        btnSecond.setEnabled(true);
        btnThird.setEnabled(true);
        btnForth.setEnabled(true);
        btnFifth.setEnabled(true);
        btnSixth.setEnabled(true);
        btnSeventh.setEnabled(true);
        btnEighth.setEnabled(true);
        btnNineth.setEnabled(true);
        btnTenth.setEnabled(true);
        btnEleventh.setEnabled(true);
        txtMainWord.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        if (!"".equals(btnEleventh.getText().trim())) {
            btnEleventh.setText("");
        } else if (!"".equals(btnTenth.getText().trim())) {
            btnTenth.setText("");
        } else if (!"".equals(btnNineth.getText().trim())) {
            btnNineth.setText("");
        } else if (!"".equals(btnEighth.getText().trim())) {
            btnEighth.setText("");
        } else if (!"".equals(btnSeventh.getText().trim())) {
            btnSeventh.setText("");
        } else if (!"".equals(btnSixth.getText().trim())) {
            btnSixth.setText("");
        } else if (!"".equals(btnFifth.getText().trim())) {
            btnFifth.setText("");
        } else if (!"".equals(btnForth.getText().trim())) {
            btnForth.setText("");
        }
        btnUndo.setEnabled(false);
    }//GEN-LAST:event_btnUndoActionPerformed

    private void txtMainWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMainWordKeyPressed
        setAlet();
    }//GEN-LAST:event_txtMainWordKeyPressed

    private void btnFirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstMouseClicked

    public void setAlet() {
        if (txtMainWord.getText().trim().length() >= 3) {
            if (G.checkSpell(txtMainWord.getText().trim())) {
                txtAlet.setText("Correct Word");
                txtAlet.setForeground(Color.GREEN);
            } else {
                txtAlet.setText("Wrong word");
                txtAlet.setForeground(Color.PINK);
            }
        } else {
            txtAlet.setText("word must have 3 letters");
            txtAlet.setForeground(Color.ORANGE);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsonant;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnEighth;
    private javax.swing.JButton btnEleventh;
    private javax.swing.JButton btnFifth;
    public static javax.swing.JButton btnFirst;
    private javax.swing.JButton btnForth;
    private javax.swing.JButton btnNineth;
    private javax.swing.JButton btnRefresh;
    public static javax.swing.JButton btnSecond;
    private javax.swing.JButton btnSeventh;
    private javax.swing.JButton btnSixth;
    private javax.swing.JButton btnTenth;
    public static javax.swing.JButton btnThird;
    private javax.swing.JButton btnUndo;
    private javax.swing.JLabel gisLoad;
    private javax.swing.JLabel gisLoad1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JLabel txtAlet;
    private javax.swing.JLabel txtLevel;
    public static javax.swing.JTextField txtMainWord;
    private javax.swing.JLabel txtName;
    public static javax.swing.JLabel txtTime;
    public static javax.swing.JPanel txtTimePanal;
    // End of variables declaration//GEN-END:variables
}
