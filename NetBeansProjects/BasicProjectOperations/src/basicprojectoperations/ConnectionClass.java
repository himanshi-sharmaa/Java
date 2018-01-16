/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprojectoperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author himanshi sharma
 */

//Connection class that connects the files with the sql database.
public class ConnectionClass {
    
    public double createdb(int i,int j){
        try{
            Employee e1=new Employee();
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/EmpDetails";
            Connection c=DriverManager.getConnection(host,username,password);
            Statement st=c.createStatement();
            int id,sal;
            id=e1.getId();
            sal=e1.getSalary();
            String sid,ssal;
            sid=Integer.toString(id);
            ssal=Integer.toString(sal);
            String query="INSERT INTO ROOT.EMP (EMPID,SALARY) VALUES ("+i+","+j+")";
            int count=st.executeUpdate(query);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return 0.0;
    }
}
