/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.Timer;

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
        Timer timer = new Timer();
        timer.schedule(new Hello(), 0, 1000);//1 Second

//################## therads ##############
        (new Thread(new HelloRunnable1())).start();
        (new Thread(new HelloRunnable2())).start();
    }

}
