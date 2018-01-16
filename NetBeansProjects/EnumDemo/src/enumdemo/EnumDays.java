/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

/**
 *
 * @author himanshi sharma
 */
//@documented
interface i1{
    
}
interface i2 extends i1{
    
}
public class EnumDays{
  enum Season{ WINTER(5),SPRING(10),SUMMER(15),FALL(20);}
  
  public static void main(String[] args){
      Season s=Season.WINTER;
      System.out.println(s);
      
  }
}
