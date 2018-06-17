/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class HelloRunnable1 extends Thread {
public volatile boolean running = true;
    public void shoutDown(){
    running = false;
    }
    
    @Override
    public void run() {
        try {
            
            while(running){
             System.out.println("." );
            }
            System.out.println("shout down finish");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
          //  for (int i = 0; i < 10000; i++) {
//Pause for 1 seconds
               // Thread.sleep(1000);
            //    System.out.println("---" + i);
                
         //   }
           // Thread.State BLOCKED = Thread.State.BLOCKED;
        } catch (Exception ex) {
            Logger.getLogger(HelloRunnable1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
