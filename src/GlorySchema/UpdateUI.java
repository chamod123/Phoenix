/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import GlorySchema.GameBoard.GameBoard;
import GlorySchema.GameBoard.GameBoardScreen;
import Interface.GameResult;
import Interface.SelectGame;
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
public class UpdateUI {

    Results result = new Results();

    public void updateScoreTable() {
        try {
            DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) GameBoardScreen.tblScoreBoard.getModel();
            dtf.setRowCount(0);
            ResultSet rs = null;
            String data[][] = null;

            rs = result.getRanking(GameBoard.levelNo);
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();

            rs.beforeFirst();
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                v.add(data[x][0] = rs.getString("Name"));
                v.add(data[x][1] = rs.getString("Total"));
                dtf.addRow(v);
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateLetter() {
        GameBoard gameBord = new GameBoard();
        try {
            ResultSet rs = null;
            rs = gameBord.retrieveInitialLetters();
            rs.last();
            rs.beforeFirst();

            int x = 1;
            while (rs.next()) {

                String playerName = rs.getString("PlayerName");
                String initialLetters = rs.getString("Level" + gameBord.levelNo + "Letter");

                if (x == 1) {
                    GameBoardScreen.player1.setText(playerName);
                    GameBoardScreen.player1L.setText(initialLetters);
                } else if (x == 2) {
                    GameBoardScreen.player2.setText(playerName);
                    GameBoardScreen.player2L.setText(initialLetters);
                } else if (x == 3) {
                    GameBoardScreen.player3.setText(playerName);
                    GameBoardScreen.player3L.setText(initialLetters);
                } else if (x == 4) {
                    GameBoardScreen.player4.setText(playerName);
                    GameBoardScreen.player4L.setText(initialLetters);
                }
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateLevelRanking() {
        try {
            ResultSet rs = null;
            rs = result.getRanking(GameBoard.levelNo - 1);
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            rs.beforeFirst();
            int x = 0;
            while (rs.next()) {
                switch (x) {
                    case 0:
                        GameResult.player0.setVisible(true);
                        GameResult.player0.setText(rs.getString("Name"));

                        GameResult.levelScore0.setVisible(true);
                        GameResult.levelScore0.setText(rs.getString("Level" + (GameBoard.levelNo - 1) + "Score"));

                        GameResult.total0.setVisible(true);
                        GameResult.total0.setText(rs.getString("Total"));
                        break;
                    case 1:
                        GameResult.player1.setVisible(true);
                        GameResult.player1.setText(rs.getString("Name"));

                        GameResult.levelScore1.setVisible(true);
                        GameResult.levelScore1.setText(rs.getString("Level" + (GameBoard.levelNo - 1) + "Score"));

                        GameResult.total1.setVisible(true);
                        GameResult.total1.setText(rs.getString("Total"));

                        break;
                    case 2:
                        GameResult.player2.setVisible(true);
                        GameResult.player2.setText(rs.getString("Name"));

                        GameResult.levelScore2.setVisible(true);
                        GameResult.levelScore2.setText(rs.getString("Level" + (GameBoard.levelNo - 1) + "Score"));

                        GameResult.total2.setVisible(true);
                        GameResult.total2.setText(rs.getString("Total"));
                        break;
                    case 3:
                        GameResult.player3.setVisible(true);
                        GameResult.player3.setText(rs.getString("Name"));

                        GameResult.levelScore3.setVisible(true);
                        GameResult.levelScore3.setText(rs.getString("Level" + (GameBoard.levelNo - 1) + "Score"));

                        GameResult.total3.setVisible(true);
                        GameResult.total3.setText(rs.getString("Total"));
                        break;
                    default:
                        break;
                }

                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
