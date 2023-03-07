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
public class Genre {
    
    String genreName;
    ArrayList<Book> bookList;
    public Genre () {
        this.bookList = new ArrayList<Book>();
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    

}
