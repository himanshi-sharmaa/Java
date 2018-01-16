/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;  //package name.
import java.util.Scanner;         //imported packages and files. 

/**
 * @author himanshi sharma
 * Title:
 * Logic:
 * Classes:
 * Methods:
 * Variables:
 */

//This is the main class.the program execution starts from here.
public class LibraryManagementSystem {
    
    //Execution begins from here.
    public static void main(String[] args) {
        
        //Declaration of Scanner Object
        Scanner s=new Scanner(System.in);
        
        //Object of OwnFaculty class and Others class
         OwnFaculty object1=new OwnFaculty();
         Others object2=new Others();
    
        //Vaiable declarations
        int choice,ch;
        int continue1,continue2;
        do{
        System.out.println("-----LIbrary Management System-----");
        System.out.println("1.Add book.");
        System.out.println("2.View Book.");
        System.out.println("Enter your choice: ");
        choice=s.nextInt();
        switch(choice){
            case 1: {
                      do{
                      System.out.println("-----ADD BOOK TO THE DATABASE-----");
                      System.out.println("1.SRM AUTHOR");
                      System.out.println("2.OTHER AUTHORS");
                      System.out.println("Enter your choice: ");
                      ch=s.nextInt();
                      switch(ch){
                          case 1: 
                              break;
                          case 2:
                              break;
                          default:System.out.println("Book cannot be added.You selected the wrong option.");    
                      }System.out.println("Continue adding the books?(yes-->1)");
                       continue2=s.nextInt();
                      }while(continue2==1);
                     }
                   break;
            case 2:{
                      do{
                      System.out.println("-----VIEW BOOK DETAILS FROM THE DATABASE-----");
                      System.out.println("1.SRM AUTHOR");
                      System.out.println("2.OTHER AUTHORS");
                      System.out.println("Enter your choice: ");
                      ch=s.nextInt();
                      switch(ch){
                          case 1: object1.printBookDetails();
                              break;
                          case 2: object2.printBookDetails();
                              break;
                          default:System.out.println("Book cannot be added.You selected the wrong option.");    
                      }System.out.println("Continue adding the books?(yes-->1)");
                       continue2=s.nextInt();
                      }while(continue2==1);
                     }
                   break;
            default: System.out.println("Invalid choice.");       
        }System.out.println("Do yo want to continue with the Library Management System?(1-->yes)");
         continue1=s.nextInt();
        }while(continue1==1);
    }
}
