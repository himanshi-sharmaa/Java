/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class MirrorImage {
    
    String string1,string2,string3;
    Scanner s=new Scanner(System.in);
    
    String getImage(){
        
        StringBuilder string2=new StringBuilder("abc");
        System.out.println("Enter a String: ");
        string1=s.next();
        string2=string1.reverse();     
        string3=string1+"|"+string2; 
        return string3;     //change this after logic.
        
    }
    
    public static void main(String[] args){
        MirrorImage m1=new MirrorImage();
        String st1,st2;
        st1=m1.getImage();
        System.out.println("Mirror Image : "+st1);
               
    }    
}
