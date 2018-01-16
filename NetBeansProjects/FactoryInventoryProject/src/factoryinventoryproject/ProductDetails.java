/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryinventoryproject;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title: Factory Inventory Project
 * Logic:
 * Classes: ProductDetails
 * Methods: 
 * Variables: productCount,productId,productPrice
 */

//This class contains the product details.
public class ProductDetails {
    
    static int productCount=0;
    int productId;
    float productPrice;

    Scanner s=new Scanner(System.in);
   // ProductDetails productObject=new ProductDetails();
    
    //constructors.
    //no argument constructor
    ProductDetails(){}
    //Parameterised constructor
    public ProductDetails(int productId, float productPrice) {
        this.productId = productId;
        this.productPrice = productPrice;
    }

    //Accessers and mutators.
    //getters
    public static int getProductCount() {
        return productCount;
    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice() {
        return productPrice;
    }
    //setters.
    public static void setProductCount(int productCount) {
        ProductDetails.productCount = productCount;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
   
    //For takinginput from the authority.
    void inputProductDetails(){
   
        //We have used setters in this function so we can give inputs from the main function to be used here. 
        System.out.println("---Product Details---");
        System.out.println("Enter the product Id ");
        productId=s.nextInt();
        System.out.println("Enter product Price: ");
        productPrice=s.nextFloat();
    }    
    
    //To diplay the details of all the products.
    //use product count as well
    void displayProductDetails(){
        
        System.out.println("---Product Details---");
        System.out.println("Product ID : "+productId);
        System.out.println("Product Price : "+productPrice);
        
    }
    
    //Calculates and returns the total cost spend on th products.
    float totalProductPriceSpent(){
        float totalProductPrice;
         totalProductPrice=productPrice;        
        return totalProductPrice;
    }
   
    
}
