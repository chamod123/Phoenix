/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CHAMOD
 */
public class GameType {

    DataBase db = new DataBase();

    public ResultSet getGameTypes(String gameid) {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
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
            String query = "SELECT * FROM onlinegame WHERE gameTypeID = '" + typeOfGame + "%' AND currentPlayers < '" + player + "%'";
            rs = (ResultSet) db.fetch(query);
            rs.beforeFirst();

            if (!rs.next()) {
                System.out.println("No Game. need create new record for game ");

                PreparedStatement pst2 = (PreparedStatement) db.psmt("INSERT INTO onlinegame (gameTypeID, currentPlayers, notification) VALUES (?,?,?);");
                pst2.setString(1, String.valueOf(typeOfGame));
                pst2.setString(2, "1");
                pst2.setString(3, "Searching");
                pst2.executeUpdate();

                int gameId=2;
                PreparedStatement pst3 = (PreparedStatement) db.psmt("CREATE TABLE gameboard"+gameId+" ( `PlayerId` INT(5) NOT NULL,\n"
                        + "  `Level1Score` DOUBLE DEFAULT NULL, `Level1Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level2Score` DOUBLE DEFAULT NULL, `Level2Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level3Score` DOUBLE DEFAULT NULL, `Level3Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level4Score` DOUBLE DEFAULT NULL, `Level4Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `Level5Score` DOUBLE DEFAULT NULL, `Level5Letter` VARCHAR(5) DEFAULT NULL,\n"
                        + "  `PlayerName` VARCHAR(10) DEFAULT NULL,  PRIMARY KEY (`PlayerId`)\n"
                        + ") ENGINE=INNODB DEFAULT CHARSET=latin1");
               //pst3.setString(1, String.valueOf(typeOfGame));
               // pst3.setString(2, "1");
               //pst3.setString(3, "Searching");
               pst3.executeUpdate();

            } else {
                System.out.println("game have");
                rs.beforeFirst();

                while (rs.next()) {
                    PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  onlinegame SET  currentPlayers = currentPlayers + 1 WHERE gameId = '" + rs.getString("gameId") + "'");
                    pst.executeUpdate();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
