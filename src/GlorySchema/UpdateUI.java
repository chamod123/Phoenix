/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Interface.GameBoard;
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
public class UpdateUI  extends TimerTask  {
    
    Results result = new Results();

    @Override
    public void run() {
       //call update
       updateScoreTable();
    }
    
    public void updateScoreTable(){
     try {
         DefaultTableModel dtf = (javax.swing.table.DefaultTableModel) GameBoard.tblScoreBoard.getModel();
               dtf.setRowCount(0);
            ResultSet rs = null;
            String data[][] = null;

            rs = result.getRanking(1);//todomel
            ResultSetMetaData rsmd = rs.getMetaData();

            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                v.add(data[x][0] = rs.getString("Name"));
                v.add(data[x][1] = rs.getString("Level"+1+"Score"));//todomel
               // v.add(data[x][2] = rs.getString("Total"));
//                v.add(data[x][3] = rs.getString(""));
//                v.add(data[x][4] = rs.getString(""));
                dtf.addRow(v);
                //confirm = rs.getInt("confirm");
                x = x + 1;
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
}

