/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc3;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

public class StudentFacultyDetails {

    //Scanner object creation
    Scanner s=new Scanner(System.in);
    
    //variable declaration
    //int choice=0;
    int regNo;
    int yrOfStudy;
    String section;
    float cgpa;
    float scholarship;
    float totalLiving;
    int totalStudents;
    int gTotalStudents;
    
    void getDetails(){
        
       
            System.out.println("Please enter the following details: ");
            System.out.print("Register Number: ");
            regNo=s.nextInt();
            System.out.print("Year of Study: ");
            yrOfStudy=s.nextInt();
            System.out.print("Section: ");
            section=s.next();
            System.out.print("CGPA : ");
            cgpa=s.nextFloat();
            scholarship=cgpa*10000;
            System.out.print("Total living expense of 4 years: ");
            totalLiving=s.nextFloat();
            System.out.print("Total Number of students in your campus: ");
            totalStudents=s.nextInt();
            System.out.print("Total number of Students in the whole university : ");
            gTotalStudents=s.nextInt();

       
    }
    
    void printDetails(){
            System.out.println("You are a Student with Register Number "+regNo+" and you belong to "+yrOfStudy+" "+section+" and eligible for Scholarship of "+scholarship+" as your CGPA is "+cgpa+" and your total living expense is "+totalLiving+".Total Number of Students in your campus is "+totalStudents+" and across campus is "+gTotalStudents);
            
    }
  public static void main(String[] args){
      StudentFacultyDetails sf=new StudentFacultyDetails();
      Scanner sq=new Scanner(System.in);
      int choice=0; 
       System.out.println("YOU ARE A STUDENT(enter 0) OR FACULTY(enter 1) :");
        choice=sq.nextInt();
       
        //this condition works if a faculty login into the system
        if(choice==1){
            System.out.println("Permission denied to enter details.");
        }
            //this conditions works if a student login into the system
        else if(choice==0){
     
         sf.getDetails();
         sf.printDetails();
      }     
  }
}
