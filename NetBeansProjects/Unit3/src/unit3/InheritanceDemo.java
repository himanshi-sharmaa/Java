/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit3;

/**
 *
 * @author himanshi sharma
 */


class Parent{
    //instance variables
    int a;
    int b;
    
    //No argument ctor
    Parent(){
      System.out.println("Parent called");
    }
    
    Parent(int a,int b){
      this.a=a;      //this is used to assign the values to instance variables.
      this.b=b;
      
    }

    String display(){
        
        String s1=new String("Parent in display.");
        System.out.println(a+""+b);
        return s1;
    }    
}



class Child extends Parent{
    
    int c;
    
    
    Child(){
        System.out.println("Child called");
    }
    
    
    Child(int a,int b,int c){
    //  this.a=a;
    //  this.b=b;          //allowed
    
       super(a,b);
       this.c=c;
       System.out.println(a+" "+b+" "+c);  
    }
}

abstract class InheritanceDemo {
   abstract void abc();
 
      public static void main(String[] a){
        Parent ob1=new Parent();
        Parent ob2=new Parent(2,3);
        
        
        System.out.println(ob1.display());
        
        Child ob3=new Child(); //automatically the no argument ctor willbe called.
        Child ob4=new Child(2,3,5);
    }
}
