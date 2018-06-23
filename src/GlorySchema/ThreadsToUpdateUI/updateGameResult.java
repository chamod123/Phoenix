/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.ThreadsToUpdateUI;

import GlorySchema.UpdateUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melanie Rebecca
 */
public class updateGameResult extends Thread {

    UpdateUI updateUI = new UpdateUI();
    private volatile boolean runningR = true;

    @Override
    public void run() {
        while (runningR) {
            try {
                Thread.sleep(1000);
                updateUI.updateLevelRanking();
                System.out.println("GameResult thread");
            } catch (InterruptedException ex) {
                Logger.getLogger(updateGameBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
//        System.out.println("Shutting down thread");
        }
    }

    public void shutdown() {
        runningR = false;
    }

    public void sleepThread() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(updateGameResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
