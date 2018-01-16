/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;
/**
 * @author himanshi sharma
 * Title: Create a method which can perform a particular String operation based on the user’s choice. 
 * The method should accept the String object and the user’s choice and return the output of the operation.  Options are 
 * A: Add the String to itself  
 * B: Replace alternate positions with *  
 * C: Remove duplicate characters in the String 
 * D: Change alternate characters to upper case 
 * Logic: String object is created in main and passed to the function to perform the desired operation.
 * Classes: ChangeString_6
 * Methods: changeString(String object,char ch)
 * Variables: strObj2,strObj,bufferObj,ch,i,choice
 */

public class ChangeString_6 {

    void changeString(String strObj,char ch){
        if(ch=='A'){
            String strObj2;
            strObj2=strObj.concat(strObj);
            System.out.println("The string is: "+strObj2);
        }
        else if(ch=='B'){
            StringBuffer bufferObj=new StringBuffer(strObj);
            int i;
            for(i=1;i<strObj.length();i+=2){
                bufferObj.deleteCharAt(i);
                bufferObj.insert(i,"*");
                
            }
            System.out.println("The string is :"+bufferObj);
        }
        else if(ch=='C'){
          //Remove duplicate characters.
          StringBuffer strBuff=new StringBuffer(strObj);
          
        }
        else if(ch=='D'){
          StringBuffer sb=new StringBuffer();
          int i;
          for(i=0;i<strObj.length();i++){
          //System.out.print( strObj.toUpperCase().charAt(i));
          if(i%2==0){
            sb.append(strObj.toUpperCase().charAt(i));
          }
          else{
              sb.append(strObj.charAt(i));
          }
          
          }
          System.out.println("The string is: "+sb);
          /*
         for(i=0;i<strObj.length();i++){
             System.out.print("The modified string is :"+strObj.charAt(i));
         }
       */
        }
        else
        {
            System.out.println("Enter a valid choice.");
        }
    }
    
  public static void main(String[] args){
    ChangeString_6 obj=new ChangeString_6();
    
    //declaration o variables and scanner object.
    Scanner s=new Scanner(System.in);
    String strObj1;
    char choice;
    
    //user input for string.
    System.out.println("Enter a String: ");
    strObj1=s.next();
    
    //user input for choice.
    System.out.println("-------Select one of the following-------");
    System.out.println("A. Add the String to itself.");
    System.out.println("B. Replace alternate positions with *.");
    System.out.println("C. Remove duplicate characters in the String.");
    System.out.println("D. Change alternate characters to upper case.");
    System.out.println("Enter your choice: ");
    choice=s.next().trim().charAt(0);
    
    //calling of the function.
    obj.changeString(strObj1,choice);
  }    
}
