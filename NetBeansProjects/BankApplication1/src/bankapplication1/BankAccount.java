/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */


public class BankAccount {

    //Scanner object declaration and instantiation.
    Scanner data=new Scanner(System.in);
    
  private double balance;
  private int accNo;
  private PersonalDetails person;
  
  public void credit(double amount){
      
      System.out.println("Enter you 16 digit account number: ");
      accNo=data.nextInt();
      
  }
  
  public double getBalance(){
  
      return balance;
      
  }
  
  public void debit(double amount){
      
  }
  
  
}
