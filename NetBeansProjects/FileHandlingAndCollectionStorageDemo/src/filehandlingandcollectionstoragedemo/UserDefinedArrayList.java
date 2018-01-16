/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingandcollectionstoragedemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
class Employee{
    int id;
    float salary;

    public Employee(int id, float salary) {
        this.id = id;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public float getSalary() {
        return salary;
    }
    Scanner s=new Scanner(System.in);
    
    void insert(){
        System.out.println("Enter id and salary ");
        id=s.nextInt();
        salary=s.nextFloat();
    }
   void display(){
       System.out.println("Employee id: "+id);
       System.out.println("Employee salary: "+salary);
   }    
}
public class UserDefinedArrayList {
    
    public static void main(String[] args){
      //  Employee emp=new Employee();
        
        int  id1;
        float sal1;
        Scanner s=new Scanner(System.in);
        int noOfEmployees,i;
        ArrayList<Employee> empObj=new ArrayList();
        System.out.println("Enter the number of Employees you want to enter: ");
        noOfEmployees=s.nextInt();
        for(i=0;i<noOfEmployees;i++){
          Employee e1=new Employee(0,0);
          e1.insert();
           id1=e1.getId();
           sal1=e1.getSalary();
           Employee e2=new Employee(id1,sal1);
           empObj.add(e2);
        }
        
        Iterator i1=empObj.iterator();
         while(i1.hasNext()){
             Employee e4=new Employee(0,0);
             e4=(Employee) i1.next();
             System.out.println(e4.getId());
             System.out.println(e4.getSalary());
         }        
    }
}
