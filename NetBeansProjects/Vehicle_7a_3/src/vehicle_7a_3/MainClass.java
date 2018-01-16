/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_7a_3;

/**
 * @author himanshi sharma
 * Title:Create a base class called Vehicle that has the manufacturer’s name (type string) and number of cylinders in the engine (type int). 
 * Then create a class called Truck that is derived from Vehicle and has additional properties: the load capacity in tons (type double since 
 * it may contain a fractional part) and towing capacity in pounds (type int).
 * Define a Car class that is derived from the Vehicle class and define a class called SportsCar that is derived from Car class.
* . Write a driver programs to test the Car and SportsCar classes.
 * Logic: MainClass is the driver class here.
 * Classes: MainClass,SportsCar,Truck,Car,vehicle_7a_3
 * Methods: main(),getters and setters for all the variables
 * Variables: manufName,noOfCylinders,loadCapacity,toweringCapacity
 */
public class MainClass {
 
  public static void main(String[] args){
      Vehicle_7a_3 vehicleObj=new Truck(10,20);
      Vehicle_7a_3 car1=new Car(100,"Medium");
      System.out.println("Car Speed and Size:"+car1);
      Vehicle_7a_3 sCar1=new SportsCar(250,"Small");
      System.out.println("Sports car speed and Size"+sCar1);
      
  }    
}
