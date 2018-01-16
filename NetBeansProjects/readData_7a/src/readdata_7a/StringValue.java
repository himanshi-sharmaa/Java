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
public class StringValue {
Scanner s=new Scanner(System.in);
  //to read a string
      String readString(){
          
          String str;
           System.out.println("Enter a String :");
           str=s.next();
          
          return str;
          
      }
}
