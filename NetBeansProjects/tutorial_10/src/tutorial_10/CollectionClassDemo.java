/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
/**
 * @author himanshi sharma
 * Title:Write a program to demonstrate Collection Classes: Array List, Hash Set and Tree Set
 * Logic: Create a list of type ArrayList,TreeSet and HashMap and iterate through the list
 * Classes: ArrayListDemo,HashSetDemo,TreeSetDemo,CollectionSetDemo
 * Methods: arrayListDemo(),hashSetDemo(),treeSetDemo()
 * Variables: choice,ch,obj1,obj2,obj3,arrayObject,hashSetObject,treeSetObject
 */
class ArrayListDemo{
    void arrayListDemo(){
        //Array list supports duplicate values
        ArrayList<String> arrayObject=new ArrayList();
        arrayObject.add("C");
        arrayObject.add("C++");
        arrayObject.add("Java");
        arrayObject.add("C");
        System.out.println("ArrayList includes:");
        for(String s:arrayObject){
            System.out.println(s);
        }
    }
}
class HashSetDemo{
    void hashSetDemo(){
        HashSet<String> hashSetObject=new HashSet();
        hashSetObject.add("C");
        hashSetObject.add("C++");
        hashSetObject.add("java");
        hashSetObject.add("C");
        System.out.println("HashSet includes:");
            System.out.println(hashSetObject);
       
         Iterator<String> i1=hashSetObject.iterator();
         while(i1.hasNext()){
             System.out.println(i1.next());
         }
        
    }
}
class TreeSetDemo{
    void treeSetDemo(){
        TreeSet<String> treeSetObject=new TreeSet();
         treeSetObject.add("C");
         treeSetObject.add("C++");
         treeSetObject.add("Java");
         treeSetObject.add("C");

         System.out.println("HashSet includes:");
         System.out.println(treeSetObject);

        Iterator<String> al=treeSetObject.iterator();
        while(al.hasNext()){
            System.out.println(al.next());
        }
         
    }
}
public class CollectionClassDemo {
  public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       ArrayListDemo obj1=new ArrayListDemo();
       HashSetDemo obj2=new HashSetDemo();
       TreeSetDemo obj3=new TreeSetDemo();
       Queue obj4=new Queue();
       
        int choice,ch;
       do{        
        System.out.println("Select One:");
        System.out.println("1.ArrayList");
        System.out.println("2.HashSet");
        System.out.println("3.TreeSet");
        System.out.println("Enter your choice:");
        choice=s.nextInt();
        switch(choice){
            case 1: obj1.arrayListDemo();
                    break;
            case 2:obj2.hashSetDemo();
                  break;
                  
            case 3:obj3.treeSetDemo();
                   break;
            default:System.out.println("Invalid choice");      
       }System.out.println("Continue?(1-->Yes)");
       ch=s.nextInt();
    }while(ch==1);
 }  
}
