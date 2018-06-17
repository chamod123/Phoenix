/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import java.sql.ResultSet;

/**
 *
 * @author MELANI
 */
public class Results {
    
    DataBase db = new DataBase();
    
    public ResultSet getRanking(int levelNo){
        System.out.println(levelNo);
    ResultSet rs = null;
        try {
           // String query = "SELECT * FROM gameboard1 ORDER BY Total DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
           String query = "SELECT * FROM gameboard1 G INNER JOIN player P ON G.PlayerId = P.UserId ORDER BY G.Level"+levelNo+"Score DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public void getwiner(){
    
    }
    
}
