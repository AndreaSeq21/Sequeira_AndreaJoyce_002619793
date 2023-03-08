/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.system.ApplicationSystem;
import Model.system.Branch;

import Model.system.UserAccount;
import UI.LibrarianPanel.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class LibrarianRole extends Role {

    @Override
    public JFrame createWorkArea(ApplicationSystem appSystem, Branch branch, UserAccount useraccount) {
         return new LibrarianJFrame(appSystem, branch, useraccount);
    }
    
}
