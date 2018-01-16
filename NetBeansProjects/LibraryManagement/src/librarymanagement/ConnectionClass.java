/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author himanshi sharma
 * 
 * This is the class which contains all the methods used for creating connection with database and 
 * also to store and remove data in and from the database.
 * 
 */

public class ConnectionClass {
     public void createdbfrDigital(String title,int bookId,String authorName,String yrOfPubl,int size){
        try{
            
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);

           PreparedStatement ps=c.prepareStatement("insert into ROOT.DIGITALBOOKS(TITLE,BOOKID,AUTHORNAME,YROFPUBL,SIZEINMB) values(?,?,?,?,?)");
           ps.setString(1, title);
           ps.setString(2,Integer.toString( bookId));
           ps.setString(3, authorName);
           ps.setString(4, yrOfPubl);
           ps.setString(5,Integer.toString(size));
           
           int i=ps.executeUpdate();
           System.out.println(i+" Added in DigitalBooks DataBase.");
            }catch(SQLException e){
            System.out.println(e.getMessage());
        }
      
    } 
     public void removeDigitalBook(int bookId){
            
         try{
           
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("Delete from ROOT.PAPERBOUNDBOOK where BOOKID = ?");
           ps.setString(1,Integer.toString(bookId));
 
           
           int i=ps.executeUpdate();
           System.out.println(i+" Book removed from DigitalBook DataBase.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
         
     }
     
     public void lendDigitalBook(int bookId){
           try{
           
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("Delete from ROOT.PAPERBOUNDBOOK where BOOKID = ?");
           ps.setString(1,Integer.toString(bookId));
 
           
           int i=ps.executeUpdate();
           System.out.println(i+" Book removed from DigitalBook DataBase.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
     }
     
     public void checkAvailabilityDigitalBook(String title){
        try{
            
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("Delete from ROOT.PAPERBOUNDBOOK where BOOKID = ?");
          //  ps.setString(1,Integer.toString(bookId));
 
           
           int i=ps.executeUpdate();
           System.out.println(i+" Book removed from PaperBoundBooks DataBase.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
          
         
     }
      public void createdbfrPaperBound(String title,int bookId,String authorName,String yrOfPubl,int noOfPages){
        try{
            
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("insert into ROOT.PAPERBOUNDBOOK(TITLE,BOOKID,AUTHORNAME,YROFPUBL,NOOFPAGES) values(?,?,?,?,?)");
           ps.setString(1, title);
           ps.setString(2,Integer.toString( bookId));
           ps.setString(3, authorName);
           ps.setString(4, yrOfPubl);
           ps.setString(5,Integer.toString(noOfPages));
           
           int i=ps.executeUpdate();
           System.out.println(i+" Added in PaperBoundBooks DataBase.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
      
    }
      public void removePaperBoundBook(int bookId){
        try{
            
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("Delete from ROOT.PAPERBOUNDBOOK where BOOKID = ?");
            ps.setString(1,Integer.toString(bookId));
 
           
           int i=ps.executeUpdate();
           System.out.println(i+" Book removed from PaperBoundBooks DataBase.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
          
      }
      
      public void lendPaperBoundBook(int bookId){
         try{
            
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("Delete from ROOT.PAPERBOUNDBOOK where BOOKID = ?");
            ps.setString(1,Integer.toString(bookId));
 
           
           int i=ps.executeUpdate();
           System.out.println(i+" Book removed from PaperBoundBooks DataBase.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
          
      }
      
      public void checkAvailabilityPaperBoundBook(String title){
         try{
            
            String host,username,password;
            username="root";
            password="root";
            host="jdbc:derby://localhost:1527/LibraryDB";
            Connection c=DriverManager.getConnection(host,username,password);
           
           PreparedStatement ps=c.prepareStatement("SELECT BOOKID from ROOT.PAPERBOUNDBOOK where TITLE = ?");
            ps.setString(1,title);
 
           
           int i=ps.executeUpdate();
           System.out.println(i+" EXIST IN DATABASE.");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
          
          
      }
         
}
