/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingdemo;

/**
 * @author himanshi sharma
 */

public class Person extends QueueDemo {
    //Constructor
    Person(String n){
        final String name=n;
        Thread t=new Thread(new Runnable(){
            //anonymous class
            @Override
            synchronized public void run(){
                //Anonymous class is made here
                phoneCall();
                
            }
            void phoneCall(){
                if(!occupied1){
                    occupied1=true;
                    System.out.println("Person on phone is : "+name);
                    
                    System.out.println("Person is off the phone now : "+ name);
                    occupied1=false;
                }else if(!occupied2){
                    occupied2=true;
                    System.out.println("Person on phone is: "+name);
                    System.out.println("The person is off the phone now : "+name);
                    occupied2=false;
                }
            }
        });
        t.start();
    }
}
