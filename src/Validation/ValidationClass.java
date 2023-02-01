/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class ValidationClass {
    String name;
    String password;
    int phone;
    Pattern p;
    
    public boolean validateName(String name) {
        String nameValidate = "[A-Za-z]";
        p = Pattern.compile(nameValidate);
        if (!p.matcher(name).matches()) 
        {
            JOptionPane.showMessageDialog(null,"Entered name is not correct!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    public boolean validateEmail(String email) {
        String emailvalidate = "[a-z0-9!-_.&#*]{2,100}[@][a-z]{3,100}[.][a-z]{3}";
        p = Pattern.compile(emailvalidate);
              if (!p.matcher(email).matches())
        {
            JOptionPane.showMessageDialog(null,"Email format: someone@email.com", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    
}
