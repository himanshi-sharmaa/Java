/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:
 * Logic:   Return the String replacing all the consonants with the next character.  
 * Classes: AlterStringConsonants
 * Methods: alterString
 * Variables:
 */

public class AlterStringConsonants {

    Scanner s=new Scanner(System.in);
    
    String stringInput,stringOutput;
    char temp;
    
    String alterString(){
    
      System.out.print("Enter the string: ");
      stringInput=s.next();
          
      StringBuffer string1=new StringBuffer("stringInput");
      
      char[] stringArray=stringInput.toCharArray();
      char[] vowels={'a','e','i','o','u'};
      
      int i,j;
      for(i=0;stringArray[i]!='\0';++i){
          for(j=0;vowels[i]!='\0';++j){
              if(stringArray[i]==vowels[j]){
                  temp=stringArray[i];
                  temp++;
                  stringArray[i]=temp;
              }
              
          }
        
        
    }
      
      stringOutput=stringArray.toString();
        return stringOutput;
    }
    
  public static void main(String[] args){
      AlterStringConsonants instance1=new AlterStringConsonants();
      String str1= instance1.alterString();
      System.out.println("The string is: "+str1);
  }    
}
