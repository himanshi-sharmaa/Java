/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;
import java.util.Scanner;
/**
 *
 * @author HARI
 */
public class BankAccount {
    private double balance;
    private int acctNo;
    private PersonalDetails person;
    Scanner data;
    
    public void credit(double amount){
        data = new Scanner(System.in);
        System.out.println("Enter your 16-digit account no: ");
        acctNo = data.nextInt();
        
    }
    public double getBalance(){
        return balance;
    }
    public void debit(double amount){
        
    }
}
