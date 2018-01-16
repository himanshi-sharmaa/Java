/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc4_5;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *Fields: balanceDue,annualInterestRate,monthlyPaymentRate,monthlyInterestRate,minMonthlyPayment,monthlyUnpaid,monthCount
 * Methods:input(),main()
 * Classes:MinPayment
 * @author himanshi sharma
 */
public class MinPayment {
   
    private static DecimalFormat df2=new DecimalFormat(".##");
    
    //Scanner object instantiation
    Scanner s=new Scanner(System.in);
    
   //variable declaration 
   double balanceDue,annualInterestRate,monthlyPaymentRate,monthlyInterestRate,minMonthlyPayment,monthlyUnpaid;
   int monthCount;
   
   void input(){
       
       //takes balance due from the user
       System.out.println("Balance Due: ");
       balanceDue=s.nextDouble();
       
       //takes annual interest rate from user
       System.out.println("Enter the Annual Interest Rate: ");
       annualInterestRate=s.nextDouble();
       
       //takes time in months from user.
       System.out.println("Enter the number of months : ");
       monthCount=s.nextInt();
               
       //calculation logics
       for(int i=0;i<monthCount;i++){
       monthlyInterestRate=0.02;    //(annualInterestRate)/12.0;  
       minMonthlyPayment=(balanceDue*monthlyInterestRate);
       monthlyUnpaid=(balanceDue-minMonthlyPayment);
       
       balanceDue=(monthlyUnpaid)+(monthlyUnpaid*(0.18/12.0));     
       }
       
       //output statements
       System.out.println("Minimum monthly balance : "+minMonthlyPayment);
       System.out.println("Unpaid balance : "+df2.format(monthlyUnpaid));
       System.out.println("BALANCE DUE: "+df2.format(balanceDue));
   }

   public static void main(String[] args){
       MinPayment mp=new MinPayment();
       mp.input();
   }
}
