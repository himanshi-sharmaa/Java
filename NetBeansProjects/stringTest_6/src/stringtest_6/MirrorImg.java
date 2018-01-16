/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:Create a class containing a method to create the mirror image of a String.
 *       The method should return the two Strings separated with a pipe(|) symbol.
 * Logic: reverse() function is used in the given program to reverse a string.
 * Classes: MirrorImg
 * Methods:  str(),main(String[] a)
 * Variables: s(Scanner object),string1,string2,string3,stringbuffer1,string
 */
public class MirrorImg {

    Scanner s=new Scanner(System.in);
    
    String str(){
        String string1,string2,string3;        
        
        System.out.print("Enter a string: ");
        string1=s.next();
        StringBuffer stringbuffer1=new StringBuffer(string1);
       
        System.out.println("The string entered by user is: "+stringbuffer1);
        StringBuffer stringbuffer2=new StringBuffer(string1);
        stringbuffer2.reverse();
        System.out.println("The reversed string is: "+stringbuffer2);

        stringbuffer1.toString();
        stringbuffer2.toString();
        string1=stringbuffer1+"|"+stringbuffer2; 
        return string1;
    }

   public static void main(String[] args){
       String string;
       
       MirrorImg obj1=new MirrorImg();
       string=obj1.str();
       System.out.println("The string is : "+string);
   }    
}
