/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javademo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author himanshi sharma
 */

public class ConnectionClassDemo {
   
 public static void main(String[] args){
   double sum=0.0;
   try{
       String host="jdbc:derby://localhost:1527/FactoryDataBase";
       String username="root";
       String password="root";
       Connection connection=DriverManager.getConnection(host,username,password);
       Statement statement=connection.createStatement();
       String SQLQuery="SELECT SUM(SALARY)  FROM ROOT.EMPLOYEEDETAILS";
       ResultSet rs=statement.executeQuery(SQLQuery);
       
       while(rs.next()){
           int sal=rs.getInt(1);
           sum=sum+sal;
       }
       System.out.println(sum);
       
   }   catch(SQLException e){
       System.out.println(e.getMessage());
   }
 }    
}
