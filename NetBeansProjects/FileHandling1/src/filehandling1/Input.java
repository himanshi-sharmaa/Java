/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling1;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author himanshi sharma
 */
public class Input {
   
    Scanner s=new Scanner(System.in);
    //Instance Variables
    int i;
    String str;
    
   void inputInFile() throws IOException{
       System.out.println("In the Input file!");
        try {
           try (FileOutputStream inputFile = new FileOutputStream("F:\\SRM\\DemoFile.txt"); BufferedOutputStream inputFileBuffer = new BufferedOutputStream(inputFile)) {
               String st="hello";
               byte b[]=st.getBytes();
               inputFileBuffer.write(b);
           }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
   }
   
   void outputOnScreen() throws FileNotFoundException, IOException{
     FileInputStream fin=new FileInputStream("F:\\SRM\\DemoFile.txt");  
     int i=0;
     while((i=fin.read())!=-1){
          System.out.println((char)i);
      }    
     fin.close();
   }
     
  public static void main(String[] args) throws IOException{
      Input i1=new Input();
      i1.inputInFile();
      i1.outputOnScreen();
      
  }    
}
