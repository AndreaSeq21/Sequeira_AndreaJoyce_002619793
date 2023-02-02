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
            
            return false;
        }
        return true;
    }
    
    public boolean validateEmail(String email) {
        String emailvalidate = "[a-z0-9!-_.&#*]{2,100}[@][a-z]{3,100}[.][a-z]{3}";
        p = Pattern.compile(emailvalidate);
              if (!p.matcher(email).matches())
        {
            
            return true;
        }
        return false;
    }
    
        public boolean nullCheck (String checkValue) {
              if (checkValue != null && !checkValue.isBlank())
        {
            return false;
        }
        return true;
    }
        
          public boolean phoneNumberCheck (String checkValue) {
              //long phoneNumber = Long.parseLong(checkValue);
              int a = checkValue.length();
              if (a < 10)
        {
            return true;
        }
        return false;
    }
          
      public boolean silderCheck (String checkValue) {
              
              double a = Double.parseDouble(checkValue);
              if (a > 6)
        {
            return true;
        }
        return false;
    }
    
    
}
