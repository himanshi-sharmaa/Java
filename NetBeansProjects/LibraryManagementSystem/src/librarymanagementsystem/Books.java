/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.util.Scanner;

/**
 *
 * @author himanshi sharma
 */
// Books is an abstract class so we cannot directly create its objects.This class will be used as a parent class for OwnFaculty.java 
// and Others.java

public abstract class Books implements iBook {

    Scanner s=new Scanner(System.in);
    
    //Object creation for classes
    OwnFaculty obj1=new OwnFaculty();
    Others obj2=new Others();
    
  String ISBNnumber;
  String bookName;
  String bookType;
  String authorType;
  String authorName;
  float bookCost;

  //Constructors used: No argument constructor and parameterised constructor.
  //No argument constructor
  public Books(){}
  //Parameterised Constructor.
    public Books(String ISBNnumber, String bookName, String bookType, String authorType, String authorName, float bookCost) {
        this.ISBNnumber = ISBNnumber;
        this.bookName = bookName;
        this.bookType = bookType;
        this.authorType = authorType;
        this.authorName = authorName;
        this.bookCost = bookCost;
    }

    //Accessors and mutators.
    //setters.
    public void setISBNnumber(String ISBNnumber){
        this.ISBNnumber = ISBNnumber;
      
   }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void setAuthorType(String authorType) {
        this.authorType = authorType;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookCost(float bookCost) {
        this.bookCost = bookCost;
    }
    //getters.
    public String getISBNnumber() {
        return ISBNnumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookType() {
        return bookType;
    }

    public String getAuthorType() {
        return authorType;
    }

    public String getAuthorName() {
        return authorName;
    }

    public float getBookCost() {    
        return bookCost;
    }

    //Overriding the existing methods which are impleneted here.
      @Override
    public void addBook(){
        
        //For taking input from user.
    System.out.println("---GIVE INPUT FOR OWNFACULTY--- ");
    System.out.println("Enter the ISBNnumber: ");
    ISBNnumber=s.next();
    setISBNnumber(ISBNnumber);
    System.out.println("Enter BookName:");
    bookName=s.next();
    setBookName(bookName);
    System.out.println("Enter book type: ");
    bookType=s.next();
    setBookType(bookType);
    System.out.println("Enter author type: ");
    authorType=s.next();
    setAuthorType(authorType);
    System.out.println("Enter author name: ");
    authorName=s.next();
    setAuthorName(authorName);
    System.out.println("Enter the book cost: ");
    bookCost=s.nextFloat();
    setBookCost(bookCost);

    String authorType1,authorType2;
    authorType1="OWNFACULTY";
    authorType2=getAuthorType();    
        int b=authorType.compareToIgnoreCase(authorType2);
        if(b==1){
            System.out.println("OWN AUTHOR IS SELECTED!!!BOOKS WILL BE ADDED.");
          obj1.addBookToDataBase();
        
    }
        else{
            obj2.addDataToDataBase();
        }
    }
  @Override
   public void printBookDetails(){
      
   }
}
