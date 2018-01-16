/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo_7b_2;

/**
 * @author himanshi sharma
 * Title:
 * Define an interface named TVStation with the following details:
Data Members:
	satelliteName – String
	cableTVName – String
	signalFrequency – double
Methods:
	show()- abstract method

Define another class named Programme, as shown below:
Data Members:
	programmeName – String
	sponsor	- String
Methods:
	Constructor
	display()

Define a class named Broadcast that implements the interface TVStation and extends the class Programme.
Create an object for the Broadcast class and invoke the methods

 * Logic: BroadCast is the driver class which implements the interface and extends the programme class.
 * Classes: BroadCast,Programme
 * Interface: TVStation
 * Methods: display,show
 * Variables: programeName,sponsor
 */
class BroadCast extends Programme implements TVStation{

    @Override
    void display(){
      System.out.println("The method of the Abstract class is overridden");  
      
     System.out.println(programeName);
    System.out.println(sponsor);
      
      
    }
    
    @Override
    public void show(){
        System.out.println("The method of the interface is implemented here");
     System.out.println(SATELLITENAME);
       System.out.println(CABLETVNAME);
        System.out.println(SIGNALFREQUENCY);
    }
    
    public static void main(String[] args){
        BroadCast obj=new BroadCast();
        obj.display();
        obj.show();
    }
}
