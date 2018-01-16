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

public class Truck extends Vehicle_7a_3{
    
    double loadCapacity;
    int toweringCapacity;

    public Truck(double loadCapacity, int toweringCapacity) {
        this.loadCapacity = loadCapacity;
        this.toweringCapacity = toweringCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getToweringCapacity() {
        return toweringCapacity;
    }

    public void setToweringCapacity(int toweringCapacity) {
        this.toweringCapacity = toweringCapacity;
    }
    
    
}


