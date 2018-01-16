/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagep2;
//import classex1.*;
import packageP1.A;


/**
 *
 * @author himanshi sharma
 */
public class E extends A {
  
  public E(int num1,int num2,int num3){
  //     default_a=num1;       //default members cannot be accessed outside the package.
        protected_c=num2;
        public_d=num3;
       System.out.println("In class C: "); 
  //     System.out.println("A= "+default_a);     //default for A cannot be accessed in some other package.
  //     System.out.println("B= "+private_b);     //private variable for B.
       System.out.println("C= "+protected_c);
       System.out.println("D= "+public_d);
  }    
    
}
