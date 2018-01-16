/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagep2;
import packageP1.*;
//import classex1.*;
/**
 *
 * @author himanshi sharma
 */
public class D {

   D(int n1,int n2,int n3){
     A a= new A(n1,n2,n3);    
//    default_a=n1;    //default cannot be accessed from another package.
    //    protected_c=n2;  //protected can be used only by sub classes.
       System.out.println("In class C: "); 
  //     System.out.println("A= "+default_a);
  //     System.out.println("B= "+private_b);
  //     System.out.println("C= "+protected_c);
       System.out.println("D= "+a.public_d);
   }    
}
