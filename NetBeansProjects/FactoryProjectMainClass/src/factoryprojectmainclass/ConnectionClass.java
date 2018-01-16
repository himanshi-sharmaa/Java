/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryinventoryproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author himanshi sharma
 */
public class ConnectionClass {
   
    public double calculateTotalSalary(){
          
          double salarySum=0.0;
          try{
          String host,username,password;
          //host contains the address of the database connection.
          host="jdbc:derby://localhost:1527/FactoryInventoryProjectDataBase";
          username="root";
          password="root";
          Connection connection=DriverManager.getConnection(host,username,password);
            Statement statement=connection.createStatement();
          String SQLQuery="SELECT SUM(SALARY) FROM ROOT.EMPLOYEESALARY";
       
//          EmployeeDetails emp=new EmployeeDetails();
          
//          String SQLQuery="INSERT INTO ROOT.EMPLOYEEDETAILS (EMPID,SALARY) VALUES ("+emp.getEmpId()+","+emp.getEmpSalary()+")";
          
          ResultSet rs=statement.executeQuery(SQLQuery);
          
  //        int count=statement.executeUpdate(SQLQuery);
          while(rs.next()){
              int column=rs.getInt(1);
              salarySum=salarySum+column;
          }
          
      }//This below statement will be Executed only if there is some error in try block.
      catch(SQLException e){
          System.out.println(e.getMessage());
      }
      
          return salarySum;
       
    }
   
 
}
