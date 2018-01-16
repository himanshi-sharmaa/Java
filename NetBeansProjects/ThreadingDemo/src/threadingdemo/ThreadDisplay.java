/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingdemo;

/**
 * @author himanshi sharma
 * Title:1.Write a Java program that executes three threads. First thread displays “Good Morning” every one second,
 * the second thread displays “Hello” every two seconds and the third thread displays “Welcome” every three seconds. 
 * Create the three threads by extending the Thread class.
 * Logic: sleep command is used for increasing the waiting time
 * Classes: DisplayGoodMorning,DisplayHello,DisplayWelcome
 * Methods: start,run
 * Variables: nil
 */

class DisplayGoodMorning extends Thread{
    @Override
    public void run(){
        System.out.println("GOOD MORNING!!!");
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class DisplayHello extends Thread{
    @Override
    public void run(){
        System.out.println("HELLO!!!");
        try{
            Thread.sleep(20000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class DisplayWelcome extends Thread{
   //Override annotation
    @Override
    public void run(){    //overrides the run function of the thraed class.
        System.out.println("WELCOME!!!");
        try{
            Thread.sleep(30000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
//Main thread.
public class ThreadDisplay {
    public static void main(String[] args){
        DisplayGoodMorning thread1=new DisplayGoodMorning();
        DisplayHello thread2=new DisplayHello();
        DisplayWelcome thread3=new DisplayWelcome();
       //start the thread and calls the run function. 
        thread1.start();
        thread2.start();
        thread3.start();
      }
}
