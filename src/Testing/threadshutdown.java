/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author Melanie Rebecca
 */
public class threadshutdown extends Thread {
  private volatile boolean running = true;
  public void run() {
    while (running) {
      System.out.print(".");
      System.out.flush();
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {}
    }
  //  System.out.println("Shutting down thread");
  }
  public void shutdown() {
    running = false;
  }
  public static void main(String[] args)
      throws InterruptedException {
    threadshutdown t = new threadshutdown();
    t.start();
    Thread.sleep(5000);
    t.shutdown();
  }
}
