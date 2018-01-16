/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprojectoperations;

import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

public class Employee {
   
   int id;
   int salary;

   Scanner s=new Scanner(System.in);
   
   //Constructor
   //no argument constructor
    public Employee() {
    }
   //parameterised constructor
    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    //Accessers and mutators
    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   //getters
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    
    void input(){
        System.out.println("Enter The Details for an employee");
        System.out.println("Enter employee id: ");
        id=s.nextInt();
        System.out.println("Enter the salary for the employee: ");
        salary=s.nextInt();        
    
        
    }
    
    void output(){
        
    }
   
   
}
