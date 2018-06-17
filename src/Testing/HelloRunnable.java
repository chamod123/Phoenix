/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD
 */
public class HelloRunnable {

//    public void run() {
//        for(int i=0; i< 10000 ; i++)
//        System.out.println("Hello from a thread!");
//        
//    }
//################ running this code and call hello class to run in every 1 second
    public static void main(String args[]) {
        try {
//            Timer timer = new Timer();//UpdateUI
//            timer.schedule(new Hello(), 0, 1000);//1 Second

//################## therads ##############
            HelloRunnable1 t = new HelloRunnable1();
            t.start();
            Thread.sleep(5000);
            t.shoutDown();
                    //(new Thread(new HelloRunnable1())).start();//UpdateUI
                    // (new Thread(new HelloRunnable2())).start();
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
