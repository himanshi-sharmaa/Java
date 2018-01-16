/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5;

import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:
 * Logic:
 * Class:
 * Methods:
 * Variables:
*/

//class solely for the purpose to show constructor overloading.
class ConstructorOverloading{
    
    ConstructorOverloading(){
        System.out.println("Default constructor");
    }
    
    ConstructorOverloading(int parameter1){
        System.out.println("Parameterised constructor and the value passed is "+parameter1);
    }
            
}

 class FunctionOverloading{
     Scanner s=new Scanner(System.in);
     int num1,num2,sum=0;
     
     int input(){
         System.out.println("ENTER TWO NUMBERS: ");
         num1=s.nextInt();
         num2=s.nextInt();
         //add(num1,num2);
         return 0;
         
     }
     
     void add(int arg1,int arg2){
         System.out.println("Sum(WITH PARAMETER)= "+(arg1+arg2));
     }
     
     void add(){
         System.out.println("Sum(Without parameters)="+(num1+num2));
     }
 }

public class Overloading {
    final int a=10;
    
    void modifyA(){
        //since "a" is declared as final it cannot be modified.
       // a=a+1;
       System.out.println("'a' is final variable so it cannot be changed.");
    }
    
    public static void main(String[] args){
        
        //used for calling 
        Overloading o1=new Overloading();
        o1.modifyA();
        
        //instantiation for ConstructorOverloading class
        ConstructorOverloading c1=new ConstructorOverloading(10);
        
        //instantiation for FunctionOverloading class
        FunctionOverloading fo1=new FunctionOverloading();
        fo1.input();
        fo1.add();
        fo1.add(1,2);
    }
}
