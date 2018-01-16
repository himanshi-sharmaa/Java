/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo_7b;

/**
 *
 * @author himanshi sharma
 */
public class Rectangle  extends BasicShape{

   private long widthRect;
   private long lengthRect;
   long areaRect;
   
   Rectangle(){}
   
    public Rectangle(long widthRect, long lengthRect) {
        this.widthRect = widthRect;
        this.lengthRect = lengthRect;
    }
   
     void setLengthRect(long length){
        this.lengthRect=length;
    }
     long setLengthRect(){
         return lengthRect;
     }
     
      void setWidthRect(long width){
        this.widthRect=width;
    }
     long setWidthRect(){
         return widthRect;
     }
     
    @Override
   public double calcArea(){
         
     areaRect=lengthRect*widthRect;
     return areaRect;
     
   }
}
