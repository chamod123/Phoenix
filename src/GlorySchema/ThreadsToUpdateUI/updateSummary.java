/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.ThreadsToUpdateUI;

import GlorySchema.LeaderBoard;
import Interface.GameResult;
import Interface.SummaryOfGame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melanie Rebecca
 */
public class updateSummary extends Thread {

    // SummaryOfGame summary = new SummaryOfGame();
    GameResult result = new GameResult();
    LeaderBoard summary = new LeaderBoard();
    private volatile boolean running = true;

    @Override
    public void run() {

        while (running) {
            try {
                getSummaryData();
                System.out.println("Summary thread");

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(updateSummary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void shutdown() {
        running = false;
    }

    public void sleepThread() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(updateGameResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getSummaryData() {
        try {
            ResultSet rs = null;
//            String data[][] = null;
//            DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) SummaryOfGame.summaryTbl.getModel();
//            dtf.setRowCount(0);
            rs = summary.getGameSummery();
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
//            data = new String[count][8];
            int x = 0;
            while (rs.next()) {
//                Vector v = new Vector();
                switch (x) {
                    case 0:
                        SummaryOfGame.player1.setVisible(true);
                        SummaryOfGame.txtName0.setText(rs.getString("PlayerName"));
                        SummaryOfGame.level1score0.setText(rs.getString("Level1Score"));
                        SummaryOfGame.level2score0.setText(rs.getString("Level2Score"));
                        SummaryOfGame.level3score0.setText(rs.getString("Level3Score"));
                        SummaryOfGame.level4score0.setText(rs.getString("Level4Score"));
                        SummaryOfGame.level5score0.setText(rs.getString("Level5Score"));
                        SummaryOfGame.total0.setText(rs.getString("Total"));
                        //SummaryOfGame.status0.setText("1st Place");
                        break;
                    case 1:
                        SummaryOfGame.player2.setVisible(true);
                        SummaryOfGame.txtName1.setText(rs.getString("PlayerName"));
                        SummaryOfGame.level1score1.setText(rs.getString("Level1Score"));
                        SummaryOfGame.level2score1.setText(rs.getString("Level2Score"));
                        SummaryOfGame.level3score1.setText(rs.getString("Level3Score"));
                        SummaryOfGame.level4score1.setText(rs.getString("Level4Score"));
                        SummaryOfGame.level5score1.setText(rs.getString("Level5Score"));
                        SummaryOfGame.total1.setText(rs.getString("Total"));
                       // SummaryOfGame.status1.setText("2nd Place");
                        break;
                    case 2:
                        SummaryOfGame.player3.setVisible(true);
                        SummaryOfGame.txtName2.setText(rs.getString("PlayerName"));
                        SummaryOfGame.level1score2.setText(rs.getString("Level1Score"));
                        SummaryOfGame.level2score2.setText(rs.getString("Level2Score"));
                        SummaryOfGame.level3score2.setText(rs.getString("Level3Score"));
                        SummaryOfGame.level4score2.setText(rs.getString("Level4Score"));
                        SummaryOfGame.level5score2.setText(rs.getString("Level5Score"));
                        SummaryOfGame.total2.setText(rs.getString("Total"));
                        //SummaryOfGame.status2.setText("3rd Place");
                        break;
                    case 3:
                        SummaryOfGame.player4.setVisible(true);
                        SummaryOfGame.txtName3.setText(rs.getString("PlayerName"));
                        SummaryOfGame.level1score3.setText(rs.getString("Level1Score"));
                        SummaryOfGame.level2score3.setText(rs.getString("Level2Score"));
                        SummaryOfGame.level3score3.setText(rs.getString("Level3Score"));
                        SummaryOfGame.level4score3.setText(rs.getString("Level4Score"));
                        SummaryOfGame.level5score3.setText(rs.getString("Level5Score"));
                        SummaryOfGame.total3.setText(rs.getString("Total"));
                       // SummaryOfGame.status3.setText("4th Place");
                        break;
                    default:
                        break;
                }

//                v.add(data[x][0] = rs.getString(x + 1));
//                v.add(data[x][1] = rs.getString("PlayerName"));
//                v.add(data[x][2] = rs.getString("Level1Score"));
//                v.add(data[x][3] = rs.getString("Level2Score"));
//                v.add(data[x][4] = rs.getString("Level3Score"));
//                v.add(data[x][5] = rs.getString("Level4Score"));
//                v.add(data[x][6] = rs.getString("Level5Score"));
//                v.add(data[x][7] = rs.getString("Total"));
//                dtf.addRow(v);
                //confirm = rs.getInt("confirm");
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
