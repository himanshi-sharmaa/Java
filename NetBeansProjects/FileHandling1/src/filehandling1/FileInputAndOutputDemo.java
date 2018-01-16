/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling1;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

public class FileInputAndOutputDemo {

  public static void main(String[] args) throws FileNotFoundException, IOException{
      Scanner s=new Scanner(System.in);
     // int i;
      String str;
      System.out.println("Enter a number and a string: ");
     // i=s.nextInt();
      //str=s.next();
      FileInputStream fin=new FileInputStream("DemoFile.txt");
      {
        int i=fin.read();
         // str=fin.read();
          System.out.println((char)i);
      }
      fin.close();
  }    
}
