/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:Write a program called Bin2Dec to convert an input binary string into its equivalent decimal number. 
 * Logic:
 * Classes: BinaryToDecimal
 * Methods: binaryToDecimal(),main()
 * Variables:
 */

public class BinaryToDecimal {
   
    Scanner s=new Scanner(System.in);
   
    void binaryToDecimal(){
      
        String binary;
        int decimal;
        
        System.out.println("Enter a binary number: ");
        binary=s.next();
        decimal=Integer.parseInt(binary,2);
        System.out.println("Equilvalent decimal number : "+decimal);
        
    }
    
    public static void main(String[] args){
        
      BinaryToDecimal instance1=new BinaryToDecimal();
      instance1.binaryToDecimal();
      
    }    
}
