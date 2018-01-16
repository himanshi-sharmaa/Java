/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryinventoryproject;

/**
 * @author himanshi sharma
 * Title: Factory Inventory Project.
 * Logic: The toString() method of the Exception class is overridden here. 
 * Classes: LossException
 * Methods: toString()
 * Variables: Nil
 */

//This class will throw the loss exception.This is a user defined exception class.This class will be excecuted 
//if and only if we face loss in the project.
public class LossException extends Exception{
    
    @Override
    public String toString(){
    
        System.err.println("EXCETION THROWN BY THE FACTORY PROJECT : LOSS!!!");
        return " ";
    }
}
