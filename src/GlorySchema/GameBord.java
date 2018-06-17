/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import Db.DataBase;
import static Interface.LoginScreen.PlayerId;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INDIKA
 */
public class GameBord {
    
    DataBase db = new DataBase();

    char constLetters[] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    char vowelLetters[] = {'A', 'E', 'I', 'O', 'U'};
    char letterBag[] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z', 'A', 'E', 'I', 'O', 'U'};
    private char selectedVowel;
    private char selectedConst;
    private char initialLetter1;
    private char initialLetter2;
    private char initialLetter3;
    private int randomInt;
    private int randomVowInt;
    private int randomConInt;
    public static int levelNo = 1;
    Date time;

    public void getLetterBagWord() {

        Dictionary dict = new Dictionary() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Enumeration keys() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Enumeration elements() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object get(Object key) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object put(Object key, Object value) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Object remove(Object key) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

    }

    public void getInitialLetter() {
        random();
        setInitialLetter1(letterBag[randomInt]);
        random();
        setInitialLetter2(letterBag[randomInt]);
        random();
        setInitialLetter3(letterBag[randomInt]);

    }

    public void getConstent() {
        random();
        setSelectedConst(constLetters[randomConInt]);
    }

    public void getVowel() {
        random();
        setSelectedVowel(vowelLetters[randomVowInt]);
    }

    /**
     * @return the selectedVowel
     */
    public char getSelectedVowel() {
        return selectedVowel;
    }

    /**
     * @param selectedVowel the selectedVowel to set
     */
    public void setSelectedVowel(char selectedVowel) {
        this.selectedVowel = selectedVowel;
    }

    /**
     * @return the initialLetter1
     */
    public char getInitialLetter1() {
        return initialLetter1;
    }

    /**
     * @param initialLetter1 the initialLetter1 to set
     */
    public void setInitialLetter1(char initialLetter1) {
        this.initialLetter1 = initialLetter1;
    }

    /**
     * @return the initialLetter2
     */
    public char getInitialLetter2() {
        return initialLetter2;
    }

    /**
     * @param initialLetter2 the initialLetter2 to set
     */
    public void setInitialLetter2(char initialLetter2) {
        this.initialLetter2 = initialLetter2;
    }

    /**
     * @return the initialLetter3
     */
    public char getInitialLetter3() {
        return initialLetter3;
    }

    /**
     * @param initialLetter3 the initialLetter3 to set
     */
    public void setInitialLetter3(char initialLetter3) {
        this.initialLetter3 = initialLetter3;
    }

    public void random() {

        Random rand = new Random();

        randomInt = rand.nextInt(23) + 0;
        randomVowInt = rand.nextInt(4) + 0;
        randomConInt = rand.nextInt(18) + 0;

    }

    /**
     * @return the randomInt
     */
    public int getRandomInt() {
        return randomInt;
    }

    /**
     * @param randomInt the randomInt to set
     */
    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    /**
     * @return the selectedConst
     */
    public char getSelectedConst() {
        return selectedConst;
    }

    /**
     * @param selectedConst the selectedConst to set
     */
    public void setSelectedConst(char selectedConst) {
        this.selectedConst = selectedConst;
    }
    public void saveInitialLetters(String initialLetter1,String initialLetter2,String initialLetter3){
        
        try {
            
            PreparedStatement pst = (PreparedStatement) db.psmt("UPDATE  " +GameType.tableName+ " SET  Level"+levelNo+"Letter = '"+(initialLetter1+initialLetter2+initialLetter3)+"' WHERE PlayerID='"+PlayerId+"'");
            pst.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(GameBord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ResultSet retrieveInitialLetters(){
        
        ResultSet rs = null;
        try {
           // String query = "SELECT * FROM gameboard1 ORDER BY Total DESC";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
           String query = "SELECT playerName,Level"+levelNo+"Letter FROM  "+GameType.tableName+" ";//SELECT * FROM onlinegame O INNER JOIN gametype T ON O.gameTypeId = T.GameId  WHERE O.gameId LIKE  '" + gameid + "%'";
            rs = (ResultSet) db.fetch(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
        

}
