/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author oskar
 */
public class Metoder {
    
     private static String fileNameProfilbild = null;
     private static byte[] profilbildBit = null;
     
     
     public Metoder(){
     
         try {
             PreparedStatement pst = null;
             Connection con = null;
             this.pst = pst;
             
             Connection conn = DriverManager.getConnection("jdbc:mysql://10.22.25.76:3306/namn", "Nikola", "password1234");
             this.con=conn;
         } catch (SQLException ex) {
             Logger.getLogger(Metoder.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
       
    private static String sqlNamn;
    private static PreparedStatement pst ;
    private static Connection con;

    public static void laggUppBild(String profilBild){
    
    
       try {                                         
            
   
                File image = new File(profilBild);
                FileInputStream imageInputStream = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for(int readNum; (readNum = imageInputStream.read(buf)) != -1;)
                {
                    bos.write(buf, 0 , readNum);
                }
                profilbildBit = bos.toByteArray();
                
                
                
                
                
            } catch (HeadlessException | IOException ex) {
                System.out.println("laggUppBild " + ex);
            }
            sparaBildDatabas();
    }
    
    public static void sparaBildDatabas(){
    
    
         try {
             String sql = "update anvandare set profilbild = ? where anvandare.fornamn = 'Robin' )" ;
             
             pst = con.prepareStatement(sql);
             
             
             
             pst.setBytes(10, profilbildBit);
             
             
             pst.execute();
             System.out.println("hej");
             
             pst.close();
             
         } catch (SQLException ex) {
             Logger.getLogger(Metoder.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("sparaBildDatabas " + ex);
         }
    
    
    
    
    }
    
    
    
    
    
}
