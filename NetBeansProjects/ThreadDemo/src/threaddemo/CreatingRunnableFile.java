/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author himanshi sharma
 */
public class CreatingRunnableFile implements Runnable{

  public void run(){
      System.out.println("Running...");
  }    
  
  public static void main(String[] args){
      CreatingRunnableFile m1=new CreatingRunnableFile();
      Thread t1=new Thread(m1);
      t1.start();
  }
}
