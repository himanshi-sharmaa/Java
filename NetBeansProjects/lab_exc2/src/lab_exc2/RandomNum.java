/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc2;
import java.util.Scanner;

/**
 *Fields:num,val,ch
 * Methods:randNum(),main()
 * Classes:RandomNum
 * @author himanshi sharma
 */
public class RandomNum {
  Scanner s;
  
  //input and random number generation
  void randnum(){
      int num,val,ch=0;
      s=new Scanner(System.in);
//generation of random number.
      num=(int)(Math.random()*100);
//input from user.
   do{
   System.out.println("Guess a number: ");
     val=s.nextInt();
     
     if(num==val){
         System.out.println("Correct Guess!!! ");
         break;
     }
     else if(val>num){
         System.out.println("Too high,try again.");
     }
     else if(val<num){
         System.out.println("Too low,try again.");
     }System.out.println("Wanna try again?");
      ch=s.nextInt();
   }while(ch==1);
 }
  public static void main(String[] args){
    new RandomNum().randnum();
  }    
}
