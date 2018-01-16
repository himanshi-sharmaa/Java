/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo_7b;
import java.util.Scanner;

/**
 * @author himanshi sharma
 */

abstract public class BasicShape {

  private double area;
  
  BasicShape(){}
  
  public double getArea(){
     
      area=calcArea();
      return area;
  }
  
  abstract public double calcArea();
  
}
