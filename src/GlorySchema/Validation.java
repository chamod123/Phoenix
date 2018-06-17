/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlorySchema;

import javax.swing.JOptionPane;

/**
 *
 * @author INDIKA
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
    public void numaric(){}
    public void specialCharacter(){}
}
