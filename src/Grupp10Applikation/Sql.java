/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Sql {
    
    private static Connection conn; 
    private String anvandare;
    
    public Sql () {
    
 
        try {
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://10.22.27.229:3306/namn", "Nikola", "password1234");
            conn = conn1;
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
     public Sql(String anvandarnamn){
        
        this.anvandare = anvandarnamn;
         try {
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://10.22.27.229:3306/namn", "Nikola", "password1234");
            conn = conn1;
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
      public boolean inlogg(String Anvandare, String Losen){
        String sqlAnvandare = "";
        String sqlLosen = "";       // Inloggningsfunktionen
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
       
      public void andraLosen(String losen){
      
      String nyalosen = losen;
      
          
        try {
           String sql = "Update anvandare set losenord='" + nyalosen + "'" + "where Anvandarnamn='" + anvandare + "'";
           PreparedStatement pst = conn.prepareStatement(sql);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "Ditt lösenord är ändrat");
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      public void andraFornamn(String fornamn){
          
         try {
           String sql = "Update anvandare set fornamn='" + fornamn + "'" + "where Anvandarnamn='" + anvandare + "'";
           PreparedStatement pst = conn.prepareStatement(sql);
          int updateCount = pst.executeUpdate();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
         public void andraEfternamn(String efternamn){
          
         try {
           String sql = "Update anvandare set efternamn='" + efternamn + "'" + "where Anvandarnamn='" + anvandare + "'";
           PreparedStatement pst = conn.prepareStatement(sql);
          int updateCount = pst.executeUpdate();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
            public void andraTitel(String titel){
          
         try {
           String sql = "Update anvandare set titel='" + titel + "'" + "where Anvandarnamn='" + anvandare + "'";
           PreparedStatement pst = conn.prepareStatement(sql);
          int updateCount = pst.executeUpdate();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
         public void andraEpost(String epost){
          
         try {
           String sql = "Update anvandare set epost='" + epost + "'" + "where Anvandarnamn='" + anvandare + "'";
           PreparedStatement pst = conn.prepareStatement(sql);
          int updateCount = pst.executeUpdate();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
            public void andraTelefonnummer(String telefon){
          
         try {
           String sql = "Update anvandare set telnr='" + telefon + "'" + "where Anvandarnamn='" + anvandare + "'";
           PreparedStatement pst = conn.prepareStatement(sql);
          int updateCount = pst.executeUpdate();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      
            
      
      public String fyllText(String anvandare, String kolumn)
      {
          String resultat = "";
          
          try
          {
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("select "+kolumn+" from anvandare where Anvandarnamn = '"+anvandare+"'");
           if(rs.next())
           {
           resultat = rs.getString(1);
           }
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          
          
          return resultat;
      }

      
      
      
      
      
      
      
      
      
      
      
      
      
       public String kollaAdmin(String anvandare)
      {
          String resultat = "";
          
          try
          {
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("select admin from anvandare where Anvandarnamn = '"+anvandare+"'");
           if(rs.next())
           {
           resultat = rs.getString(1);
           }
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          
        System.out.println(resultat);  
          return resultat;
      }
      
          

      
      public static String adminTrueFalse(String anvandare){
        String svar = "";
        
          try {
            
            String SqlFraga = "select anvandare.Admin from anvandare where anvandare.Anvandarnamn = '"+ anvandare + "'";
         
           PreparedStatement pst = conn.prepareStatement(SqlFraga);
         ResultSet rssvar = pst.executeQuery();
          
           svar = rssvar.toString();
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        return svar;
      }
      
      
}

        
         


/* 
try {
         
            //Specifierar anslutningen till databasen, notera här att databasen är uppkopplad till servern, därav man måste ange den lokala ip-adressen för personen som hostar servern.
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.22.25.76:3306/namn", "Nikola", "password1234");

            //Skapar en connection statement som ska användas för att hämta ut saker ur databasen, eller göra ändringar.
            Statement stmt = conn.createStatement();
            
            //Hämtar ut värdet/värden från databasen och lagrar det som ett "ResultSet", notera att man här skriver sin SQL Query i metoden executeQuery().
            ResultSet rs = stmt.executeQuery("select * from namn");
            
            //Loopa igenom ResultSet variabeln för att få fram alla värdena som finns i ResultSet. Notera att loopen loopar igenom rader, för att få ut kolumnerna se nedan. 
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)); //Notera att getString(1) är ID-nummer kolumnen och getString(2) är namn kolumnen.
                sqlNamn = rs.getString(1) + "  " + rs.getString(2);
            }

            jTextArea1.setText(sqlNamn);

            
        } catch (Exception e) {
            System.out.println(e);
        }


    }
*/
    
    
    

