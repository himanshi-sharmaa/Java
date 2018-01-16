/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc_5;

/**
 * @author himanshi sharma
 * Title: The below is a java program to demonstrate nested and inner classes. 
 * Logic: A class "Inner" is used which is both static and nested.Its method is called from the main function.
 * Classes: NestedAndInnerClasses, Inner
 * Methods: msg()
 * Variables: data
 */

public class NestedAndInnerClasses {
  static int data=30; 
  //Both a nested as well as inner class(inner: static class) 
  static class Inner{
      void msg(){
          System.out.println("Data is "+data);
      }
  } 
  public static void main(String[] args){
      Inner obj=new Inner();
       obj.msg();
  }    
}
