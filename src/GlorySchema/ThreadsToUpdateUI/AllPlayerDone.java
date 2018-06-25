/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema.ThreadsToUpdateUI;

import GlorySchema.GameBoard.GameBoard;
import GlorySchema.GameBoard.GameBoardScreen;
import GlorySchema.Player;
import static GlorySchema.Player.OnlinePlayers;
import Interface.GameResult;
import static Interface.SelectGame.gameTypeid;
import Interface.SummaryOfGame;
import Interface.SummaryOfGame3;
import Interface.SummaryOfGame2;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class AllPlayerDone extends Thread {

    Player player = new Player();
    public static boolean moved = false;
    GameBoardScreen boardscreen;

    public AllPlayerDone(GameBoardScreen boardscreen) {
        this.boardscreen=boardscreen;
    }

    @Override
    public void run() {
        OnlinePlayers = 0;
        while (OnlinePlayers != gameTypeid + 1) {
            try {
                Thread.sleep(1000);
                player.getDoneLevel();
                System.out.println("complete level " + OnlinePlayers);
            } catch (Exception ex) {
                Logger.getLogger(updateGameBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        moved = true;
        GameBoard.levelNo += 1;
        System.out.println(GameBoard.levelNo);
        if (GameBoard.levelNo > 5) {

            if (gameTypeid == 1) {
                SummaryOfGame2 summary = new SummaryOfGame2();
                summary.setVisible(true);
            } else if (gameTypeid == 2) {
                SummaryOfGame3 summary = new SummaryOfGame3();
                summary.setVisible(true);
            } else if (gameTypeid == 3) {
                SummaryOfGame summary = new SummaryOfGame();
                summary.setVisible(true);
            }
            // this.dispose();
        } else {
            //level result 
            GameResult result = new GameResult();

            result.setVisible(true);
            // this.dispose();

        }
        
        System.out.println("----------------------dispose");
        boardscreen.dispose();

////        SelectGame selectGame=new SelectGame();
//        GameBoardScreen gameBoard = new GameBoardScreen();
//        gameBoard.setVisible(true);
////        selectGame.dispose();
    }
}
