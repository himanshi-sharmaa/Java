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
public class Circle extends BasicShape {
    
    long centerX,centerY;   //variables to hold the value of x and y coordinates respectively.
    double radius,areaCircle;

    Circle(){}
    
    public Circle(long centerX, long centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    
    void setCenterX(long centerX){
        this.centerX=centerX;
    }
    
    long getCenterX(){
        
        return centerX;
        
    }
    
    void setCenterY(long centerY){
        this.centerY=centerY;
    }
    
    long getCenterY(){
        
        return centerY;
        
    }
    
    
    @Override
   public double calcArea(){
    
       radius=Math.sqrt((centerX*centerX)+(centerY*centerY));
       areaCircle=3.14*radius*radius;
         return areaCircle;
         
    }
}
