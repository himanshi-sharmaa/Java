/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author himanshi sharma
 * 
 * This is the main DigitalBook class which extends abstract class Books.
 */
public class DigitalBook extends Books implements IPrintable{
    
    int bookSize;
    
    //constructor
    //no argument constructor
    public DigitalBook() {
    }
    //parameterized constructor

    public DigitalBook(int bookSize) {
        this.bookSize = bookSize;
    }

    public DigitalBook(int bookSize, String bookTitle, int bookId, String bookAuthor, String yrOfPublication) {
        super(bookTitle, bookId, bookAuthor, yrOfPublication);
        this.bookSize = bookSize;
    }
    
    //Accessers and mutators
    //setters

    public void setBookSize(int bookSize) {
        this.bookSize = bookSize;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setYrOfPublication(String yrOfPublication) {
        this.yrOfPublication = yrOfPublication;
    }

    //getters
    public int getBookSize() {
        return bookSize;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getYrOfPublication() {
        return yrOfPublication;
    }
    
    
    //Implemented from the interface IPrintable
    @Override
    public void viewDetails(){

    //write the functionality here       
    }
    
}
