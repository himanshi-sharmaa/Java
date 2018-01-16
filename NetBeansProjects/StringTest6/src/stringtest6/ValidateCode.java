/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtest6;
import java.util.Scanner;

/**
 * @author himanshi sharma
 * Title:
 * Logic: A company requires each employee to maintain a secret code. The secret code needs to pass certain validation for getting
 * accepted.  The validation rules are as given 
 * 1. The secret code should be six characters long
 * 2. The first three characters should be cod (Use .startsWith method)
 * 3. There should be at least one digit in the code (Use .isDigit) 
 * 4. The first character should always be an upper case letter(Use isUpperCase)
 * 5. The code should contain only alphabets and digits.
 * 6. The number of upper case letters should be greater than lower case letters.   
 * Classes: ValidateCode
 * Methods:  validateCode(String)
 * Variables: digit,lowercase,uppercase,specialcase,code,str
 */

public class ValidateCode {

    boolean bObj;
    boolean validateCode(String code){
       int length=code.length();
        int digit=0,lowerCase=0,upperCase=0,specialCharacter=0;
        for(int i=0;i<code.length();i++){
          //Check if the character is uppercase
            if(Character.isUpperCase(code.charAt(i))){
                upperCase++;
            }
            //Check if the character is lowercase
            if(Character.isLowerCase(code.charAt(i))){
                lowerCase++;
            }
            //Check if the character is digit
            if(Character.isDigit(code.charAt(i))){
                digit++;
            }
            //Check if the character is a letter or digit
            if(!Character.isLetterOrDigit(code.charAt(i))){
                specialCharacter++;
            }
        }
        if(length>=6 && digit>0 && specialCharacter==0 && (upperCase > lowerCase) && code.startsWith("Cod"))
            bObj= true;
        else
            bObj= false;
        return bObj;
    }
  public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      String str;
      ValidateCode vObj=new ValidateCode();
      System.out.println("Enter your secret code:");
      str=s.next();
      System.out.println("Your secret code is valid: "+vObj.validateCode(str));
  }    
}
