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
public class BankActivity {
    public static void main(String[] args){
        BankAccount acct1 = new BankAccount();
        acct1.credit(5000);
        acct1.getBalance();
        acct1.debit(1500);
    }
}
