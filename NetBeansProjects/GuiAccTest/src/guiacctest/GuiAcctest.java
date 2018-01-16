/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacctest;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author himanshi sharma
 */
public class GuiAcctest extends Frame implements ActionListener {
    
    Label lab=new Label("label 1 ");
    Label lab1=new Label("label 2 ");
    Label l[]=new Label[4];
    TextField t[]=new TextField[4];
    Button b1=new Button("Create Account ");
    Button b2=new Button("Test Button ");
    BankAcc b;
    
    //constructor
    GuiAcctest(){
        addWindowListener(new NewWindowAdapter());
        setLayout(new GridLayout(5,2));
        Panel p=new Panel();
        Panel p1=new Panel();
        b1.addActionListener(this);
        b2.addActionListener(this);
        //setting layout for panel
        p.setLayout(new GridLayout(5,2));
        p1.add(lab);
        p1.add(lab1);
        l[0]=new Label("Account Number");
        l[1]=new Label("Intial balance");
        l[2]=new Label("Deposit");
        l[3]=new Label("Withdraw");
        
        for(int i=0;i<4;i++){
            p.add(l[i]);
            p.add(t[i]);
        }
        p.add(b1);
        p.add(b2);
        b2.setVisible(false);
        l[2].setVisible(false);
        l[3].setVisible(false);
        t[2].setVisible(false);
        t[3].setVisible(false);
        add(p);
        add(p1);        
    }
    String testAccount(int d_amt,int w_amt){
        String msg;
        b.deposit(d_amt);
        msg="Transaction successful";
        try{
            b.withdraw(w_amt);
            
        }catch(InsufficientBalanceException e){
    		e=new InsufficientBalanceException(b.amt,w_amt);
                msg=String.valueOf(e);
        }
        return msg;
    }
    public void actionPerformed(ActionEvent e){
        String str=e.getActionCommand();
      if(str.equals("Create Account")){            
        
        b=new BankAcc(Integer.parseInt(t[0].getText()),
                      Integer.parseInt(t[1].getText()));
        b2.setVisible(true);
        l[2].setVisible(true);
        t[2].setVisible(true);
        l[3].setVisible(true);
        t[3].setVisible(true);
        b1.setVisible(false);
        l[0].setVisible(false);
        t[0].setVisible(false);
        l[1].setVisible(false);
        t[1].setVisible(false);
            lab1.setText("Account : "+b.accNum+", CurrentBalance : "+b.amt);
				return;    
        }
        else{
            lab.setText(testAccount(Integer.parseInt(t[2].getText()),										Integer.parseInt(t[3].getText())));
        	lab1.setText("Account : "+b.accNum+", CurrentBalance : "+b.amt);
        }
    }
    public static void main(String[] args){
        GuiAcctest at=new GuiAcctest();
        at.setTitle("Banking System");
        at.setSize(600,200);
        at.setVisible(true);
    }
}
