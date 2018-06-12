/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author CHAMOD
 */
public class HelloRunnable {

    public void run() {
        for(int i=0; i< 10000 ; i++)
        System.out.println("Hello from a thread!");
    }


    
    public static void main(String args[]) {
       (new Thread(new HelloRunnable1())).start();
       (new Thread(new HelloRunnable2())).start();
    }

}
