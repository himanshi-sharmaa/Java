/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc1;

import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
 class Data {
     Scanner s;
    
    public void userChoice(){
        s=new Scanner(System.in);
        System.out.println("Enter Data: ");  
        String str=s.nextLine();
        System.out.println("The data entered by user is: "+str);
    }
}

public class Prg_3{
    
    public static void main(String[] args){
        new Data().userChoice(); 
    }
}
 