/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author himanshi sharma
 */

public class Address {
   
   //instance variables. 
   String name;
   int doorNo;
   String street;
   String city;
   int postalCode;

   public Address(){}
   
    public Address(String name, int doorNo, String street, String city, int postalCode) {
        this.name = name;
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
