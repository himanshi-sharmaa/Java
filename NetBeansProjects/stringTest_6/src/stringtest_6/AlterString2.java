/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:
 * Logic:
 * Classes:
 * Methods:
 * Variables:
 */

public class AlterString2 {

  Scanner s=new Scanner(System.in);
  
  void alterString(){
      
      String string1;
      char string2[],temp;
      int i;
      
      System.out.println("Enter a string: ");
      string1=s.next();
      string2=string1.toCharArray();
      System.out.println("The entered string is converted into an array: ");
      for(i=0;string2[i]!='\0';++i){
        System.out.println(string2[i]);
        //if(string2[i]==("A")||string2[i]!="E"||string2[i]!="I"||string2[i]!="O"||string2[i]!="U"){
        if(CharMatcher.anyOf(AEIOU).matches(string2[i]))  
        temp=string2[i];
            temp++;
            string2[i]=temp;
        }
      }
      for(char t:string2){
          System.out.println(t);
      }
  }
  
  public static void main(String[] args){
      AlterString2 obj=new AlterString2();
      obj.alterString();
      
  }
}
