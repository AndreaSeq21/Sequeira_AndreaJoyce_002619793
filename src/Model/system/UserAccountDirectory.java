/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.system;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccountList() {
        return useraccountlist;
    }

    public void setUseraccountList(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserAccount createUserAccount(String name, String password, Role role) {
//        System.out.println("Inside create Account " +name);
        UserAccount user = new UserAccount(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
      public Boolean accountExists(String username) {
        
        for (UserAccount u : this.useraccountlist) {
            if(u.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
      
    public UserAccount findbyId(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                System.out.println("Inside findby Id");
                return u;
            }
        }
        return null;
    }
    
    
    
}
