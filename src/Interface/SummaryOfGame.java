/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import GlorySchema.LeaderBoard;
import GlorySchema.ThreadsToUpdateUI.updateSummary;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Timer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author Nipuni
 */
public class SummaryOfGame extends javax.swing.JFrame {

    LeaderBoard summary = new LeaderBoard();
    
       int leaderTOp[] = null;
       int topTot[] = null;

    public SummaryOfGame() {
        initComponents();
        ShowGrid();
        
        updateSummary t = new updateSummary();
        t.start();
        t.sleepThread();
        t.shutdown();
        getTopTot();
        //sort() ;
        summaryTbl.setOpaque(true);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        summaryTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("GAME SUMMARY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 280, 40));

        summaryTbl.setBackground(new java.awt.Color(204, 128, 59));
        summaryTbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        summaryTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(summaryTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 550, 100));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 387, 130, 30));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Play Again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 387, -1, 30));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void getSummaryData() {
        try {
            ResultSet rs = null;
            String data[][] = null;
            DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) summaryTbl.getModel();
            dtf.setRowCount(0);
            rs = summary.getGameSummery();
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            data = new String[count][8];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                
                v.add(data[x][0] = rs.getString(x + 1));
                v.add(data[x][1] = rs.getString("PlayerName"));
                v.add(data[x][2] = rs.getString("Level1Score"));
                v.add(data[x][3] = rs.getString("Level2Score"));
                v.add(data[x][4] = rs.getString("Level3Score"));
                v.add(data[x][5] = rs.getString("Level4Score"));
                v.add(data[x][6] = rs.getString("Level5Score"));
                v.add(data[x][7] = rs.getString("Total"));
                dtf.addRow(v);
                //confirm = rs.getInt("confirm");
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ShowGrid() {
        String data[][] = null;

        String colu[] = new String[]{"Rank", "Player", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Total"};
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
        summaryTbl.setModel(model);
        summaryTbl.getTableHeader().setPreferredSize(new Dimension(summaryTbl.getTableHeader().getPreferredSize().width, 35));
        JTableHeader head = summaryTbl.getTableHeader();
        head.setFont(head.getFont().deriveFont(Font.BOLD));
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        // tblGames.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        // model.setRowCount(20);
        TableColumn colou10 = summaryTbl.getColumnModel().getColumn(0);
        colou10.setMinWidth(80);
        colou10.setPreferredWidth(80);
        colou10.setMaxWidth(80);

    }

    private void getTopTot() {
        try {
            ResultSet rs = null;
      

            rs = summary.getTopScore();
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            topTot = new int[count];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();

                v.add(topTot[x] = rs.getInt("Total"));
                //confirm = rs.getInt("confirm");
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getLeaderTop() {
        try {
            ResultSet rs = null;
          

            rs = summary.getLeaderTopScore();
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            leaderTOp = new int[count];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();

                v.add(leaderTOp[x] = rs.getInt("Score"));
                //confirm = rs.getInt("confirm");
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
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
            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaryOfGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummaryOfGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable summaryTbl;
    // End of variables declaration//GEN-END:variables
}
