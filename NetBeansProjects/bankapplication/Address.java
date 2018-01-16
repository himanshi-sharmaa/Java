/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author HARI
 */
public class Address {

    private int doorno;
    private String street;
    private int postalCode;
    private String city;

    public Address(int doorno, String street, int postalCode, String city) {

        this.doorno = doorno;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getDoorNo() {
        return doorno;
    }

    public void setDoorNo(int doorno) {
        this.doorno = doorno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;

    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address : [\nDoorNo: " + doorno + ",\nstreet: " + street + ", \npostalCode: " + postalCode
                + ", \ncity: " + city + "\n]";
    }
}
