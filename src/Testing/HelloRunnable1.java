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
public class HelloRunnable1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10000; i++) {
//Pause for 1 seconds
               // Thread.sleep(1000);
                System.out.println("---" + i);
            }
        } catch (Exception ex) {
            Logger.getLogger(HelloRunnable1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
