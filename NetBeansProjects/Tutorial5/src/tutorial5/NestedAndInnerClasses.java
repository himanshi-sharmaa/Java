/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

/**
 * @author himanshi sharma
 *Title:
 * Logic:
 * Class:
 * Methods:
 * Variables:
 */

class OuterClass{
    
    //Private member of the outer class
    private int privateOuterNum=10;
    static private int privateStaticNum=15;
    
    //default ctor.
    OuterClass(){
        
    }
    
    //Constructor for the outer class.
    OuterClass(int num1){
        this.privateOuterNum=num1;
    }
    
    class InnerClass{
      
        //display function that can access outer class's variables.
       void display(){
           System.out.println("Inner class can access outer class's private variable.Value: "+privateOuterNum);
       }        
       
    }
    
    static class StaticInnerClass{
        
        //display method for StaticInnerClass
        void staticDisplay(){
            System.out.println("Static Inner class can access outer class's private variable.Value: "+privateStaticNum);
        }
    }
}

public class NestedAndInnerClasses {
   public static void main(String[] args){
       
       //OuterClass have a parameterised ctor hence instatantiation also needs a parameter.
       OuterClass o1=new OuterClass(50);
       OuterClass.InnerClass i1=o1.new InnerClass();
       i1.display();
       
       //Calling the method of the static nested class.
       OuterClass o2=new OuterClass();
       OuterClass.StaticInnerClass i2=new OuterClass.StaticInnerClass();
       i2.staticDisplay();
       
       
   }    
}
