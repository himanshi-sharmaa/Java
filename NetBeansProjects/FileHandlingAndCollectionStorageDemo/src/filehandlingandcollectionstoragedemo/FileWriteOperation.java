/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingandcollectionstoragedemo;

import java.io.FileInputStream;

/**
 *
 * @author himanshi sharma
 */
public class FileWriteOperation {

  public static void main(String[] args){
      byte[] buffer=new byte[1000];
      try{
          FileInputStream f1=new FileInputStream("C:\\Users\\himanshi sharma\\Documents\\NetBeansProjects\\FileHandlingAndCollectionStorageDemo\\src\\filehandlingandcollectionstoragedemo\\abc.txt");
          int total=0;
          int nRead=0;
          while((nRead=f1.read(buffer))!=-1){
              System.out.println(new String(buffer));
          }
      }catch(Exception e){
          System.out.println(e);
      }
  }    
}
