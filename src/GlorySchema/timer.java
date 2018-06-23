/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import GlorySchema.GameBoard.GameBoard;
import GlorySchema.GameBoard.GameBoardScreen;
import static GlorySchema.ThreadsToUpdateUI.AllPlayerDone.moved;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class timer extends Thread {

    int counter = 50;
    boolean isIt = false;

    private volatile boolean running = true;
    GameBoard G = new GameBoard();

    @Override
    public void run() {
        while (counter >= 0 && !moved) {
            try {
                Thread.sleep(1000);
                GameBoardScreen.txtTime.setText(counter + "");
                counter--;
            } catch (InterruptedException ex) {
                Logger.getLogger(timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //stop time 
        if (!moved) {
            moved = true;
            G.skipLevel(GameBoardScreen.txtMainWord.getText());
        }
////////        GameBoard.levelNo += 1;
////////        if (GameBoard.levelNo > 5) {
////////            SummaryOfGame summary = new SummaryOfGame();
////////            summary.setVisible(true);
////////            // this.dispose();
////////
////////        } else {
////////            //level result 
////////            GameResult result = new GameResult();
////////            result.setVisible(true);
////////            // this.dispose();
////////
////////        }

    }

    public void shutdown() {
        running = false;
    }

    public void sleepThread() {
        try {
            Thread.sleep(5000); // 50s run it
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
