/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.io.FileInputStream;

/**
 *
 * @author himanshi sharma
 */
public class Others extends Books {
 
    void addDataToDataBase(){
        
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
