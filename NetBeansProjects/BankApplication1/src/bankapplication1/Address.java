/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication1;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */

public class Address {
     
    Scanner s=new Scanner(System.in);
    
      int doorNo;
      String street;
      int postalCode;
      String city;
   
      //for getting doorno from user
      public int getDoorNo(){
          
        // System.out.println("Enter door number: ");
        // doorNo=s.nextInt();
         return doorNo;
      }
      
      public void setDoorNo(int doorNo){
          
          this.doorNo=doorNo;
          
      }
      
        //for getting street from user
      public String getStreet(){
          
          return street;
      
      }
      
      public void setStreet(){
      
          this.street=street;
          
      }

        //for getting doorno from user
      public int getPostalCode(){
          
          return postalCode;
          
      }
      
       public void setPostalCode(){
          
          this.postalCode=postalCode;
          
      }

   
  //for getting doorno from user
      public String getCity(){
   
          return city;
          
      }
      
      public void setCity(){
          
          this.city=city;
          
      }

      @Override
  public String toString(){
 
      return "Address: [\n Door no: "+doorNo+" \nStreet: "+street+" \nPostalCode: "+postalCode+" \nCity: "+city+"\n]";


}
