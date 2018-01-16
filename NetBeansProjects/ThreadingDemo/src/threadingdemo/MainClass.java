/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingdemo;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author himanshi sharma
 * Title:Create an Array of 9 numbers. And create three Threads to split the task evenly among the three threads. And each 
 * thread has to add up and report the answer to the main thread where the main thread waits for the 3 threads and computes 
 * the summation of all the three threads. Note: Assign names to the threads as well. 
 * Logic: An array is split into 3 parts and then its sum is calculated
 * Classes: MainClass
 * Methods: start,join
 * Variables: grandTotal,ar
 */

public class MainClass {

  static int grandTotal;
  public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      final int ar[]=new int[9];
      final AtomicInteger total=new AtomicInteger();
      System.out.println("Enter the elements of an array: ");
      for(int i=0;i<9;++i){
          ar[i]=s.nextInt();
      }
      
      for(int j=0;j<9;j+=3){
          final int x=ar[j];
          final int y=ar[j+1];
          final int z=ar[j+2];
          Thread t=new Thread(new Runnable(){
              public void run(){
                total.addAndGet(x);
                total.addAndGet(y);
                total.addAndGet(z);
                System.out.println(total.get());
                return;
              }
          });
          t.start();
          try{
              t.join();
          }catch(InterruptedException e){
              System.out.println("Exception thrown : "+e);
          }
      }
  }
}
