/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.system;

import Model.Library.Library;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class Branch {
    String name;
    UserAccountDirectory branchuseraccountDirectory;
    Library lib;
    
    public Branch(String name) {
        System.out.println("Inside branch class");
        this.name = name;
        //this.lib = new Library();
        this.branchuseraccountDirectory = new UserAccountDirectory();
    }

    public Branch() {
        this.name = "";
         this.lib = new Library();
    }

//    Branch(String name, Library lib) {
//        this.name = name;
//        this.lib = lib;
//    }
    

    public Library getLib() {
//       System.out.println("Inside Branch class");
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }
    
    
    
    
}
