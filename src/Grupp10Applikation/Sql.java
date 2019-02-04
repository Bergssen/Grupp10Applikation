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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Sql {
    
    
    private static Connection conn;
    private String anvandare;
    private String guestFornamn ="";
    private String guestEfternamn ="";
    private String guestTitel ="";
    private String guestEpost ="";
    private String guestTelnr ="";

    public Sql() {

        try {
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://10.22.25.76:3306/namn", "Nikola", "password1234");
            conn = conn1;
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Sql(String anvandarnamn) {

        this.anvandare = anvandarnamn;
        try {
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://10.22.25.76:3306/namn", "Nikola", "password1234");
            conn = conn1;
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean inlogg(String Anvandare, String Losen) {
        String sqlAnvandare = "";
        String sqlLosen = "";       // Inloggningsfunktionen
        boolean hittad = false;

        try {
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select * from anvandare");

            while (rs.next()) {

                sqlAnvandare = rs.getString(7);
                sqlLosen = rs.getString(6);
                if (sqlAnvandare.equals(Anvandare) && sqlLosen.equals(Losen)) {
                    hittad = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }

        return hittad;

    }
    
    

    public void andraLosen(String losen) {

        String nyalosen = losen;

        try {
            String sql = "Update anvandare set losenord='" + nyalosen + "'" + "where Anvandarnamn='" + anvandare + "'";
            PreparedStatement pst = conn.prepareStatement(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int hamtaAnvandarID(JLabel varde) {

        String anvandarenamnGuest = varde.getText();
        int anvandarID = 0;

        try {
            String sql = "select AnvandareID from anvandare where Anvandarnamn = " + "'" + anvandarenamnGuest + "'";
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {

                anvandarID = rs.getInt(1);

            }

            System.out.println(anvandarID);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return anvandarID;
    }
    
    
    public void getResultGuestVarde(JLabel varde){
        
        
        
        hamtaAnvandarID(varde);
        
        int anvandareID = hamtaAnvandarID(varde);
        
        String anvandarIDString = Integer.toString(anvandareID);
        
        try {
            String sql = "select fornamn, efternamn, telnr, Epost, Titel from anvandare where AnvandarID = " + anvandarIDString;
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery(sql);

            while (rs.next()) {

                guestFornamn = rs.getString(2);
                guestEfternamn = rs.getString(3);
                guestTelnr = rs.getString(4);
                guestEpost = rs.getString(5);
                guestTitel = rs.getString(9);
                

            }

            

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD
        
    }
    
    
        public String getGuestFornamn(){
            return guestFornamn;
        }
        
         public String getGuestEfternamn(){
            return guestEfternamn;
        }
    
          public String getGuestTitel(){
            return guestTitel;
        }
          
           public String getGuestTelnr(){
            return guestTelnr;
        }
           
            public String getGuestEpost(){
            return guestEpost;
        }
}

   
=======
            
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
          }
      
>>>>>>> origin/Adam

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
