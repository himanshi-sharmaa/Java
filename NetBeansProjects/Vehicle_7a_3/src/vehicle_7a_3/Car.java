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
public class Car extends Vehicle_7a_3 {
    double speed;
    String size;

    public Car(double speed, String size) {
        this.speed = speed;
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
