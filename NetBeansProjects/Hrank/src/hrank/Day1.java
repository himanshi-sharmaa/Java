/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
                /* Declare second integer, double, and String variables. */
         int num=12;
         double dNum=4.0;
         String str;//="is the best place to learn and practise coding!";  
         String str2;
         Scanner s1=new Scanner(System.in);
    //    System.out.println(str);
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
     //   System.out.println("Enter an integer: ");
        num=scan.nextInt();
     //   System.out.println("Enter a double value: ");
        dNum=scan.nextDouble(); 
     //   System.out.println("Enter a string: ");
     System.out.println("enter:");
     scan = new Scanner(System.in);
     str=scan.nextLine();
        System.out.println(str);
        /* Print the sum of both integer variables on a new line. */
        System.out.println((num+i));
        /* Print the sum of the double variables on a new line. */
		System.out.println((dNum+d));
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
      //  str=s1.nextLine();

        System.out.println(str);      
     str2=s.concat(str);       
System.out.println(str2);
     //   System.out.print(str);
    }
 }

 /*   
public class Day1 {
    int k;
    
}
*/