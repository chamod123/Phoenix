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
public class HelloRunnable1 implements Runnable {

    @Override
    public void run() {
     for(int i=0; i< 10000 ; i++)
        System.out.println("---" + i);
    }


    
}
