/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;
import java.util.Scanner;
import java.util.*;

/**
  * @author himanshi sharma
  * Title:Write a program to demonstrate Map Interfaces: and Map Classes: Abstract Map, Hash Map, Tree Map
  * Logic: Data is stored and iterated in the given program
  * Classes: HashMapDemo,TreeMapDemo,MapClassDemo
  * Methods: hashMapDemo,treeMapDemo,mapClassDem
  * Variables: hm,tm,choice,ch
 */
class AbstractMapDemo{
    void abstractMapDemo(){
               
    }
}
class HashMapDemo extends Collection{
    void hashMapDemo(){
        HashMap<Integer,String> hm=new HashMap();
        hm.put(1,"C");
        hm.put(2,"C++");
        hm.put(3,"Java");
        hm.put(4,"C");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
class TreeMapDemo extends Collection{
    void treeMapDemo(){
     //Sorts and stores the input according to the key value
        TreeMap<Integer,String> tm=new TreeMap();
        tm.put(1,"C");
        tm.put(2,"C++");
        tm.put(6,"Java");
        tm.put(4,"C");
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
public class MapClassDemo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        HashMapDemo obj2=new HashMapDemo();
        TreeMapDemo obj3=new TreeMapDemo();
        int choice,ch;
        do{
        System.out.println("Select one:");
        System.out.println("1.AbstractMap ");
        System.out.println("2.HashMap ");
        System.out.println("3.TreeMap ");
        System.out.println("Enter your choice:");
        choice=s.nextInt();
        switch(choice){
            case 1:
                  break;
            case 2: obj2.hashMapDemo();
                   break;
            case 3:obj3.treeMapDemo();
                   break;
            default: System.out.println("Invalid choice.");
        }System.out.println("Continue?(1-->yes)");
         ch=s.nextInt();
        }while(ch==1);
    }
}
