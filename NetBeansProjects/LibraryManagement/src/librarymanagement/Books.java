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
 * This is an abstract class which having the basic variables and methods.
 * 
 */
public abstract class Books {
    
    //Instance variables
    String bookTitle;
    int bookId;
    String bookAuthor;
    String yrOfPublication;
    
    //constructors
    //no argument constructor.

    public Books() {
    }
    
    //parameterized constructor

    public Books(String bookTitle, int bookId, String bookAuthor, String yrOfPublication) {
        this.bookTitle = bookTitle;
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.yrOfPublication = yrOfPublication;
    }
    
}
