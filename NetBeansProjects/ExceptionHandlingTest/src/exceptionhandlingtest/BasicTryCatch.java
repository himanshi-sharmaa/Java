/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingtest;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * 
 */
public class BasicTryCatch {
  
    

  public static void main(String[] args){
    
      BasicTryCatchDemo obj=new BasicTryCatchDemo();
      obj.tryCatchDemo();
  }    
}


class BasicTryCatchDemo{
    
    int num1=0;
    
    void tryCatchDemo(){
        
        int x=10;
        try{
            int x1=100;
            x=x1/num1;
            
        }
        catch(Exception e){          //objects are created when exception arises
            System.err.println("Caught :"+e);
        }
        
    }

@Override
public String toString(){
  return "abc";
}
}