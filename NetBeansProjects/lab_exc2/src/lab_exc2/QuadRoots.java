/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

public class QuadRoots {
 
    Scanner s;
    int a,b,c;   //a,b,c are the coefficients in the quadratic equation.
    int d;
    float r1,r2; 

    //accesor and mutator
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
//stores discriminent value.
    void input(){
           
        //instatitaion of Scanner object
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b,c for ax^2+bx+c=0 :");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        
    }
    
    void discriminent(){
        d=(int)((b*b)-(4*a*c));
        System.out.println("Discriminent: "+d);
    }
     
    void roots(){
        if(d>=0){
        r1=(float)((-b)+(sqrt(d)))/(2*a);
        r2=(float)((-b)-(sqrt(d)))/(2*a);
        System.out.println("Root 1: "+r1);
        System.out.println("Root 1: "+r1);
  }
        else
            System.out.println("the given quadratic equation have imaginery roots.");
    }
    
    public static void main(String[] args){
        QuadRoots q1=new QuadRoots();
        q1.input();
        q1.discriminent();
        q1.roots();
    }
}
