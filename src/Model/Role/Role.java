/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.system.ApplicationSystem;
import Model.system.Branch;
import Model.system.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author asequ
 */
public abstract class Role {
    
    private static String[] roles = {"branch manager", "system admin", "customer", "librarian"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(ApplicationSystem appSystem, Branch branch, UserAccount useraccount);
}
