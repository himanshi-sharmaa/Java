/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_10;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:1. Create an enumeration of Apple types say Jonathan, GoldenDel, RedDel, Winesap, Cortland. Demonstrate the use of
 * methods values(), valueof() and also display all the apple types using both the ways 1. for each  and 2. switch. Do demonstrate
 * that given 2 apple types, your program is capable of finding if they are same type or different.
 * Logic: Enhanced for loop is used for displaying the values of enum 
 * Classes : EnumApple
 * Methods: switchEnum(),check(),main()
 * Variables: s,input,a1,sObj1,sObj2
 */


public class EnumApple {
    
    Scanner s=new Scanner(System.in);
    int input;
    
    public enum Apple{
        Jonathan(20,500), GoldenDel(1,100), RedDel(2,799), Winesap(98,987), Cortland(22,828);
        private int value;
        private int cost;
        private Apple(int value,int cost){
            this.value=value;
            this.cost=cost;
        }
    };
    
       //Creates the objects for Apple
        Apple JonathanAppObj=Apple.Jonathan;
        Apple GoldenDelAppObj=Apple.GoldenDel;
        Apple RedDelAppObj=Apple.RedDel;
        Apple WinesapAppObj=Apple.Winesap;
        Apple CortlandAppObj=Apple.Cortland;
        
        //Converts the given Apple Objects into string type
           String Jonathan=JonathanAppObj.toString();
           String GoldenDel=GoldenDelAppObj.toString();
           String RedDel=RedDelAppObj.toString();
           String Winesap=WinesapAppObj.toString();
           String Cortland=CortlandAppObj.toString();
    
    //function to perform switch operation
                    
           int dispBySwitch(String s){ 
           input=Apple.valueOf(s).value;
           

           switch(input){
               case 20: System.out.println("JONATHAN EXIST IN DATABASE.");
                                                break;
               case 1: System.out.println("GOLDENDEL EXIST IN DATABASE.");
                                  break;
               case 2: System.out.println("REDDEL EXIST IN DATABASE.");
                             break;
               case 98: System.out.println("WINESAP EXIST IN DATABASE.");
                              break;
               case 22: System.out.println("CORTLAND EXIST IN DATABASE.");
                               break;
               default: System.out.println("Out of Stock ");
           }
           return 0;
   }
    void check(){
        String sObj1,sObj2;
        System.out.println("Enter two types of apples: ");
        sObj1=s.next();
        sObj2=s.next();
         if((Jonathan.equals(sObj1))||(GoldenDel.equals(sObj1))||(RedDel.equals(sObj1))||(Winesap.equals(sObj1))||(Cortland.equals(sObj1))){
            System.out.println("Entered string 1 exist in database");
         if((Jonathan.equals(sObj2))||(GoldenDel.equals(sObj2))||(RedDel.equals(sObj2))||(Winesap.equals(sObj2))||(Cortland.equals(sObj2))){
            System.out.println("Entered string 2 also exist in the database.") ;             
             
                    if(sObj1.equals(sObj2)){
                        System.out.println("The given two apples are of same type.");
                    }
                    else{
                        System.out.println("The Given two are different types of apples");
                    }
         }
    }else
         {
             System.out.println("The input given by user does not match with the database.");
         }
  }
    //The exceution of the program begins here.
    public static void main(String[] args){
      Scanner s1=new Scanner(System.in);
        for(Apple appObj:Apple.values()){
            System.out.println(appObj);
        }
        
      //creates object for the given class
        EnumApple a1=new EnumApple();
        System.out.println("Enter the type of apple :");
        String str=s1.next();
        a1.dispBySwitch(str);
        a1.check();
        
    //Displays the value stored by valueof() function.
      //  System.out.println(Apple.valueOf("Jonathan"));
    }
 }