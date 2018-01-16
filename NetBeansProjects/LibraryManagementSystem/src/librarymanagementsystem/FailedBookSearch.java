/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author himanshi sharma
 */
public class FailedBookSearch extends Exception {
    
    @Override
    public String toString(){
        System.out.println("Failed Book Search Exception Thrown: User defined exception ");
       return " ";
    }
    
}
