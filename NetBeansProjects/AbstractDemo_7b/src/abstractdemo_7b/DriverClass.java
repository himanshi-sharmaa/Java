/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo_7b;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:Abstract Class:
  Define an abstract class called BasicShape.Next, define a class named Circle. It should be derived from the BasicShape class.
  Next, define a class named Rectangle. It should be derived from the BasicShape class. 
  After creating these classes, create a driver program that defines a Circle object and a Rectangle object. Demonstrate that each object properly calculates and reports its area.

 * Logic: BasicShape is the abstract class whose method is overridden in its child classes.
 * Classes: DriverClass,BasicShape,Circle,Rectangle
 * Methods: DriverClass(),Circle(),circle(int),Rectangle(),Rectangle(int,int)
 * Variables:
 */
public class DriverClass {
    
    DriverClass(){}
    
  public static void main(String[] args){

      Scanner scannerObj=new Scanner(System.in);
    
      long circleX,circleY;
      long length,breadth;
      
      Circle obj1=new Circle();
      Rectangle obj2=new Rectangle();
      
      //Area of circle.
      System.out.println("Enter the coordinates for the circle: ");
      circleX=scannerObj.nextLong();
      circleY=scannerObj.nextLong();
      obj1.setCenterX(circleX);
      obj1.setCenterY(circleY);
      System.out.println("Area of circle: "+obj1.calcArea());
      
      //Area of rectangle
      System.out.println("Enter the length and breadth of rectangle: ");
      length=scannerObj.nextLong();
      breadth=scannerObj.nextLong();
      obj2.setLengthRect(length);
      obj2.setWidthRect(breadth);
      System.out.println("Area of Rectangle: "+obj2.calcArea());
      
  }    
}
