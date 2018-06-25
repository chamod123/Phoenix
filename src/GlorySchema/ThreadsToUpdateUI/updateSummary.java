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
import static Interface.SelectGame.gameTypeid;
import Interface.SummaryOfGame2;
import Interface.SummaryOfGame3;

/**
 *
 * @author Melanie Rebecca
 */
public class updateSummary extends Thread {

    GameResult result = new GameResult();
    LeaderBoard summary = new LeaderBoard();
    private volatile boolean running = true;

    @Override
    public void run() {

        while (running) {
            try {
                getSummaryData();
                //       System.out.println("Summary thread");
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
            rs = summary.getGameSummery();
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            int x = 0;
            while (rs.next()) {
                switch (x) {
                    case 0:
                        this.setWinner1(rs);
                        break;
                    case 1:
                        this.setWinner2(rs);
                        break;
                    case 2:
                        this.setWinner3(rs);
                        break;
                    case 3:
                        this.setWinner4(rs);
                        break;
                    default:
                        break;
                }
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryOfGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setWinner1(ResultSet rs) {
        try {
            if (gameTypeid == 1) {
                SummaryOfGame2.txtWon.setText(rs.getString("PlayerName"));
                SummaryOfGame2.txtName0.setText(rs.getString("PlayerName"));
                SummaryOfGame2.level1score0.setText(rs.getString("Level1Score"));
                SummaryOfGame2.level2score0.setText(rs.getString("Level2Score"));
                SummaryOfGame2.level3score0.setText(rs.getString("Level3Score"));
                SummaryOfGame2.level4score0.setText(rs.getString("Level4Score"));
                SummaryOfGame2.level5score0.setText(rs.getString("Level5Score"));
                SummaryOfGame2.total0.setText(rs.getString("Total"));
            } else if (gameTypeid == 2) {
                SummaryOfGame3.txtWon.setText(rs.getString("PlayerName"));
                SummaryOfGame3.txtName0.setText(rs.getString("PlayerName"));
                SummaryOfGame3.level1score0.setText(rs.getString("Level1Score"));
                SummaryOfGame3.level2score0.setText(rs.getString("Level2Score"));
                SummaryOfGame3.level3score0.setText(rs.getString("Level3Score"));
                SummaryOfGame3.level4score0.setText(rs.getString("Level4Score"));
                SummaryOfGame3.level5score0.setText(rs.getString("Level5Score"));
                SummaryOfGame3.total0.setText(rs.getString("Total"));
            } else if (gameTypeid == 3) {
                SummaryOfGame.txtWon.setText(rs.getString("PlayerName"));
                SummaryOfGame.txtName0.setText(rs.getString("PlayerName"));
                SummaryOfGame.level1score0.setText(rs.getString("Level1Score"));
                SummaryOfGame.level2score0.setText(rs.getString("Level2Score"));
                SummaryOfGame.level3score0.setText(rs.getString("Level3Score"));
                SummaryOfGame.level4score0.setText(rs.getString("Level4Score"));
                SummaryOfGame.level5score0.setText(rs.getString("Level5Score"));
                SummaryOfGame.total0.setText(rs.getString("Total"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(updateSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setWinner2(ResultSet rs) {
        try {
            if (gameTypeid == 1) {
                SummaryOfGame2.txtName1.setText(rs.getString("PlayerName"));
                SummaryOfGame2.level1score1.setText(rs.getString("Level1Score"));
                SummaryOfGame2.level2score1.setText(rs.getString("Level2Score"));
                SummaryOfGame2.level3score1.setText(rs.getString("Level3Score"));
                SummaryOfGame2.level4score1.setText(rs.getString("Level4Score"));
                SummaryOfGame2.level5score1.setText(rs.getString("Level5Score"));
                SummaryOfGame2.total1.setText(rs.getString("Total"));;
            } else if (gameTypeid == 2) {
                SummaryOfGame3.txtName1.setText(rs.getString("PlayerName"));
                SummaryOfGame3.level1score1.setText(rs.getString("Level1Score"));
                SummaryOfGame3.level2score1.setText(rs.getString("Level2Score"));
                SummaryOfGame3.level3score1.setText(rs.getString("Level3Score"));
                SummaryOfGame3.level4score1.setText(rs.getString("Level4Score"));
                SummaryOfGame3.level5score1.setText(rs.getString("Level5Score"));
                SummaryOfGame3.total1.setText(rs.getString("Total"));;
            } else if (gameTypeid == 3) {
                SummaryOfGame.txtName1.setText(rs.getString("PlayerName"));
                SummaryOfGame.level1score1.setText(rs.getString("Level1Score"));
                SummaryOfGame.level2score1.setText(rs.getString("Level2Score"));
                SummaryOfGame.level3score1.setText(rs.getString("Level3Score"));
                SummaryOfGame.level4score1.setText(rs.getString("Level4Score"));
                SummaryOfGame.level5score1.setText(rs.getString("Level5Score"));
                SummaryOfGame.total1.setText(rs.getString("Total"));;
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setWinner3(ResultSet rs) {
        try {
            if (gameTypeid == 2) {
                SummaryOfGame3.txtName2.setText(rs.getString("PlayerName"));
                SummaryOfGame3.level1score2.setText(rs.getString("Level1Score"));
                SummaryOfGame3.level2score2.setText(rs.getString("Level2Score"));
                SummaryOfGame3.level3score2.setText(rs.getString("Level3Score"));
                SummaryOfGame3.level4score2.setText(rs.getString("Level4Score"));
                SummaryOfGame3.level5score2.setText(rs.getString("Level5Score"));
                SummaryOfGame3.total2.setText(rs.getString("Total"));
            } else if (gameTypeid == 3) {
                SummaryOfGame.txtName2.setText(rs.getString("PlayerName"));
                SummaryOfGame.level1score2.setText(rs.getString("Level1Score"));
                SummaryOfGame.level2score2.setText(rs.getString("Level2Score"));
                SummaryOfGame.level3score2.setText(rs.getString("Level3Score"));
                SummaryOfGame.level4score2.setText(rs.getString("Level4Score"));
                SummaryOfGame.level5score2.setText(rs.getString("Level5Score"));
                SummaryOfGame.total2.setText(rs.getString("Total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setWinner4(ResultSet rs) {
        try {
            if (gameTypeid == 2) {
                SummaryOfGame.txtName3.setText(rs.getString("PlayerName"));
                SummaryOfGame.level1score3.setText(rs.getString("Level1Score"));
                SummaryOfGame.level2score3.setText(rs.getString("Level2Score"));
                SummaryOfGame.level3score3.setText(rs.getString("Level3Score"));
                SummaryOfGame.level4score3.setText(rs.getString("Level4Score"));
                SummaryOfGame.level5score3.setText(rs.getString("Level5Score"));
                SummaryOfGame.total3.setText(rs.getString("Total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(updateSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
