/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import GlorySchema.LeaderBoard;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
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
 * @author Melanie Rebecca
 */
public class LeaderBoardScreen extends javax.swing.JFrame {

    LeaderBoard result = new LeaderBoard();
    String leaderTOp[][];

    /**
     * Creates new form LeaderBoard
     */
    public LeaderBoardScreen() {
        initComponents();
        ShowGrid();
        getLevelRanking();
    }

    public void getLevelRanking() {
        try {
            ResultSet rs = null;
            String data[][] = null;

            rs = result.getTopRanking();//todomel
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) leaderBoardtbl.getModel();
                v.add(data[x][0] = rs.getString("Name"));
                v.add(data[x][1] = rs.getString("Score"));//todomel
//                v.add(data[x][2] = rs.getString("Total"));
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
        String colu[] = new String[]{"Player", "Score"};//, "Level Score", "Total"
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

        leaderBoardtbl.setModel(model);
        leaderBoardtbl.getTableHeader().setPreferredSize(new Dimension(leaderBoardtbl.getTableHeader().getPreferredSize().width, 35));
        JTableHeader head = leaderBoardtbl.getTableHeader();
        head.setFont(head.getFont().deriveFont(Font.BOLD));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        // tblGames.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

        // model.setRowCount(20);
//        TableColumn colou10 = leaderBoardtbl.getColumnModel().getColumn(1);
//        colou10.setMinWidth(80);
//        colou10.setPreferredWidth(80);
//        colou10.setMaxWidth(80);
//        
//        TableColumn colou2 = leaderBoardtbl.getColumnModel().getColumn(2);
//        colou2.setMinWidth(80);
//        colou2.setPreferredWidth(80);
//        colou2.setMaxWidth(80);
    }

    private void getLeaderScore() {
        try {
            ResultSet rs = null;
            ResultSet rs1 = null;

            rs1 = result.getLeaderTopScore();//todomel
            ResultSetMetaData rsmd1 = rs1.getMetaData();

            rs = result.getLeaderTopScore();//todomel
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            rs1.last();

            int count = rs.getRow() + rs1.getRow();

            rs1.beforeFirst();
            rs.beforeFirst();

            leaderTOp = new String[count][2];

            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) leaderBoardtbl.getModel();
                v.add(leaderTOp[x][0] = rs.getString("Name"));
                v.add(leaderTOp[x][1] = rs.getString("Score"));//todomel
//                v.add(data[x][2] = rs.getString("Total"));
//                v.add(data[x][3] = rs.getString(""));
//                v.add(data[x][4] = rs.getString(""));
                dtf.addRow(v);
                x = x + 1;
            }

            while (rs1.next()) {
                Vector v = new Vector();
                DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) leaderBoardtbl.getModel();
                v.add(leaderTOp[x][0] = rs1.getString("Name"));
                v.add(leaderTOp[x][1] = rs1.getString("Score"));
                dtf.addRow(v);
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getUpdateScore() {
        String temp[][];
        for (int i = 0; i < leaderTOp.length; i++) {
            
//            for (int j = 1; j < leaderTOp.length; j++) {
//                if (Integer.parseInt(leaderTOp[i][1]) > Integer.parseInt(leaderTOp[j][1])) {
//                    temp = (leaderTOp[i][j]);
//                    leaderTOp[i][1] = leaderTOp[j][1];
//                    leaderTOp[i][j] = temp[0][1];
//
//                }
//            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        leaderBoardtbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leaderBoardtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(leaderBoardtbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderBoardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderBoardScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leaderBoardtbl;
    // End of variables declaration//GEN-END:variables
}
