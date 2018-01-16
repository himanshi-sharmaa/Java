/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:
 * Logic:
 * Classes:
 * Methods:
 * Variables:
 */

public class ValidateCode {

    String s;
    int i;
    
    boolean validateCode(String str){
       boolean return1;
        int len=str.length();
        //check if the lengthis equal to 6
       if(len==6){
           //checks if the string starts with cod
            if(str.startsWith("cod")){
                for(i=0;i<str.length();i++){
                   
                }
            } 
            else{
                return1=false;
            }
       }
       else
           return1=false;
    return return1;
    }
   
   public static void main(String[] args){
       
       //variable declaration.
       Scanner s=new Scanner(System.in);
       String str1;
       //object declaration and instantiation
       ValidateCode obj=new ValidateCode();
      //taking input from user
       System.out.println("Enter a String: ");
       str1=s.next();
       obj.validateCode(str1);
   }    
}
