/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author himanshi sharma
 */
public class FileHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{    
              try (FileInputStream fin = new FileInputStream("F:\\SRM\\DemoFile.txt")) {
                  int i=fin.read();
                  System.out.print((char)i);
              }    
          }catch(IOException e){System.out.println(e);}    
         }    

    }
    
