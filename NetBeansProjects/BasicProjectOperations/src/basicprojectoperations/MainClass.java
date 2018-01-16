/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprojectoperations;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */


public class MainClass {

  public static void main(String[] args){
      
      int ch=0,choice=0;
      int noOfRecords;
      
      Scanner s=new Scanner(System.in);
      
      do{
      
          System.out.println("-----Employee management System-----");
          System.out.println("1.Add Record.");
          System.out.println("2.Display Record.");
          System.out.println("3.Delete Record.");
          System.out.println("Enter your choice: ");
          choice=s.nextInt();
       
          switch(choice){
              case 1:  System.out.println("Enter the number of records you want to enter?");
                       noOfRecords=s.nextInt();
                       
                  break;
              case 2:
                  break;
              case 3:
                  break;
              default:System.out.println("Invalid choice.");   
          }System.out.println("Continue with the main menu?(1-->yes)");
          ch=s.nextInt();
      }while(ch==1);
  }    
}
