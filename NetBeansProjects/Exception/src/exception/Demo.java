/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 * @author himanshi sharma
 * 
 */

class ProcA{
    void finallyTest(){
        try{             
          throw new NullPointerException("Demo");
        }catch(NullPointerException e){
            System.out.println("In the catch of finallyTest."+e);
        }
       finally{
        System.out.println("In finally.");
        }
        
  }
}

class ProcB{
    static void Btest() throws NullPointerException{
        throw new NullPointerException();
    }
}
class ProcC{
    
}
public class Demo {
   public static void main(String[] args){
    /*
       try{
      ProcA obj=new ProcA();
      obj.finallyTest();
   }catch(NullPointerException e){
    System.out.println("Exception caught in main."+e);
 }  */
    try{
      new ProcB().Btest();
   }catch(NullPointerException e){
    System.out.println("Exception caught in main."+e);
   }
   }
}


