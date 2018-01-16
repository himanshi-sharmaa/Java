 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_exc1;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
public class Prg_5{
     Scanner s;
     int m1,m2;
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

     
//input from user
     void input(){
        s=new Scanner(System.in);
        System.out.println("Enter marks for a student in two subjects: ");
        m1=s.nextInt();
        m2=s.nextInt();
        if(((m1>0)&&(m1<=100))&&((m2>0)&&(m2<=100))){
            System.out.println("Marks within range,m1="+m1+"\n m2="+m2);
        }  
        else
        {
            System.out.println("Marks should be within 0 and 100");
        }
    }
 
//claculates the sum     
      public float total(){
         if(((m1>0)&&(m1<=100))&&((m2>0)&&(m2<=100))){
          return (m1+m2);          
         }
         else
             return 0;
         }
     
//claculates average     
    public float avg(){
        if(((m1>0)&&(m1<=100))&&((m2>0)&&(m2<=100))){ 
        return((m1+m2)/2);
        }
        else
            return 0;
        }
    
//main
   public static void main(String... a){
      
       Prg_5 std=new Prg_5();
       Prg_5 std1=new Prg_5();
       System.out.println("Student 1: ");
     std.input();
     System.out.println("Total: "+std.total());
     System.out.println("Average: "+std.avg());
     //student 2
     System.out.println("Student 2: ");
     std1.input();
     System.out.println("Total: "+std1.total());
     System.out.println("Average: "+std1.avg());
  
     //check for the greatest value.
     if ((std.total())>(std1.total())){
         System.out.println("Student 1 has higher score");
     }
     else
         System.out.println("Student 2 has higher score");
   }  
}
