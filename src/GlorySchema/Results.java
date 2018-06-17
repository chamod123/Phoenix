/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import Interface.LoginScreen;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MELANI
 */
public class Results {

    DataBase db = new DataBase();

    public ResultSet getRanking(int levelNo) {
        //     System.out.println(levelNo);
        ResultSet rs = null;
        try {
            // String query = "SELECT * FROM gameboard1 ORDER BY Total DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
            String query = "SELECT * FROM " + GameType.tableName + " G INNER JOIN player P ON G.PlayerId = P.UserId ORDER BY G.Level" + levelNo + "Score DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void getwiner() {

    }

    public void updateResults(double score) {
        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  " + GameType.tableName + " SET  Level" + GameBord.levelNo + "Score = "+score+", Total = Total + "+score+"  WHERE PlayerId = '" + LoginScreen.PlayerId + "'");
            pst.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(Results.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
