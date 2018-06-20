/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;
import Db.DataBase;
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
    
    
  
    public int getUserID(){
        DataBase db = new DataBase();
        int id =1;
        ResultSet rs = null;
        
        try {
             String query = "SELECT COUNT(UserId) AS UserId FROM player";
             rs = (ResultSet) db.fetch(query);
            
            while(rs.next()){
              rs.last();
             id = rs.getInt("UserId") +1;
            }
           }
         catch (Exception ex) {
            ex.printStackTrace();
            }
             
             return id;
        
      }
   
    public void loging(){}
    public void editDetails(){}


    public void insertDetails(String UserId, String Name, String Email,String UserName, String password) {
      
           DataBase db = new DataBase();
    try{
   
    PreparedStatement pst = (PreparedStatement) db.psmt("INSERT INTO phoenix.player (UserId, Name, Email,UserName, Password) VALUES (?,?,?,?,?);");
    pst.setString(1,UserId);
    pst.setString(2,Name);
    pst.setString(3,Email);
    pst.setString(4,UserName);
    pst.setString(5,password);
    pst.executeUpdate();
    
    JOptionPane.showMessageDialog(null,"Data Saved Successfully");
    
    }catch(Exception e){
    
   JOptionPane.showMessageDialog(null,"Data not saved");
    } 
    }
 
}
