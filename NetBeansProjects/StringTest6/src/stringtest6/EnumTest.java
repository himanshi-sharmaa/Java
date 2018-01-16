/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest6;

/**
 * @author himanshi sharma
 * Title:To write a program to demonstrate enumerations in java
 * Logic: A public enum is declared and its values are printed.
 * Classes: EnumTest
 * Methods: main()
 * Variables: s
 */
public class EnumTest {
  
public enum Season { WINTER, SPRING, SUMMER, FALL }  
  
public static void main(String[] args) {  
for (Season s : Season.values())  
System.out.println(s);  
  
}      
}
