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
public class ProductDetails {
  
  int productId;
  int productCount;
  float productPrice;
   
    ProductDetails(){}
    public ProductDetails(int productId, int productCount, float productPrice) {
        this.productId = productId;
        this.productCount = productCount;
        this.productPrice = productPrice;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public int getProductCount() {
        return productCount;
    }

    public float getProductPrice() {
        return productPrice;
    }
  
  
}
