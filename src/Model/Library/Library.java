/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Library;


import Model.BookInfo.AuthorDirectory;
import Model.BookInfo.GenreDirectory;
import Model.Employee.EmployeeDirectory;
import Model.Material.BookCollection;
import Model.Material.General;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class Library {
    String LibraryName;
    int buildingNo;
    EmployeeDirectory employeelist;
    BookCollection booklist;
    AuthorDirectory authorCompleteList;
    GenreDirectory genreCompleteList;
    General generalList;

    public General getGeneralList() {
        return generalList;
    }

    public void setGeneralList(General generalList) {
        this.generalList = generalList;
    }
    


    public GenreDirectory getGenreCompleteList() {
        return genreCompleteList;
    }

    public void setGenreCompleteList(GenreDirectory genreCompleteList) {
        this.genreCompleteList = genreCompleteList;
    }

    public AuthorDirectory getAuthorCompleteList() {
        return authorCompleteList;
    }

    public void setAuthorCompleteList(AuthorDirectory authorCompleteList) {
        this.authorCompleteList = authorCompleteList;
    }
    

    public BookCollection getBooklist() {
//        System.out.println("Inside library");
        return booklist;
    }
     
    public void setBooklist(BookCollection booklist) {
        this.booklist = booklist;
    }

    public Library() {
        this.employeelist = new EmployeeDirectory();
        this.booklist = new BookCollection();
        this.authorCompleteList = new AuthorDirectory();
        this.genreCompleteList = new GenreDirectory();
        this.generalList = new General();
    }

    public String getLibraryName() {
        return LibraryName;
    }

    public void setLibraryName(String LibraryName) {
        System.out.println("setLibraryName " +LibraryName);
        this.LibraryName = LibraryName;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public EmployeeDirectory getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(EmployeeDirectory employeelist) {
        this.employeelist = employeelist;
    }
    

}