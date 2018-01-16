/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryapplcation;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class EmployeeDetails {
  Scanner s=new Scanner(System.in);
   int empNo;
   int empId;
   String empName;
   float eSalary;

    public EmployeeDetails(int empNo, int empId, String empName, float eSalary) {
        this.empNo = empNo;
        this.empId = empId;
        this.empName = empName;
        this.eSalary = eSalary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public float geteSalary() {
        return eSalary;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void seteSalary(float eSalary) {
        this.eSalary = eSalary;
    }
   void addEmployeeDetails(){
       int id;
       System.out.println("Enter the Employee Id :");
       id=s.nextInt();
       setEmpId(id);
       
       
   }
   
}
