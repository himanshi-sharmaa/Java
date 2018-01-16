/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingandcollectionstoragedemo;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author himanshi sharma
 */
public class ArrayListDemo {

 public static void main(String[] args){
     ArrayList<Integer> al=new ArrayList();
     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);
     al.add(50);
     al.add(60);
     
     Iterator i1=al.iterator();
    while(i1.hasNext()){
        System.out.println(i1.next());
    }
     /*for(int i:i1){
        System.out.println(i);
    } */
 }    
}
