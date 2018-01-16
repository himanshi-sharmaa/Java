/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *Fields:n,sum
 * Methods:input(),logic(),main()
 * Classes:Series
 * @author himanshi sharma
 */
public class Series {
  Scanner s;
  int n;
 float sum;
 
  //input from user
   void input(){
      s=new Scanner(System.in);
       System.out.println("Enter the number: ");
      n=s.nextInt();
   }  
   
   //logic for series
   void logic(){
       System.out.println("Calculating the sum for the given series.");
       System.out.println("Current value of n : "+n);
       for(int i=1;i<=n;i++){
            System.out.println("Result : "+i);
            float t=(1/i);
            sum=(sum+t);
            System.out.println("Sum : "+sum);
       }
       System.out.println("Result : "+sum);
       
   }
   public static void main(String[] args){
      Series std=new Series();
      std.input();
      std.logic();
   }    
}
