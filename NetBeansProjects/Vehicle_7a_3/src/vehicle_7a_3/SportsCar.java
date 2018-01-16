/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_7a_3;

/**
 * @author himanshi sharma
 */
public class SportsCar extends Car {

    public SportsCar(double speed, String size) {
        super(speed, size);
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
