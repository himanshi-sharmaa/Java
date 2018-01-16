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
public class C extends A {
    
    /**
     *
     * @param a
     * @param b
     * @param c
     */
   public C(int a,int b,int c){
        default_a=a;
        protected_c=b;
        public_d=c;
       System.out.println("In class C: "); 
       System.out.println("A= "+default_a);
  //     System.out.println("B= "+private_b);
       System.out.println("C= "+protected_c);
       System.out.println("D= "+public_d);
    }
    
    /*
    public static void main(String[] args){
        new C();
    }
    */
}
