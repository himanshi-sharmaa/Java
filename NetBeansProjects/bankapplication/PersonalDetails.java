/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;
import java.util.Scanner;

/**
 *
 * @author HARI
 */
public class PersonalDetails {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    Scanner details;
    
    public PersonalDetails(){}
    public PersonalDetails(String firstName,String lastName,int age,Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    public String getFirstName(){
        details = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = details.nextLine();
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
        System.out.println("First name: " + this.firstName);
    }
    public String getLastName(){
        details = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        lastName = details.nextLine();
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
        System.out.println("Last name: " + this.lastName);
    }
    public int getAge(){
        details = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = details.nextInt();
        return age;
    }
    public void setAge(int age){
        this.age = age;
        System.out.println("Age: " + this.age);
    }
    public Address getAddress(){
        details = new Scanner(System.in);
        int doorNo;
        String street;
        int postalcode;
        String city;
        System.out.println("Enter your address: ");
        doorNo = details.nextInt();
        street = details.nextLine();
        postalcode = details.nextInt();
        city = details.nextLine();
        address = new Address(doorNo,street,postalcode,city);
        return address;
    }
    public void setAddress(Address address){
        this.address = address;
        System.out.println("Address: " + this.address.toString());
    }
    @Override
    public String toString(){
        return "Personal Details : [\nFirst name: " + firstName + ",\nLast name: " + lastName + ", \nAge: " + age +
                ", \nAddress: " + address +  "\n]";
    }
    public static void main(String[] args){
        String fname,lname;
        int age;
        Address add1;
        PersonalDetails person1 = new PersonalDetails();
        fname = person1.getFirstName();
        lname = person1.getLastName();
        age = person1.getAge();
        add1 = person1.getAddress();
        
        person1 = new PersonalDetails(fname,lname,age,add1);
        person1.toString();
    }
}
