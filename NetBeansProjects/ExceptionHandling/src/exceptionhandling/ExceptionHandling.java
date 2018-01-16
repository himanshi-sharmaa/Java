/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 * @author himanshi sharma
 * Title:Write a Java program with proper naming conventions and comments to illustrate the concept of:
 * try, catch, throw, throws and finally
 * Logic:try,catch and finally are implemented in the main method whereas throws and throw are implemented through the tryCatchTest()
 * Classes:ExceptionHandling
 * Methods: tryCatchTest(),main()
 * Variables: Nil
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    
    void tryCatchTest() throws RuntimeException{
    //This will create a runtime exception.
    System.out.println("In the tryCatchTest method.");
    throw new RuntimeException();
    //After the throw statement the control will shift to the main method.
//    System.out.println("After the exception is thrown.");
     
   }
    public static void main(String[] args) {
        // TODO code application logic here
      try{
          //the method will be called from the given statements.
         ExceptionHandling obj1=new ExceptionHandling();
         obj1.tryCatchTest();
      }catch(RuntimeException e){
          System.out.println("Exception caught in main: "+e);
      }
      finally{
          System.out.println("The finally method present in the main class is called.");
      }
    }
    
}
