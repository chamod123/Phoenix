/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import GlorySchema.GameBoard.GameBoardScreen;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class timer extends Thread {

    int counter = 180;
    boolean isIt = false;

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
                GameBoardScreen.txtTime.setText(counter + "");
                counter--;
            } catch (InterruptedException ex) {
                Logger.getLogger(timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void shutdown() {
        running = false;
    }

    public void sleepThread() {
        try {
            Thread.sleep(180000); // 180s run it
        } catch (InterruptedException ex) {
            Logger.getLogger(timer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void runTheTime() {
//    Timer timer = new Timer();
//        counter = 100;
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                GameBoardScreen.txtTime.setText(Integer.toString(counter));
//                counter--;
//                if (counter == -1) {
//                    timer.cancel();
//                } else if (isIt) {
//                    timer.cancel();
//                    isIt = false;
//                }
//            }
//        };
    }

}
