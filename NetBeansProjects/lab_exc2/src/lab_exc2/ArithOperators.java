/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *Fields: a,b,c(these are the variables used)
 * Methods:func1(),func2(),func3(),main()
 * Classes: ArithOperators
 * @author himanshi sharma
 */
public class ArithOperators {

    Scanner s=new Scanner(System.in);
    int a,b,c;     //variables used for function 1
    
    void func1(){
        System.out.println("Enter the values of a and b: ");
        a=s.nextInt();
        b=s.nextInt();
        c=(a<<2)+(b>>2);
        System.out.println("The result for first function is: "+c);
    }
    
    void func2(){
       int a,b,c,d,result;
       System.out.println("Enter the values for a,b,c and d :");
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
       d=s.nextInt();
       result=(a+(b*(c%d)-(a*d))/10);
       System.out.println("The result for function 2: "+result);
       
    }
    
    void func3(){
        int z,x,y;
        System.out.println("Enter the values of x and y");
        x=s.nextInt();
        y=s.nextInt();
       z=(++x)*(y--);
       System.out.println("The value of third function is: "+z);
    }
    
  public static void main(String[] args){
    ArithOperators a=new ArithOperators();
    a.func1();
    a.func2();
    a.func3();
  }    
}
