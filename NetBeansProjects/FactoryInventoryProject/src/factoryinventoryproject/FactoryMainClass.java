/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryinventoryproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

//This contains the main function for te project "FACTORY INVENTORY PROJRECT"
public class FactoryMainClass {

    //Calculates the over all profit of loss.
    void calcProfitLoss(){
     EmployeeDetails empObj1=new EmployeeDetails();
     ProductDetails  proObj1=new ProductDetails();
     SalesDetails salObj1=new SalesDetails();
   
     float companySpent,companyGained,profit;
     companySpent=empObj1.totalAmtSpentOnEmp()+proObj1.totalProductPriceSpent();
     companyGained=salObj1.salesAmount();
     profit=companySpent-companyGained;
     try{
         if(profit<=0){
            throw new LossException();
         } else if(profit>0)
             System.out.println("Profit: "+profit);
     }catch(LossException e){
         System.out.println(e);
     }
    }
 public static void main(String[] args){
     
     Scanner s=new Scanner(System.in);
    /* 
     //This will create a connection for the class
     ConnectionClass ccObj=new ConnectionClass();
     ccObj.makeConnection();
     */
     
     FactoryMainClass factoryObj=new FactoryMainClass();
     EmployeeDetails empObj=new EmployeeDetails();
     ProductDetails  proObj=new ProductDetails();
     SalesDetails salObj=new SalesDetails();
     
     int choice1,choice2,choice3;
     int ch1,ch2,ch3;
                                 ConnectionClass obj= new ConnectionClass();
     
     do{
         System.out.println("-----Factory Inventory Project-----");
         System.out.println("1.Enter Data.");
         System.out.println("2.Read the existing Data.");
         System.out.println("3.Calculate Profit or Loss");
         System.out.println("Enter your choice: ");
          choice1=s.nextInt();
          switch(choice1){
              case 1:do{
                     System.out.println("---Enter Data---");
                     System.out.println("1.For Employee.");
                     System.out.println("2.For Product details.");
                     System.out.println("3.For Sales details.");
                     System.out.println("Enter your choice: ");
                     choice2=s.nextInt();
                     switch(choice2){
                         case 1: empObj.inputEmpDetails();
                                 obj.insertData();  
                         break;
                         case 2:proObj.inputProductDetails();
                             break;
                         case 3:salObj.inputSalesDetails();
                             break;
                         default:System.out.println("Invalid Choice.");    
                     }System.out.println("Continue Entering the data?1-->yes");
                     ch2=s.nextInt();
              }while(ch2==1);
                  break;
                  
                  
              case 2:do{
                  System.out.println("---Print Data---");
                     System.out.println("1.For Employee.");
                     System.out.println("2.For Product details.");
                     System.out.println("1.For Sales details.");
                     System.out.println("Enter your choice: ");
                     choice2=s.nextInt();
                     switch(choice2){
                         case 1:empObj.displayEmpDeatils();
                             break;
                         case 2:proObj.displayProductDetails();
                             break;
                         case 3:salObj.printSalesDetails();
                             break;
                         default:System.out.println("Invalid Choice.");    
                     }System.out.println("Continue printing the data?1-->yes");
                     ch3=s.nextInt();
                     }while(ch3==1);
                  break;
                  
                  
              case 3:factoryObj.calcProfitLoss();
                  break;
              default:System.out.println("Invalid Choice.");
          }System.out.println("Continue with the main menu?1-->yes");
          ch1=s.nextInt();
     }while(ch1==1);
     
 }    
}
 