/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Validering {
    


  public static boolean kontrollAttNyaLosenMatchar(JTextField nya, JTextField nya1){ // Kontrollerar så att två fält matchar varandra.
    
    boolean resultat = false;
    String testaNya = nya.getText();
    String testaNya1 = nya1.getText();
    
    if(testaNya1.equals(testaNya)){
    
    resultat = true;
    
    
    }
    else {
    JOptionPane.showMessageDialog(null, "De nya lösenorden matchar ej!");
    }
    
    
    return resultat;
    }
}