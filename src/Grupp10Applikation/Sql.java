/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Sql {
    
    private static Connection conn; 
    
    public Sql () {
    
 
        try {
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://10.22.25.76:3306/namn", "Nikola", "password1234");
            conn = conn1;
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
      public boolean inlogg(String Anvandare, String Losen){
        String sqlAnvandare = "";
        String sqlLosen = "";
        boolean hittad = false;
        
        try {
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("select * from anvandare");
            
            while (rs.next()){
            
            sqlAnvandare = rs.getString(7);
            sqlLosen = rs.getString(6);
            if(sqlAnvandare.equals(Anvandare) && sqlLosen.equals(Losen)){
            hittad = true;
            }
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        return hittad;
        
        }
        
}
    
    
    

