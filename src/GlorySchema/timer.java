/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import GlorySchema.GameBoard.GameBoard;
import GlorySchema.GameBoard.GameBoardScreen;
import static GlorySchema.ThreadsToUpdateUI.AllPlayerDone.moved;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class timer extends Thread {

    int counter = 100;
    boolean isIt = false;
    GameBoardScreen boardscreen;

    private volatile boolean running = true;
    GameBoard G = new GameBoard();

    public timer(GameBoardScreen boardscreen) {
        this.boardscreen = boardscreen;

    }

    @Override
    public void run() {
        while (counter >= 0 && !moved) {
            try {
                Thread.sleep(1000);
                GameBoardScreen.txtTime.setText(counter + "");
                if(counter < 10){
                    GameBoardScreen.txtTimePanal.setBackground(Color.red);
                        }
                counter--;
            } catch (InterruptedException ex) {
                Logger.getLogger(timer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //stop time 
        if (!moved) {
            moved = true;
            if (!GameBoardScreen.isdone) {
                GameBoardScreen.isdone = true;
                G.skipLevel(GameBoardScreen.txtMainWord.getText(), boardscreen);
            }
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
            Thread.sleep(10000); // 100s run it
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
