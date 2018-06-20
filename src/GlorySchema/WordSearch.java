/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INDIKA
 */
public class WordSearch {
    private String word;
    private boolean checkSpell;
    
    public void matchWord(){
        
        setCheckSpell(false);
        BufferedReader br = null;
        FileReader fr;
        String Line;
        
        try {
            fr = new FileReader("dictionary.txt");
            br=new BufferedReader(fr);
            while((Line= br.readLine())!= null  ){
                 String x= getWord();
                 if(Line.equals(x)){
                 System.out.println("word===" + x );
                 setCheckSpell(true);
                 }else{
                 //do nothing
                 }
              }
         } catch (FileNotFoundException ex) {
            Logger.getLogger(WordSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WordSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    
    }
    public void checkSpelling(){}
    public void automaticSearch(){}
    public void manualSearch(){}

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the checkSpell
     */
    public boolean isCheckSpell() {
        return checkSpell;
    }

    /**
     * @param checkSpell the checkSpell to set
     */
    public void setCheckSpell(boolean checkSpell) {
        this.checkSpell = checkSpell;
    }
    
    
    
    
    
    
}
