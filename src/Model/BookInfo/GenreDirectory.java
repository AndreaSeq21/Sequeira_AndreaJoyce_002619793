/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BookInfo;

import java.util.ArrayList;

/**
 *
 * @author asequ
 */
public class GenreDirectory {
    private ArrayList<Genre> genrelist;

    public GenreDirectory() {
        this.genrelist = new ArrayList<Genre>();
    }

    public ArrayList<Genre> getGenrelist() {
        return genrelist;
    }

    public void setGenrelist(ArrayList<Genre> genrelist) {
        this.genrelist = genrelist;
    }
    
    
 
      public Genre addGenre(String genreName){
        Genre genre = new Genre();
        genre.setGenreName(genreName);
        
        this.genrelist.add(genre);
        return genre;
    }
    
    
}
