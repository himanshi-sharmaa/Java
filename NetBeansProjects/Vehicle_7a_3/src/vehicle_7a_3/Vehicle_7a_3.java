/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_7a_3;

/**
 *
 * @author himanshi sharma
 */
public class Vehicle_7a_3 {

    /**
     * @param args the command line arguments
     */
    
    String manufName;
    int noOfCylinders;

    public Vehicle_7a_3() {
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Vehicle_7a_3(String manufName, int noOfCylinders) {
        this.manufName = manufName;
        this.noOfCylinders = noOfCylinders;
    }

    public String getManufName() {
        return manufName;
    }

    public void setManufName(String manufName) {
        this.manufName = manufName;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }
    
}
