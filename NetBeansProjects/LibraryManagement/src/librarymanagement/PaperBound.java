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
 * This is the main PaperBound class which extends abstract class Books.
 * 
 */
public class PaperBound extends Books implements IPrintable{
    
    int noOfPages;
    
    //constructors
    //no argument constructor

    public PaperBound() {
    }
    
    //parameterized constructor

    public PaperBound(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public PaperBound(int noOfPages, String bookTitle, int bookId, String bookAuthor, String yrOfPublication) {
        super(bookTitle, bookId, bookAuthor, yrOfPublication);
        this.noOfPages = noOfPages;
    }
    
    //Accessers and mutators
    //setters

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
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
    public int getNoOfPages() {
        return noOfPages;
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
    //Write the functionality    
    }
    
}
