/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number
 * is equal to the difference between two consecutive digits in the original number. The digit in the units place can be 
 * left as it is.  Note: Take the absolute value of the difference. Ex: 6-8 = 2 
 * Logic: The number is converted into string and then into stringbuffer object for the mathematical operation.
 * Classes: ModifyNumber
 * Methods: modifyNumber
 * Variables: str1,str2,number2,num1,num2,modifiedNum,i
 */

public class ModifyNumber {
  
    StringBuffer sObj1=new StringBuffer();
    String str1,str2;
    int num1,num2,modifiedNum;
    
    int modifyNumber(int number1){
     
        str1=new String(Integer.toString(number1));
        for(int i=0;i<str1.length()-1;i++){
            //used to get the numerical values at index i and i+1.
         num1=Character.getNumericValue(str1.charAt(i));
         num2=Character.getNumericValue(str1.charAt(i+1));
         //subtract and add the value to stringBuffer object.
         sObj1.append(Math.abs(num1-num2));
        }
        sObj1.append(str1.charAt(str1.length()-1));
         //convert to string
         str2=sObj1.toString();
         modifiedNum=Integer.parseInt(str2);
        
        return modifiedNum;        
    }
  public static void main(String[] args){
    ModifyNumber obj=new ModifyNumber();
      
    int number2;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number:");
    number2=s.nextInt();
    System.out.println("The modified number is: "+obj.modifyNumber(number2));
    
  }    
}
