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
public class BankAcc {
 
    int accNum;
    int amt;

    //constructor
    //no argument ctor
    public BankAcc() {
    }
    //parameterised ctor

    public BankAcc(int accNum, int amt) {
        this.accNum = accNum;
        this.amt = amt;
    }

    //Accessers and mutatots
    //setters
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }
    //getters
    public int getAccNum() {
        return accNum;
    }

    public int getAmt() {
        return amt;
    }
    public void deposit(int amount){
        amt=amt+amount;
    }
    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount>amt){
            throw new InsufficientBalanceException(amt,amount);
        }
        else
            amt=amt-amount;
    }
    
    
}

