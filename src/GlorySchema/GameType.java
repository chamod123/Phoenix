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
 * @author CHAMOD
 */
public class GameType {

    DataBase db = new DataBase();

    public ResultSet getGameTypes(String bankid) {
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM gamepool WHERE poolId like '" + bankid + "%'";
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;

    }
}
