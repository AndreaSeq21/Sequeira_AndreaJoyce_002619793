/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Library;


import Model.Employee.EmployeeDirectory;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class Library {
    String LibraryName;
    int buildingNo;
    EmployeeDirectory employeelist;
   // private ArrayList<Employee> employeelist1;

    public Library() {
        this.employeelist = new EmployeeDirectory();
    }

    public Library(String LibraryName, int buildingNo) {
        this.LibraryName = LibraryName;
        this.buildingNo = buildingNo;
        this.employeelist = employeelist;
    }
    
    public String getLibraryName() {
        return LibraryName;
    }

    public void setLibraryName(String LibraryName) {
        this.LibraryName = LibraryName;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public EmployeeDirectory getEmployeelist() {
        System.out.println("Inside Library");
        return employeelist;
    }

    public void setEmployeelist(EmployeeDirectory employeelist) {
        this.employeelist = employeelist;
    }
    
    
    
   
    
    
    
}
