/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc3;

/**
 *
 * @author himanshi sharma
 */
public class CommInput {

   public static void main(String[] args){
     
       int a,b,c,d;
     //The values of a,b and c used in the program are given as commandline inputs.
     a=Integer.parseInt(args[0]);
     b=Integer.parseInt(args[1]);
     c=Integer.parseInt(args[2]);
     
     d=a | 4 +c>>b&7;
     System.out.println("Result :"+d);
   }    
}
