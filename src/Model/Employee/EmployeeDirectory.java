/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Employee;


import Model.Library.Library;
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
        Library lib = null ;
        System.out.println("Inside create employee");
        user.setPersonId(userId);
        user.setName(name);
        user.setAge(age);
        user.setDesignation(designation);
        user.setExperience(experience);
        lib.setLibraryName(libraryName);
        this.employeelist.add(user);
        return user;
    }
      
    
      public Boolean searchLibrary(String libraryName) {
         for (Employee u : this.employeelist) {
             if(u.libraryName.equals(libraryName)){
                return true;
            }
         }
        return false;
    
    }
      
     
       public Employee findbyId(String id) {
        for(Employee u: this.employeelist) {
            if(u.getPersonId().equals(id)) {
                System.out.println("Imside u.personId " + u.getPersonId());
                System.out.println("Inside Id " +id);
                return u;
            }
        }
        return null;
    }

}
