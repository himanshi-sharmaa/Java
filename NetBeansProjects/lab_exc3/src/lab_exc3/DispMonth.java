/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc3;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

//Working fine for the first time bt nt able to take inputs for multiple times.

public class DispMonth {

     Scanner s=new Scanner(System.in);
     
     
  public static void main(String[] args){
     
   // DispMonth dm=new DispMonth();
   Scanner s=new Scanner(System.in);
   String month;
   int c=0;
  do{
      
   System.out.println("Enter the month of the year :");
   month=s.next();
  
   switch(month){
       case "January":
       case "February":
       case "December":  System.out.println("It's Winters.");
                        break;
        
       case "March":
       case "April":
       case "May": System.out.println("It's Summers.");
                    break;
             
       case "June":
       case "July":
       case "August": System.out.println("It's Spring.");
                        break;
       case "September":
       case "October":
       case "November": System.out.println("It's Autumn.");
                        break;
      default:System.out.println("Invalid choice enter again as 'January'.");
       
   }System.out.println("Continue?(1/0)");
     c=s.nextInt();   
  }while(c==1);
 }
}
                                                                                                                                                                                                                                                                                                                                                             