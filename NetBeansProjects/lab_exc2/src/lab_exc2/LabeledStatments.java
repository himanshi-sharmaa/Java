/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class LabeledStatments {
   Scanner s,d;
   
   //enhanced for loop(not working)
   void efor(){
       int i,n;
       int a[]=new int[10];
       s=new Scanner(System.in);
       d=new Scanner(System.in);
       System.out.println("Enter the number of elements to be entered : ");
       n=s.nextInt();
       System.out.print("Enter the elements:");
       for(i=0;i<n;i++){
           a[i]=d.nextInt();
         //  System.out.println(a[i]);
       }
      /*
       //using a normal for loop
       for(i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
     */
       //enhanced for loop for displaying.
       System.out.println("The Array is :");
       for(int j : a){
         //  System.out.println("hi");   //loop is working
           System.out.println(j);        //0 value is printed
       }
   }
   
   //labeled break.
   void ebreak(){
      int i,j,n;
      s=new Scanner(System.in);
      int a[][]=new int[10][10];
       System.out.println("Enter the number of elements to be enetered: ");
       int st=s.nextInt();
       //enter an array
       for(i=0;i<st;++i){
           for(j=0;j<st;++j){
             a[i][j]=s.nextInt();
           }
       }
       
       System.out.println("\n Enter the value to be searched: ");
       int val=s.nextInt();
       l: for(i=0;i<st;++i){
            for(j=0;j<st;++j){
                if(a[i][j]==val){
                    System.out.println("Index value: "+i+j);
                    System.out.println("Labeled break used.");
                     break l;
                }
            }
                
       }
   }
   
   //labeled continue
   void econtinue(){
      int i,j,n;
      s=new Scanner(System.in);
      int a[][]=new int[10][10];
       System.out.println("Enter the number of elements to be enetered: ");
       int st=s.nextInt();
       //enter an array
       for(i=0;i<st;++i){
           for(j=0;j<st;++j){
             a[i][j]=s.nextInt();
           }
       }
       
       System.out.println("\n Enter the value to be searched: ");
       int val=s.nextInt();
       l: for(i=0;i<st;++i){
            for(j=0;j<st;++j){
                if(a[i][j]==val){
                   // System.out.println("Index value: "+i+j);
                   // System.out.println("Labeled continue used.");
                     continue l;
                }
                else
                {
                    System.out.println(" "+a[i][j]);
                }
            }
                
       }
       
   }
 //main function the execution of the program begins here.
   public static void main(String[] args){
     LabeledStatments std=new LabeledStatments();
     std.efor();
     std.ebreak();
     std.econtinue();
  }    
}
