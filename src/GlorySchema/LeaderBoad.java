/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MELANI
 */
public class LeaderBoad {
    
    DataBase db = new DataBase();
     
    public void addToLeaderBord() {

        try {
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  topscore SET  PlayerId = '3' , Score='10' WHERE TopId = '2'");
            pst.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(LeaderBoad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getTopRanking(){
        
        ResultSet rs = null;
        try {
           // String query = "SELECT * FROM gameboard1 ORDER BY Total DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
           String query = "SELECT * FROM topscore T INNER JOIN player P ON P.UserId = T.PlayerID ORDER BY T.Score DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

}