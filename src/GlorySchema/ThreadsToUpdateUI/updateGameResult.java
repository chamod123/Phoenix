/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.ThreadsToUpdateUI;
import GlorySchema.UpdateUI;
import Interface.GameResult;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melanie Rebecca
 */
public  class updateGameResult extends Thread {
   UpdateUI updateUI = new UpdateUI();;
     private volatile boolean running = true;
    @Override
    public void run() {
        while(running){
        try { 
        updateUI.updateLevelRanking();
        System.out.println("GameResult thread");
        Thread.sleep(1000);
         } catch (InterruptedException ex) {}
//        System.out.println("Shutting down thread");
        }
    }
    
     public void shutdown() {
    running = false;
  }
     
  public void sleepThread(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(updateGameResult.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
}


