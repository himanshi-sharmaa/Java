/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest_6;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 * Title:You are asked to create an application for registering the details of jobseeker. The requirement is: 
 * Username should always end with _job and there should be atleast minimum of 8 characters to the left of _job.
 * Logic: .endsWith() and .length() methods are used to check the above described condition.
 * Classes: JobSeeker
 * Methods: checkCondition(string), input()
 * Variables: str1
*/

public class JobSeeker {

    Scanner s=new Scanner(System.in);
    String str1;
    
   String input(){
   
    System.out.println("Enter the name of the job seeker: ");
    str1=s.next();
    return str1;
    
   }
   boolean checkCondition(String str1){
       
   return (str1.endsWith("_job"))&&(str1.length()>=12);
       
   }
   
  
  public static void main(String[] args){
      boolean bobj1;
      
      JobSeeker obj=new JobSeeker();
      bobj1=obj.checkCondition(obj.input());
      System.out.println("Input is "+bobj1);
  }    
}
