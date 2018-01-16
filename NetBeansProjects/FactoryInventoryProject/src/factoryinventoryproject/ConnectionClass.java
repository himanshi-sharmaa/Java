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
   
    public void insertData(){
          try{
          
          String host,username,password;
          //host contains the address of the database connection.
          host="jdbc:derby://localhost:1527/FactoryInventoryProjectDataBase";
          username="root";
          password="root";
          Connection connection=DriverManager.getConnection(host,username,password);
          Statement statement=connection.createStatement();
         
       
          EmployeeDetails emp=new EmployeeDetails();
          
          String SQLQuery="INSERT INTO ROOT.EMPLOYEEDETAILS (EMPID,SALARY) VALUES ("+emp.getEmpId()+","+emp.getEmpSalary()+")";
          
          ResultSet rs=statement.executeUpdate(SQLQuery);
          
          Statement s=connection.createStatement();
          int count=statement.executeUpdate(SQLQuery);
          
      }//This below statement will be Executed only if there is some error in try block.
      catch(SQLException e){
          System.out.println(e.getMessage());
      }
    }
    /*
          public static void main(String[] args){
              new ConnectionClass();
                      
                      
          }
       
    */
   
}

