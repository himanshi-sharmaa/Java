/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc_5;

/**
 * @author himanshi sharma
 * Title: To write a program to demonstrate finalize() and garbage collection.
 * Logic: finalize method is called and then garbage collector is implemented.
 * Classes: GarbageCollection
 * Methods: GarbageCollection(int i){Constructor},finalize(),main(),gc()
 * Variables: i,gci1,gci2
 */

public class GarbageCollection {
    
    int i;
    GarbageCollection(int i){
        this.i=i;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Finalizing : "+i);
        super.finalize();
    }
    //we can call the finalize method as obj.finalize() 
    //or use Runtime.runFinalizersOnExit(true) which will run finalize
    //on all the objects. 
 
    public static void main(String[] args){
      try{
        GarbageCollection gci1=new GarbageCollection(10);
        GarbageCollection gci2=new GarbageCollection(20);
        gci1=gci2;
        System.gc();
     }catch(Throwable ex){
         
     } 
  }    
}
