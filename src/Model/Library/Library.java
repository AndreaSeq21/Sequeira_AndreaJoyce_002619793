/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Library;


import Model.Employee.EmployeeDirectory;
import Model.Material.BookCollection;
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