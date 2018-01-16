package lab_exc_5;
import java.io.*;

/**
 * @author himanshi sharma
 * Title: The given program is to demonstrate file handling in java.
 * Logic: InputStreamReader's object is used to take input. 
 * Classes: FileHandling
 * Methods: ioDemo()
 * Variables: c, cin
 */

public class FileHandling {
    char c;
    //Method used to perform file handling    
    void ioDemo() throws IOException{
        InputStreamReader cin=null;
        
        //program statement is written in this block.
        try{
            cin=new InputStreamReader(System.in);
            System.out.println("Enter a character,'q' to quit : ");
            do{
                c=(char)cin.read();
                System.out.println(c);
               }while(c!='q');
           }
            finally{
                if(cin!=null){
                    cin.close();
                             }
                    }
    }
  public static void main(String[] args) throws IOException{
      FileHandling obj=new FileHandling();
      obj.ioDemo();
  }    
}
