/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author himanshi sharma
 */

class Outer{
    private int num1=10;
    
    class Inner{
      
        void m1(){
            System.out.println("The outer objects value is: "+num1);
        }
    }
}
public class InnerOuterTest {

   public static void main(String[] args){
       InnerOuterTest t1=new InnerOuterTest();
       Outer o1=new Outer();
       Outer.Inner i1=o1.new Inner();
       //object of inner class calls the method m1
       i1.m1();
   }    
}
