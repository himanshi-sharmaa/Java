/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc_5;

/**
 * @author himanshi sharma
 * Title:Write a program to demonstrate overloaded methods and constructors. And justify with a
 * program what would happen if classes with constructors are inherited? Also demonstrate use of super and final.
 * Logic: Whenever an object is created for the subclass the corresponding parent class constructor is called.
 * Classes: ParentClass, OverloadedClass
 * Methods: ParentClass(),ParentClass(String s),OverloadedClass(),OverloadedClass(String s)
 * Variables: finalnum,number1,number2,
 */

public class OverloadedClass extends ParentClass {
    final int finalnum=10;
    //final variable cannot be modified in the program.
    int number1,number2;
    //no argument constructor
    OverloadedClass(){
        
        System.out.println("Parameterized constructor is called for OverloadedClass.");
     }
    //parameterised constructor
    OverloadedClass(String s){
         System.out.println("Default constructor is called for OverloadedClass.");
    } 
    
  public static void main(String[] args){
      OverloadedClass obj=new OverloadedClass();
      OverloadedClass ob1=new OverloadedClass("abc");
      
  }    
}
class ParentClass {
    ParentClass(){
        System.out.println("In the no argument constructor of ParentClass");
    }
    ParentClass(String s){
        System.out.println("In the parameterized constructor of ParentClass");
    }
}