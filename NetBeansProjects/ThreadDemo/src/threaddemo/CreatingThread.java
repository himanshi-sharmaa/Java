/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

public class CreatingThread extends Thread{

    public void run(){
        System.out.println("Running...");
    }
  public static void main(String[] args){
      CreatingThread t1=new CreatingThread();
     // t1.start();
      t1.run();
     // t1.start();
  }    
}
