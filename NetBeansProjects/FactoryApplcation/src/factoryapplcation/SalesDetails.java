/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryapplcation;

/**
 *
 * @author himanshi sharma
 */
public class SalesDetails extends ProductDetails {
 
  int salesCount;
  float salesPrice;
    
    SalesDetails(){}
    public SalesDetails(int salesCount, float salesPrice) {
        this.salesCount = salesCount;
        this.salesPrice = salesPrice;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }
  
}







