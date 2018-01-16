/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape_7b_3;

/**
 * @author himanshi sharma
 * Title:Define an abstract class named Shape that contains an empty method named numberOfSides().  Define three classes named Trapezoid, Triangle and Hexagon such that each one of the classes extends the class Shape.  Each one of the classes contains only the method numberOfSides() that shows the number of sides in the given geometrical figure.
Demonstrate how the Trapezoid, Triangle and Hexagon classes can be instantiated and their methods can be tested.
 * Logic: Declare a class Shape and override its method in its child classes.
 * Classes: DriverClass,Hexagon,Shape,Trapezoid,Triangle
 * Methods: main(),noOfSlides
 * Variable: Nil
 */
public class DriverClass {

  public static void main(String[] args){
      Shape obj1=new Triangle();
      Shape obj2=new Trapezoid();
      Shape obj3=new Hexagon();
      
      obj1.noOfSides();
      obj2.noOfSides();
      obj3.noOfSides();
  }    
}
