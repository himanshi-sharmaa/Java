/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryinventoryproject;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:
 * Logic:
 * Classes:
 * Methods:
 * Variable:
 */

//This class contains information about the employees of the factory.
public class EmployeeDetails extends ConnectionClass{
    
   // EmployeeDetails obj=new EmployeeDetails();
    
    //instance variables for EmployeeDeatils.
    int noOfEmployees=0;
    int empId;
    float empSalary;
    //declaration and instatiation of scanner object.    
    Scanner s=new Scanner(System.in);
    
    //constructors
    //no argument constructor
    EmployeeDetails(){}
    //parameterized constructor
    public EmployeeDetails( int empId, float empSalary) {
       // this.noOfEmployees = noOfEmployees;
        this.empId = empId;
        this.empSalary = empSalary;
    }
    
    
  //Accessers and mutators.
    //getters
    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public int getEmpId() {
        return empId;
    }

    public float getEmpSalary() {
        return empSalary;
    }
   //setters
    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

   void inputEmpDetails(){
       System.out.println("Enter the EmpID: ");
       this.empId=s.nextInt();
       System.out.println("Enter Employee Salary: ");
       this.empSalary=s.nextFloat();
       ++noOfEmployees;
/*
       String data="INSERT INTO ROOT.EMPLOYEEDETAILS (EMPID,SALARY) VALUES ("+empId+","+empSalary+")";
       String SQLQuery=data;
       ResultSet rs=statement.executeQuery(SQLQuery);
  */  
     
   }
  /* 
   void createArray(){
      ArrayList al=new ArrayList();
      al.add(new EmployeeDetails(121,154.0f));
          
   }
*/
    void displayEmpDeatils(){
        System.out.println("The Employee Deatils are as follows: ");
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Salary: "+empSalary);
    }
    
    float totalAmtSpentOnEmp(){
        float total;
        total=empSalary;
        return total;
    }
    
    
}
