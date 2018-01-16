/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingdemo;

/**
 * @author himanshi sharma
 * Title:. Write a program to demonstrate synchronization for the below scenario:There are 2 Telephone booths which has 
 * one telephone for service and there is queue of 5 people who can be guided to either of the booths but the condition to
 * be followed is “ A ongoing call conversation of a person should not be stopped in between”.
 * Logic: A synchronized run is overridden to change the functionality according to the given statement
 * Classes: QueueDemo,Person
 * Methods: main(),start,run
 * Variables: occupied1,occupied2
 */
public class QueueDemo {
    //for checking if the two phones are free or not
    boolean occupied1=false;
    boolean occupied2=false;
    public static void main(String[] args){
        //creation of 5 threads
        Person pObj1=new Person("A");
        Person pObj2=new Person("B");
        Person pObj3=new Person("C");
        Person pObj4=new Person("D");
        Person pObj5=new Person("E"); 
    }
}
