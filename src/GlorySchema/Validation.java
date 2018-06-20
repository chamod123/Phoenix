/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Niroshima
 */
public class Validation 
{

    /**
     *
     */
    public boolean checkNull(String value,String type)
    {
    
     if ("".equals(value.trim()) || value == null) 
        {
           JOptionPane.showMessageDialog(null, "Enter The "+ type);
            return false;
        } 
      return true;
    }
    public boolean comfirmPassword(String value1,String value2)
    {
    if(!value1.equals(value2)){
     JOptionPane.showMessageDialog(null, "Password does not match the confirm password!!");
     return false;
    }
    return true;
    }
    public boolean checkEmail(String Email)
    {
        if (null != Email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(Email);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid Email address!!");
            }
        }
        
        
        return true;
    }
    public boolean checkPasswordLength(String Password){
    
        if(Password.length() < 4 || Password.length() > 8){
                JOptionPane.showMessageDialog(null,"Your Password Should Be 4 To 8 Characters Long");
                return false;
            }
        
    return true;
    }
    public boolean checkNumaric(String value,String type){
        
    if(Character.isDigit(value.charAt(0))) {
    JOptionPane.showMessageDialog(null,"Cannot have numaric values for "+type);
    return false;
    }
    return true;
    }
    public void specialCharacter(){}
}
