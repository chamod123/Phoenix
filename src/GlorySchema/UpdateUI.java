/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Interface.GameBoard;
import Interface.GameResult;
import Interface.SelectGame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melanie Rebecca
 */
public class UpdateUI  {
    
    
    Results result = new Results();

    public void updateScoreTable(){
     try {
         DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) GameBoard.tblScoreBoard.getModel();
               dtf.setRowCount(0);
            ResultSet rs = null;
            String data[][] = null;

            rs = result.getRanking(GameBord.levelNo);
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
     public void updateLetter(){
     GameBord gameBord = new GameBord();
     try {
            ResultSet rs = null;
            rs = gameBord.retrieveInitialLetters();
            rs.last();
            rs.beforeFirst();
            
            int x = 1;
            while (rs.next()) {
                
                String playerName = rs.getString("PlayerName");
                String initialLetters = rs.getString("Level"+gameBord.levelNo+"Letter");
               
              if(x==1){
                  GameBoard.player1.setText(playerName);
                  GameBoard.player1L.setText(initialLetters);
              }
              else if(x==2){
                  GameBoard.player2.setText(playerName);
                  GameBoard.player2L.setText(initialLetters);
              }
              else if(x==3){
                  GameBoard.player3.setText(playerName);
                  GameBoard.player3L.setText(initialLetters);
              }
              else if(x==4){
                  GameBoard.player4.setText(playerName);
                  GameBoard.player4L.setText(initialLetters);
              }
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
     public void updateLevelRanking() {
         
             GameResult gameResult = new GameResult();
         try {
            DefaultTableModel dtf2 = (javax.swing.table.DefaultTableModel) gameResult.tblGames.getModel();
            ResultSet rs = null;
            String data[][] = null;

            rs = result.getRanking(GameBord.levelNo-1);
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                
                v.add(data[x][0] = rs.getString("Name"));
                v.add(data[x][1] = rs.getString("Level"+(GameBord.levelNo-1)+"Score"));
                v.add(data[x][2] = rs.getString("Total"));
                dtf2.addRow(v);
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

     
     
}

