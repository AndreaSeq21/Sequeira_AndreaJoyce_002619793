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
    

    public Library() {
        this.employeelist = new EmployeeDirectory();
        this.booklist = new BookCollection();
    }

    public Library(String LibraryName, int buildingNo) {
        this.LibraryName = LibraryName;
        this.buildingNo = buildingNo;
        this.employeelist = employeelist;
    }

    public BookCollection getBooklist() {
        return booklist;
    }

    public void setBooklist(BookCollection booklist) {
        this.booklist = booklist;
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
    
    public EmployeeDirectory createEmployeeList (String LibraryName, int buildingNo,EmployeeDirectory employeelists ){
        Library lib = new Library();
        lib.setLibraryName(LibraryName);
        lib.setBuildingNo(buildingNo);
        lib.setEmployeelist(employeelist);
        return null;    
    }
   
    
    
     
   
    
    
    
}
