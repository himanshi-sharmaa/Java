/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *Fields:rowNum,i,j
 * Methods:input(),main(),transposee(),output()
 * Classes: Transpose
 * @author himanshi sharma
 */
public class Transpose {

    Scanner s;
      int rowNum,i,j;
        int a[][]=new int[10][10];   //array declaration
  
        
//takes a 2 D array as an input
     void input(){       
      s=new Scanner(System.in);
      System.out.println("Enter the number of Rows/column: ");
      rowNum=s.nextInt();
   System.out.println("Enter an array: ");
      for(i=0;i<rowNum;i++){
          for(j=0;j<rowNum;j++){
              a[i][j]=s.nextInt();
          }
      }
     }

     
//finds the transpose of a matrix
     void transposee(){
      
         for(i=0;i<rowNum;i++){
             for(j=0;j<rowNum;j++)
             {   
                 if(i<j){
        //         System.out.println(a[i][j]+" "+a[j][i]);
                 int temp;
                 temp=a[i][j];
                 a[i][j]=a[j][i];
                 a[j][i]=temp;
             }
             }     
         }

         System.out.println("The  array is : ");
      for(i=0;i<rowNum;i++){
          for(j=0;j<rowNum;j++){
              System.out.print(a[i][j]+" ");
          }System.out.println();
         
     }

     }
     
//gives output
     void output(){
     System.out.println("The  array is : ");
      for(i=0;i<rowNum;i++){
          for(j=0;j<rowNum;j++){
              System.out.print(a[i][j]+" ");
          }System.out.println();
         
     }
     }
     
 public static void main(String[] args){
     Transpose t=new Transpose();
     t.input();
     t.output();
     t.transposee();
    
 }    
}
