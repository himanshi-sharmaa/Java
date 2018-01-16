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

class Outer1{
    private int num1=10;
    
    static class Inner1{
      
        void m1(){
            System.out.println("The outer objects value is: "+num1);
        }
    }
}
public class StaticInnerOuterTest {
    
    public static void main(String[] args){
        StaticInnerOuterTest m1=new StaticInnerOuterTest();
        
    }
}
