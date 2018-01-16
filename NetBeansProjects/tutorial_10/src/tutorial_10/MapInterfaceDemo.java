/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;
import java.util.*;

/**
 *
 * @author himanshi sharma
 */
class AbstractMapDemo1 extends Collection{
    
}
class HashMapDemo1{
    
}
class TreeMapDemo1{
    
}

public class MapInterfaceDemo {
    public static void man(String[] args){
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