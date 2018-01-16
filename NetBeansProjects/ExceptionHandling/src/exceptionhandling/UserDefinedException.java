/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:Write a Java program for user defined exception that checks the internal and external marks; 
 * if the internal marks is greater than 30 it raises the exception “Internal mark exceeded”;
 * if the external marks is greater than 70 it raises the exception and displays the message “External mark exceeded”,
 * Create the above exception and test the exceptions.
 * Logic: two calsses are declared to handle the user defined exception.
 * Classes:InternalException,ExternalException,UserDefinedException
 * Method: toString(),internalMarks(),externalMarks()
 * Variables:imarks,emarks,ie,ee
 */

class InternalException extends Exception{
   @Override
   public String toString(){
       System.out.println("Internal marks are out of range.");
       return " ";
   }
}

class ExternalException extends Exception{
    @Override
    public String toString(){
        System.out.println("External marks are out of range.");
        return " ";
    }
        
}

//This class will act as the driver class.
public class UserDefinedException {
    Scanner s=new Scanner(System.in);
    int imarks,emarks;
    
    void internalMarks(){
        System.out.println("Enter the internal marks: ");
        imarks=s.nextInt();
        try{
              if(imarks>30){
                throw new InternalException();
            }
            }catch(InternalException ie){
            System.out.println(ie.toString());
        }  
    }
    
    void externalMarks(){
         System.out.println("Enter the external marks: ");
        emarks=s.nextInt();
         try{
              if(emarks>70){
                 throw new ExternalException();
             }
         }   catch(ExternalException ee){
            System.out.println(ee.toString());
        }  
    }
   public static void main(String[] args){
       UserDefinedException obj=new UserDefinedException();
       obj.internalMarks();
       obj.externalMarks();
   }    
}
