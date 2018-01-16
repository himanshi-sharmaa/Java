/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdata_7a;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class IntegerValue {
   
    Scanner s=new Scanner(System.in);
    
   //to read an integer value
   int readInteger(){
       int num;
       System.out.println("Enter a number: ");
       num=s.nextInt();
       return num;
   }    
}
