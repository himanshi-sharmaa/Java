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

public class Sleep extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println("hey");
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
  public static void main(String[] args){
      Sleep t1=new Sleep();
      Sleep t2=new Sleep();
      
      t1.start();
      t2.start();
  }    
}
