/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 * Homework:
 * try compareTo(),compareToignoreCase()equalsIgnoreCase(s122),startsWith(s2),endsWith("INDIA"),
 * stringSearch: indexOf("o"),lastIndexOf
 * subString,trim,concat,replace
 * methods: stringCharExtraction
 * @author himanshi sharma
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
     
     void stringCharExtraction(){
       
         char array1[]={'j','a','v','a'};
         
         //creating string object from char array.
         String s1=new String(array1);
         
         //extracting character from a string
         System.out.println("The array index for v is "+s1.charAt(2));
         
         char array2[]=new char[4];   //array object of size 4.
         
         //extracting more than one character from the string
         s1.getChars(0, 4, array2, 0);
         System.out.println(array2);
         
         //toChar or getChar can be used to explicitly create an array for the given string.
         char array3[]=new char[5];
         
         array3=s1.toCharArray();
         System.out.println("String converted into an array: ");
         System.out.print(array3);
         
         //to print the ascii values for java(use getBytes)
         byte array4[]=new byte[4];
         array4=s1.getBytes();
         System.out.println("String to Byte: ");
         
        
        // System.out.println(array4[0]);
         
         for(int i=0;i<4;i++){
             System.out.println(array4[i]);
         }
         
         
     }
     
     void stringComparision(){
         
         String s2="HELLO";
         String s3=s2;
         String s4=new String(s2);
         String s5="hello";
         
         System.out.println(s2==s3);
         System.out.println(s2.equals(s3));
         
         System.out.println(s3==s4);
          System.out.println(s3.equals(s4));
         
     }
     
     void stringModification(){
         
     } 
     
     void stringSearch(){
         
     }
     
   /* 
    public static void main(String[] args) {
        // TODO code application logic here
    }
   */
    
}
