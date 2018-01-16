/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author himanshi sharma
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
 
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
       
       //print the data in n
       System.out.println(n);
       String ans="";
          
       if((n>=1)&&(n<=100)){
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else if(n%2==0)
      {
         
          if((n>2)&&(n<=5))
              ans="Not Weird";
          else if((n>=6)&&(n<=20))
              ans="Weird";
          else if(n>20)
              ans="Weird";
      }
      System.out.println(ans);
   
   
    }
    
}
