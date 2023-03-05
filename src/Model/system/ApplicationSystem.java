/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.system;

import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Library.Library;
import Model.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class ApplicationSystem {
    ArrayList<Branch> branches;
    ArrayList <String> branchName;
    UserAccountDirectory topLevelUserAccountDirectory;

    public ArrayList<String> getBranchName() {
        return branchName;
    }

    public void setBranchName(ArrayList<String> branchName) {
        this.branchName = branchName;
    }
    
    ApplicationSystem() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.branchName = new ArrayList <String>();
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }
     public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
      public void storeBranchName(String name) {
        this.branchName.add(name);
        
    }
          public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
    
      public Branch AddEmpToBranch(String BranchName, Library lib) {  
        Branch branch = new Branch();
        branch.setName(BranchName);
        branch.setLib(lib);
        this.branches.add(branch);
        return branch;
    }
      
        public void AddBookToBranch(String BranchName, Library lib) {  
        
        for(Branch branch: this.branches)
        {
            if(BranchName.equals(branch.getName()))
             branch.setLib(lib); 
        }     
    }
     
      public Boolean branchAlreadyUsed (String branchName){
          for (String u : this.branchName) {
             if(u.equals(branchName)){
                return true;
            }
         }
        return false;
      }
      
     public Boolean branchAlreadyAssigned (String branchName, String designation){
          for (Branch u : this.branches) {
              ArrayList<Employee> emp = u.getLib().getEmployeelist().getEmployeelist();
              String getDesignationValue = "";
              for(int i=0;i < emp.size();i++) {
                  getDesignationValue = emp.get(i).getDesignation();
                  System.out.println("DesignationValue " +getDesignationValue);
                  if(u.getName().equals(branchName) && getDesignationValue.equals(designation) ){    
                return true;
            }
              
                 
              }
              
            
         }
        return false;
      }

       
      
}
