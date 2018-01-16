/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title: Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string,
 * if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 * Logic: The alphabet at a particular index is checked with its preceeding alphabet.
 * Classes:  CheckPositive
 * Methods: checkPositive
 * Variables: i,bObj,sObj,cObj,s,sInput
 */

public class CheckPositive {

    boolean bObj;
    //checks if the string is positive.
    boolean stringPostive(String sInput){
        for(int i=0;i<sInput.length()-1;i++){
            if(sInput.charAt(i)>sInput.charAt(i+1)){
                bObj=false;
            }
           else
             bObj=true;
        }
        return bObj; 
    }
   public static void main(String[] args){
       String sObj;
       Scanner s=new Scanner(System.in);
       CheckPositive cObj=new CheckPositive();
       System.out.println("Enter a string: ");
       sObj=s.next();
       System.out.println("The String is positive: "+cObj.stringPostive(sObj));
   }    
}
