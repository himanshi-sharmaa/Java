/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc4_5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Fields: balanceDue,annualInterestRate,monthlyPaymentRate,monthlyInterestRate,minMonthlyPayment,monthlyUnpaid,monthPayment
 *         finalMonthlyPayment,monthCount
 * Methods:input(),main()
 * Classes:FullPayment
 * @author himanshi sharma
 */
public class FullPayment {

    private static DecimalFormat df2=new DecimalFormat(".##");
    //Scanner object instantiation
    Scanner s=new Scanner(System.in);
    
   //variable declaration 
   double balanceDue,annualInterestRate,monthlyPaymentRate,monthlyInterestRate,minMonthlyPayment,monthlyUnpaid,monthPayment;
   double finalMonthlyPayment;
   int monthCount;
   
   void input(){
       
       double s1=0.0;
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
       s1=s1+minMonthlyPayment;
       balanceDue=(monthlyUnpaid)+(monthlyUnpaid*(0.18/12.0));     
       }
      
       System.out.println("Balance Due: "+balanceDue);
       monthPayment=balanceDue/12.0;
       finalMonthlyPayment=(int)(monthPayment+(s1/12));
       
       System.out.println("Fixed amount to be paid : "+df2.format(finalMonthlyPayment+1));
   }

   public static void main(String[] args){
       FullPayment mp=new FullPayment();
       mp.input();
   }
    
}
