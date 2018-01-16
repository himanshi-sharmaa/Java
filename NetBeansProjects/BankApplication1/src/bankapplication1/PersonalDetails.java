/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class PersonalDetails {

  private String firstName;
  private String lastName;
  private int age;
  private Address address;
  
  //instantiation of Scanner object.
  Scanner details=new Scanner(System.in);
  
  //default ctor.
  public PersonalDetails(){}
  
  //parameterised ctor
  public PersonalDetails(String firstName,String lastName,int age,Address address){
      
      this.firstName=firstName;
      this.lastName=lastName;
      this.age=age;
      this.address=address;
      
  }
  
  //for taking first name as input.
  public String getFirstName(){
      
      System.out.println("Enter the first name: ");
      firstName=details.next();
      return firstName;
      
  }
  
  public void setFirstName(String firstName){
      
      this.firstName=firstName;
      System.out.println("First Name: "+this.firstName);
  }
  
  //for taking last name as input.
  public String getLastName(){
      
      System.out.println("Enter Last Name: ");
      lastName=details.next();
      return lastName;
      
  }
  
  public void setLastName(String lastName){
      
      this.lastName=lastName;
      System.out.println("Last Name: "+this.lastName);
      
  }
  
  //for taking age as input
  public int getAge(){
      
      System.out.println("Enter age: ");
      age=details.nextInt();
      return age;
      
  }
  
  public void setAge(int age){
      
      this.age=age;
      System.out.println("Age: "+age);
      
  }
  
  //for taking address as input.
  public Address getAddress(){
      int doorNo;
      String street;
      int postalCode;
      String city;
      
      System.out.println("Enter Address as given below:");
      System.out.print("Door number: ");
      doorNo=details.nextInt();
      System.out.print("Street: ");
      street=details.next();
      System.out.print("Postal Code: ");
      postalCode=details.nextInt();
      System.out.print("City: ");
      city=details.next();
      
     address=new Address(doorNo,street,postalCode,city);
     return address;
     
  }
  
  public void setAddress(){
      
      this.address=address;
      System.out.println("Address: "+this.address.toString());
      
  }
  
  @Override
  public String toString(){
 
      return "Personal Details: [\n First Name: "+firstName+" \nLastName: "+lastName+" \nAge: "+age+" \nAddress: "+address+"\n]";
      
  }
  
  public static void main(String[] args){
      
      //dummy variable declarations for calling the get methods
      String fName,lName;
      int age1;
      Address add;
      
      //object creation
      PersonalDetails p1=new PersonalDetails();
      
      fName=p1.getFirstName();
      lName=p1.getLastName();
      age1=p1.getAge();
      add=p1.getAddress();
      
      p1=new PersonalDetails(fName,lName,age1,add);
      p1.toString();
      
  }
}
