/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BookInfo;

import Model.Material.Book;
import java.util.ArrayList;

/**
 *
 * @author asequ
 */
public class Author {
    
    String AuthorName;
    ArrayList <Book> bookList;

   
    public Author () {
        this.bookList = new ArrayList<Book>();
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public void addBookToAuthor(String bookName){
        
    }
    
  
}
