/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Material;

import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class BookCollection {
    private ArrayList<Book> booklistCollection;

     public BookCollection(){
     this.booklistCollection = new ArrayList<Book>();
 }
     
    public ArrayList<Book> getBooklistCollection() {
        return booklistCollection;
    }

    public void setBooklistCollection(ArrayList<Book> booklistCollection) {
        this.booklistCollection = booklistCollection;
    }
     
 
}