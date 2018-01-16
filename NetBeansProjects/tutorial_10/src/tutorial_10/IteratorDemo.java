/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author himanshi sharma
 * Title:. Write a program to demonstrate power of Accessing via Iterators
 * Logic: We created an object of iterator to iterate a TreeSet
 * Classes: TreeSetDemo1,IteratorDemo
 * Methods: treeSetDemo()
 * Variables: al,treeSetbject,t1
 */
class TreeSetDemo1{
    void treeSetDemo(){
        TreeSet<String> treeSetObject=new TreeSet();
         treeSetObject.add("C");
         treeSetObject.add("C++");
         treeSetObject.add("Java");
         treeSetObject.add("C");

         System.out.println("HashSet includes:(Without using iterator)");
         System.out.println(treeSetObject);
        
         System.out.println("(With iterator)");
        Iterator<String> al=treeSetObject.iterator();
        while(al.hasNext()){
            System.out.println(al.next());
        }
         
    }
}
public class IteratorDemo {
  public static void main(String[] args){
   TreeSetDemo1 t1=new TreeSetDemo1();
   t1.treeSetDemo();   
  }    
}
