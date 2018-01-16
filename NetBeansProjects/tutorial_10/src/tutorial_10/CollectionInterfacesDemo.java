/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

class Collection{
    
}
class Set{
    
}
class List{
    
}
class Queue{
    
}
public class CollectionInterfacesDemo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       Collection obj1=new Collection();
       Set obj2=new Set();
       List obj3=new List();
       Queue obj4=new Queue();
       
        int choice,ch;
       do{        
        System.out.println("Select One:");
        System.out.println("1.Collection");
        System.out.println("2.Set");
        System.out.println("3.List");
        System.out.println("4.Queue");
        System.out.println("Enter your choice:");
        choice=s.nextInt();
        switch(choice){
            case 1:
                    break;
            case 2:
                  break;
                  
            case 3:
                   break;
                   
            case 4:
                  break;
            default:System.out.println("Invalid choice");      
       }System.out.println("Continue?(1-->Yes)");
       ch=s.nextInt();
    }while(ch==1);
 }
}
