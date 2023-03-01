/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Employee;


import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeelist;

    public ArrayList<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<Employee> employeelist) {
        this.employeelist = employeelist;
    }

    public EmployeeDirectory() {
         this.employeelist = new ArrayList<Employee>();
    }
    
      public Employee createEmployeeAccount(String userId, String name,int age,String designation,int experience, String libraryName) {
        Employee user = new Employee();
        System.out.println("Inside create employee");
        user.setPersonId(userId);
        user.setName(name);
        user.setAge(age);
        user.setDesignation(designation);
        user.setExperience(experience);
        user.setLibraryName(libraryName);
        this.employeelist.add(user);
        return user;
    }
    

}
