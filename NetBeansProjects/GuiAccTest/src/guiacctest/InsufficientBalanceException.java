/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacctest;

/**
 *
 * @author himanshi sharma
 */
public class InsufficientBalanceException extends Exception {
        int balance;
        int withdraw_amount;
        InsufficientBalanceException(int bal,int w_amt)
        {
			balance=bal;
			withdraw_amount=w_amt;
        }
        @Override
        public String toString()
        {
			return "Your withdraw amount ("+withdraw_amount+") is less than the balance ("+balance+"). No withdrawal was recorded.";
        }
	}