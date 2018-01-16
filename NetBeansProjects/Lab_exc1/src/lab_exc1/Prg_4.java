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
public class Prg_4 {
     public static void main(String[] s){
// enter an Hexadecimal number 
        System.out.println("Please enter Hexadecimal number : ");
        Scanner scanner = new Scanner(System.in);
      
        String hexadecimal = scanner.next();
      
        //cnvert Hexa decimal number to Decimal
        int decimal = Integer.parseInt(hexadecimal, 16);
      
        System.out.println("Converted Decimal number is : " + decimal);
    
        //Convert hexa decimal number to binary        
        String binary = Integer.toBinaryString(decimal);
        System.out.printf("Hexadecimal to Binary conversion of %s is %s %n", hexadecimal, binary );
      
        // Convert Hex String to Octal
        String octal = Integer.toOctalString(decimal);
        System.out.printf("Hexadecimal to Octal conversion of %s is %s %n", hexadecimal, octal );
    }
}
