/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageP1;
//import classex1.*;

/**
 *
 * @author himanshi sharma
 */
public class A {
   int default_a=10; //default
   private int private_b=9;
   protected int protected_c=8;
   public int public_d=7;
  
    /**
     *
     * @param i
     * @param j
     * @param k
     */
   public A(){}
   public A(int i,int j,int k){
       System.out.println("Inside same class,same package: ");
       default_a=i;
       protected_c=j;
       public_d=k;
       System.out.println("A= "+default_a);
       System.out.println("B= "+private_b);
       System.out.println("C= "+protected_c);
       System.out.println("D= "+public_d);
   }

   
  
}