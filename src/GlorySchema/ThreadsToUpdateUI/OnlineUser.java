/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.ThreadsToUpdateUI;

import GlorySchema.GameBoard.GameBoardScreen;
import GlorySchema.Player;
import static GlorySchema.Player.OnlinePlayers;
import GlorySchema.UpdateUI;
import Interface.SelectGame;
import static Interface.SelectGame.gameTypeid;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class OnlineUser extends Thread{
    Player player= new Player();
//    private volatile boolean running = true;

    @Override
    public void run() {
        while (OnlinePlayers != gameTypeid+1 ) {
            try {
                Thread.sleep(1000);
                player.getOnlineUser();
                System.out.println("methanta awa");
            } catch (InterruptedException ex) {
                Logger.getLogger(updateGameBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//        SelectGame selectGame=new SelectGame();
        GameBoardScreen gameBoard = new GameBoardScreen();
        gameBoard.setVisible(true);
//        selectGame.dispose();
    }

//    public void shutdown() {
//        running = false;
//    }

//    public void sleepThread() {
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(updateGameBoard.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}
