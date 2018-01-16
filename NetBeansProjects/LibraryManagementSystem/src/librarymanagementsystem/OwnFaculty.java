/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class OwnFaculty extends Books{
    Scanner s=new Scanner(System.in);
    
    /*
  String ISBNnumber;
  String bookName;
  String bookType;
  String authorType;
  String authorName;
  float bookCost;
    */
    //file handling is done in this portion of the code.
  void addBookToDataBase(){
    
  }
   @Override
   public void printBookDetails(){
         try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
 }

