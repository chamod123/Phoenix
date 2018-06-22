/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import GlorySchema.GameBoard.GameBoard;
import static GlorySchema.GameType.tableName;
import static Interface.LoginScreen.PlayerId;
import static Interface.RegisterScreen.Email;
import static Interface.RegisterScreen.UserName;
import static Interface.RegisterScreen.password;
import static Interface.RegisterScreen.UserId;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 *
 * @author Niroshima
 */
public class Player {

    String userId;
    String UserName;
    String Email;
    String password;
    double hightScore;
    public static int OnlinePlayers = 0;
    Results result = new Results();
    DataBase db = new DataBase();

    public int getUserID() {

        int id = 1;
        ResultSet rs = null;

        try {
            String query = "SELECT COUNT(UserId) AS UserId FROM player";
            rs = (ResultSet) db.fetch(query);

            while (rs.next()) {
                rs.last();
                id = rs.getInt("UserId") + 1;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return id;

    }

    public void loging() {
    }

    public void editDetails() {
    }

    public int insertDetails(String UserId, String Name, String Email, String UserName, String password) {
        int val = 0;

        try {

            PreparedStatement pst = (PreparedStatement) db.psmt("INSERT INTO phoenix.player (UserId, Name, Email,UserName, Password) VALUES (?,?,?,?,?);");
            pst.setString(1, UserId.trim());
            pst.setString(2, Name.trim());
            pst.setString(3, Email.trim());
            pst.setString(4, UserName.trim());
            pst.setString(5, password.trim());
            val = pst.executeUpdate();

//            JOptionPane.showMessageDialog(null, "Data Saved Successfully");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Data not saved");
        }
        return val;
    }

    public void getOnlineUser() {
        try {
            String query = "SELECT PlayerId FROM "+tableName+"";
            ResultSet rs = (ResultSet) db.fetch(query);
//            ResultSet rs = result.getRanking(GameBoard.levelNo);
            //ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            //int count = rs.getRow();
            OnlinePlayers = rs.getRow();
        } catch (Exception ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
