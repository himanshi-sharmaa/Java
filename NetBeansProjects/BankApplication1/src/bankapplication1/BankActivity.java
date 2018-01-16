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
public class BankActivity {

  public static void main(String[] args){
      BankAccount bank=new BankAccount();
      bank.credit(500);
      bank.getBalance();
      bank.debit(1234.00);
  }    
}
