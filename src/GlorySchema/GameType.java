/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static Interface.LoginScreen.PlayerId;
import static Interface.LoginScreen.PlayerName;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class GameType {

    public static String tableName;

    DataBase db = new DataBase();

    public ResultSet getGameTypes(String gameid) {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId WHERE O.gameId LIKE  '" + gameid + "%'";
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;

    }

    public void connectWithGame(int typeOfGame) {
        ResultSet rs = null;
        int player = typeOfGame + 1;
        try {
            //search current game
            rs = searchCurrentGame(typeOfGame);
            rs.beforeFirst();

            if (!rs.next()) {
                System.out.println("No Game. need create new record for game ");

                PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO onlinegame (gameTypeID, currentPlayers, notification) VALUES (?,?,?);");
                pst2.setString(1, String.valueOf(typeOfGame));
                pst2.setString(2, "1");
                pst2.setString(3, "Searching");
                pst2.executeUpdate();

                searchCurrentGame(typeOfGame);

                PreparedStatement pst3 = (PreparedStatement) db.psmt("CREATE TABLE " + tableName + " ( `PlayerId` INT(5) NOT NULL,\n"
                        + "  `Level1Score` DOUBLE DEFAULT NULL, `Level1Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level2Score` DOUBLE DEFAULT NULL, `Level2Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level3Score` DOUBLE DEFAULT NULL, `Level3Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level4Score` DOUBLE DEFAULT NULL, `Level4Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level5Score` DOUBLE DEFAULT NULL, `Level5Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `PlayerName` VARCHAR(10) DEFAULT NULL, `Total` double DEFAULT NULL,  PRIMARY KEY (`PlayerId`)\n"
                        + ") ENGINE=INNODB DEFAULT CHARSET=latin1");
                pst3.executeUpdate();
                insertToPlayerData();
            } else {
                System.out.println("game have");
                rs.beforeFirst();
                insertToPlayerData();
                while (rs.next()) {
                    tableName = "gameboard" + rs.getString("gameId");
                    PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  onlinegame SET  currentPlayers = currentPlayers + 1 WHERE gameId = '" + rs.getString("gameId") + "'");
                    pst.executeUpdate();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ResultSet searchCurrentGame(int typeOfGame) {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM onlinegame WHERE gameTypeID = '" + typeOfGame + "%' AND currentPlayers < '" + (typeOfGame + 1) + "%'";
            rs = (ResultSet) db.fetch(query);
            rs.beforeFirst();

            while (rs.next()) { // get table name of game boad
                tableName = "gameboard" + rs.getString("gameId");
            }
        } catch (Exception ex) {
            Logger.getLogger(GameType.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    private void insertToPlayerData() {
        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("INSERT INTO " + tableName + "( PlayerId , PlayerName, Total) VALUES (?,?,?);");
            pst.setInt(1, Integer.valueOf(PlayerId.trim()));
            pst.setString(2, PlayerName);
            pst.setInt(3, 0);
            pst.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(GameType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteTable() {
        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("DROP TABLE " + tableName);
            pst.executeUpdate();
            System.out.println("deleted");
        } catch (Exception ex) {
            System.out.println("deleted not complete");
        }
    }
}
