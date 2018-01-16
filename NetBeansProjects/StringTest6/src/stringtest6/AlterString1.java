/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest6;

import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 * Logic: All the consonants are stored in a string variable which is used for checking and incrementing the value.
 * Classes: AlterString1
 * Methods: alterString(String)
 * Variables: consonant,len,i,id,str
 */

public class AlterString1 {
    
    public String alterString(String string){
        String consonant="bcdfghjklmnpqrstvwxyz";
        char chars[]=string.toLowerCase().toCharArray();
        int len,i;
        for(i=0;i<chars.length;i++){
            //get the index of the consonant from the character array.
            int id=consonant.indexOf(chars[i]);
            if(id!=-1){
                chars[i]=consonant.charAt((id+1)%consonant.length());
            }
        }
        return new String (chars);
    }
    public static void main(String[] args){
       AlterString1 obj=new AlterString1();
       String str;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a  String str");
       str=s.next();
       System.out.println("The modified string is "+obj.alterString(str));
    }
}
