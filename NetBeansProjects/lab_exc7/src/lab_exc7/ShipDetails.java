/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc7;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:Demonstrate the classes in a program that has a Ship reference. The Ship reference should be initialized with
 * the addresses of dynamically allocated Ship, CruiseShip, and CargoShip objects. The program should then call each
 * object’s print function. [Hint: Dynamic method dispatch]
 * Logic: The objects of the classes are declared in ShipDetails and their methods are called.Ship is the parent class of 
 * CruiseShip and CargoShip.
 * Classes: Ship,CruiseShip,CargoShip,ShipDetails
 * Methods: printDetails and getters and setters for different variables
 * Variables: shipName,shipYr,choice,s
 */

class Ship{
    
    //Instance variables
    String shipName;
    String shipYr;
    
    //no argument constructor
    Ship(){
    System.out.println("No argument Constructor for Ship is Called.");
    }
    
    //accesors and mutators
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipYr() {
        return shipYr;
    }

    public void setShipYr(String shipYr) {
        this.shipYr = shipYr;
    }

    //method for printing the details
   void printDetails(){
       
       System.out.println("Ship Name : "+shipName);
       System.out.println("Build in : "+shipYr);
   } 

    
   
}


//CruiseShip inherits the properties of the class Ship.
class CruiseShip extends Ship{
    
    int maxNoOfPassengers;


    //constructor
    CruiseShip(){
     System.out.println("No argument Constructor for CruiseShip is Called.");

    }    
    //accessors and mutators

    public int getMaxNoOfPassengers() {
        return maxNoOfPassengers;
    }

    public void setMaxNoOfPassengers(int maxNoOfPassengers) {
        this.maxNoOfPassengers = maxNoOfPassengers;
    }


   //OverRiding the display function of the Parent class(Ship).
       //method for printing the details
       @Override
    void printDetails(){
       
       System.out.println("Ship Name : "+shipName);
       System.out.println("Build in : "+maxNoOfPassengers);
   } 
}

class CargoShip extends Ship{
    
    int cargoCapacity;
    
    //constructor
    CargoShip(){
        System.out.println("No argument Constructor for CargoShip is Called.");
    }
    
    //accessor and mutator
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
   //Display method for printing the given details.
    @Override
     void printDetails(){
       
       System.out.println("Ship Name : "+shipName);
       System.out.println("Cargo Capacity : "+cargoCapacity);
   } 
       
    
}
public class ShipDetails {
    public static void main(String[] args){
    
        Scanner s;
        
        int choice,i,ch;
        String name,year;
        int capacity,noOfPassengers;
   /*     
        //object creation for parent class
        Ship shipInstance1=new Ship();
        shipInstance1.printDetails();
    
        //object creation for CruiseShip
        CruiseShip cruiseShipInstance=new CruiseShip();
        cruiseShipInstance.printDetails();
        
        //object creation for Cargo Class
        CargoShip cargoShipInstance=new CargoShip();
        cargoShipInstance.printDetails();
  */
   
        Ship shipInst;
        Ship shipInst1;
        do{
        //MENU CREATION
        System.out.println("----MENU----");
        System.out.println("1.Access Ship");
        System.out.println("2.Cruise Ship");
        System.out.println("3.Cargo Ship");

        System.out.print("Enter your choice:");
        s = new Scanner(System.in);
        choice=s.nextInt();
        switch(choice){
            case 1: shipInst=new Ship();
                    s = new Scanner(System.in);
                    System.out.print("Enter Ship Name: ");
                    name=s.nextLine();
                    shipInst.setShipName(name);
                    
                    System.out.print("The year in which ship is build: ");
                    year=s.nextLine();
                    shipInst.setShipYr(year);
                    
                    shipInst.printDetails();
                    break;
            
            case 2:
                shipInst1=new CruiseShip();
                    s = new Scanner(System.in);
                    System.out.print("Enter Ship Name: ");
                    name=s.nextLine();
                    shipInst1.setShipName(name);
                    
                    System.out.print("The maximum number of people it can accomodate : ");
                    noOfPassengers=s.nextInt();
                    shipInst1.setMaxNoOfPassengers(noOfPassengers);
                    
                    shipInst1.printDetails();
                break;
            
            case 3:
                shipInst=new CargoShip();
                    s = new Scanner(System.in);
                    System.out.print("Enter Ship Name: ");
                    name=s.nextLine();
                    shipInst.setShipName(name);
                    
                    System.out.print("Capacity : ");
                    capacity=s.nextInt();
                    shipInst.setCargoCapacity(capacity);
                    
                    shipInst.printDetails();
                break;
            
            default:System.out.println("Wrong Choice.");
            
        }System.out.print("Do you want to continue?(yes--1).");
         ch=s.nextInt();
        }while(ch==1);
    }
}
