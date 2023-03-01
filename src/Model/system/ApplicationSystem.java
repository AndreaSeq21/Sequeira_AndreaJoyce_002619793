/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.system;

import Model.Library.Library;
import Model.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class ApplicationSystem {
    ArrayList<Branch> branches;
    UserAccountDirectory topLevelUserAccountDirectory;
    
    ApplicationSystem() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }
     public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
      public Branch createBranch(String name,String LibName,int buildingNumber) {
        Branch branch = new Branch(name);
        Library lib = new Library(LibName,buildingNumber);
        branch.setLib(lib);
        this.branches.add(branch);
        System.out.println("Inside create branch");
        return branch;
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
}
