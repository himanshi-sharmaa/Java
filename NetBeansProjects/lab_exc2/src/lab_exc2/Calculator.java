/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *Fields:num1,num2,ch,choice
 * Methods:input(),calc(),main()
 * Classes:Calculator
 * @author himanshi sharma
 */
public class Calculator {
    
   Scanner s;
   int num1,num2;
   
   //for taking two numbers as input from the user.
   void input(){
     s=new Scanner(System.in);
     System.out.println("Enter two numbers : ");
     num1=s.nextInt();
     num2=s.nextInt();
   }
   //function to perform the basic arithmatic operations.
   void calc(){
       int ch,choice=0;
   do{
       System.out.println("----Menu----");
        System.out.println("1)Add");
         System.out.println("2)Subtract");
          System.out.println("3)Multiply");
           System.out.println("4)Divide");
            System.out.println("5)Modulo");
   System.out.println("Enter your choice: ");
   ch=s.nextInt();
   
   if(ch==1){
   System.out.println("Addition : "+(num1+num2));
   }
   else if(ch==2){
          System.out.println("Subtraction : "+(num1-num2));

   }
   else if(ch==3){
          System.out.println("Multiplication : "+(num1*num2));

   }
   else if(ch==4){
          System.out.println("Division : "+(num1/num2));

   }
   else if(ch==5){
          System.out.println("Remainder : "+(num1%num2));

   }System.out.println("Do you want to continue: ");
   choice=s.nextInt();
   }while(choice==1);
  }
  public static void main(String[] args){
      Calculator c=new Calculator();
      c.input();
      c.calc();
  }    
}
