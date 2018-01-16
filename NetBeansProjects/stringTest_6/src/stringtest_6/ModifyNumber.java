/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title: Create a method that accepts a number and 
 * modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * Logic:
 * Classes: ModifyNumber
 * Methods: input(),modifyNumber(int),main(String)
 * Variables: s,num,numberModified,str,s1,
 */

public class ModifyNumber {
     
    Scanner s=new Scanner(System.in);
    int num,numberModified;
    String str,s1;
    char arr[],  newArr[];
    
   int input(){
      System.out.println("Enter a number(eg: 321): ");
      num=s.nextInt();
      return num;
   }
   int modifyNumber(int number){
       int i;
       System.out.println("The number entered by the user is "+number);
       //the integer is converted to a string.
       str=Integer.toString(number);
       System.out.println("The number is converted to a string: "+str);
       //converted to a character array.   
       arr=str.toCharArray();
       for( i=0;i<arr.length;i++){
           // newArr[i]=Integer.parseInt(str.charAt(i))-Integer.parseInt(str.charAt(i+1));
           int num1;
                   num1=Integer.parseInt(str.charAt(i));
    //     System.out.println(arr[i]);
    
         numberModified=Integer.parseInt(arr[i]-arr[i+1]);
      
       }
       return numberModified;
       
   }
   
  public static void main(String[] args){
      ModifyNumber obj=new ModifyNumber();
      obj.modifyNumber(obj.input());   
  }    
}
