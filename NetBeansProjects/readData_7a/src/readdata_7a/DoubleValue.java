/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdata_7a;
import java.util.Scanner;
/**
 *
 * @author himanshi sharma
 */
public class DoubleValue {

    Scanner s=new Scanner(System.in);
   //To read a double value
    double readDouble(){
        double number;
        System.out.println("Enter a double number: ");
        number=s.nextDouble();
        return number;
    }
    
}
