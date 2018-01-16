/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingandcollectionstoragedemo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author himanshi sharma
 */

public class FileHandlingDemo {

    String line=null;
    
   public static void main(String[] args){
      String line=null;
       try{
           FileReader f1=new FileReader("C:\\Users\\himanshi sharma\\Documents\\NetBeansProjects\\FileHandlingAndCollectionStorageDemo\\src\\filehandlingandcollectionstoragedemo\\abc.txt");
           BufferedReader b1=new BufferedReader(f1);
        
           while((line=b1.readLine())!=null){
               System.out.println(line);
    
               b1.close();
           }
       }catch(Exception e){
           System.out.println("Exception thrown: "+e);
       }
       
   }    
}
