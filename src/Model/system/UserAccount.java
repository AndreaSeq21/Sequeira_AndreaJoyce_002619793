/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.system;

import Model.Role.Role;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class UserAccount {
    private String accountId;
    private String username;
    private String password;
    private String accessTo;
    private static int counter = 0;
    private Role role;
    
    public UserAccount(String username, String password, Role role, String accessTo) {
        this.accountId = "user" + this.counter++;
        this.username = username;
        this.password = password;
        this.role = role;
        this.accessTo = accessTo;
    }

    public UserAccount() {
       
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        UserAccount.counter = counter;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getAccessTo() {
        return accessTo;
    }

    public void setAccessTo(String accessTo) {
        this.accessTo = accessTo;
    }
    
    
    
}
