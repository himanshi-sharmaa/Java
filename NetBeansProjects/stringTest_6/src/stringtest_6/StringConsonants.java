/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author himanshi sharma
 * Title: Create a method which accepts a String and replaces all the consonants in the
 *        String with the next alphabet
 * Logic:
 * Classes: StringConsonants
 * Methods: input(),main()
 * Variable:
 */
public class StringConsonants {
  Scanner s=new Scanner(System.in);
  String string;
  
  Static String alterString(String data){
      StringBuilder result=new StringBuilder();
      int length=data.length();
      ArrayList<Character> vowel=new ArrayList<>();
      vowel.add('a');
      vowel.add('e');
      vowel.add('i');
      vowel.add('o');
      vowel.add('u');
      vowel.add('A');
      vowel.add('E');
      vowel.add('I');
      vowel.add('O');
      vowel.add('U');
      
      for(int index=0;index<length;index++){
          if(vowel.contains(data.charAt(index))){
              result.append(data.charAt(index));
          }
          else{
              result.append(Character.toChars(data.charAt(index)+1));
          }
      }
      return result.toString();
      
  }
  //input method
  void input(){
      string=s.next();
  //    String s1=alterString(string);
      System.out.println(alterString(string));
  }
  
  public static void main(String[] args){
      StringConsonants obj=new StringConsonants();
      obj.input();      
  }    
}
