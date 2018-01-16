 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryinventoryproject;
import java.util.Scanner;

/**
 * @author himanshi sharma
 */

//This class holds all the variables and methods related to sales of the factory.
public class SalesDetails {
   
    static int salesCount;
    float salesPrice;
    int salesId;
    
    Scanner s=new Scanner(System.in);
    
    //constructors
    //No argument constructor
    public SalesDetails() {
    }
    //parameterised constructor.

    public SalesDetails(float salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    //Accessers and mutators
    //getters
    public static int getSalesCount() {
        return salesCount;
    }

    public float getSalesPrice() {
        return salesPrice;
    }
    //setters

    public static void setSalesCount(int salesCount) {
        SalesDetails.salesCount = salesCount;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    //Takes input from the concerned authority.
    void inputSalesDetails(){
        System.out.println("Enter the SalesID: ");
        salesId=s.nextInt();
        System.out.println("Enter the number of products sold: ");
        salesCount=s.nextInt();
        System.out.println("Enter the total cost of the product: ");
        salesPrice=s.nextFloat();
       
    }
    
    //Prints the sales details.
    void printSalesDetails(){
        System.out.println("---Sales Details---");
        System.out.println("Sales Price :"+salesPrice);
        System.out.println("");
        
    }
    
    //Returns the total amount gained during sales.
    float salesAmount(){
        float totalSales;
       totalSales=salesPrice*salesCount;        
        return totalSales;
    }
}
