/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;

/**
 *
 * @author oskar
 */

   
public class huvudFonster extends javax.swing.JFrame {


    public final String anvandare;
    private AnvändarSida nysida;
    private int admin = 0;
    /**
     * Creates new form huvudFonster
     * @param anvandarNamn
     */
    
    public huvudFonster(String anvandarNamn, int admin) {
        anvandare = anvandarNamn;
        this.admin = admin;
        initComponents();
        fyllStartflode();
        if(admin == 1)
        {
        lblValkomst.setText("Välkommen! Du är inloggad som Admin");
    }
        else{
                lblValkomst.setText("Välkommen! Du är inloggad som användare.");
                }

        
    }
    
    private JFrame frame;
    private JPanel pane;
    private JTextField daysField;
    private JTextField assignmentField;
    private int days = 0;
    private int assignments = 0;
    
    public int arAdmin(){
    
    return admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        lblValkomst = new javax.swing.JLabel();
        btnVisaProfil = new javax.swing.JButton();
        btnVisaAktivitetsflode = new javax.swing.JButton();
        btnForskningsFlode = new javax.swing.JButton();
        btnVisaAllaFloden = new javax.swing.JButton();
        btnForetagsFlode = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVisaMedelande = new javax.swing.JButton();
        btnTaBortMedelande = new javax.swing.JButton();
        btnBokaEttMöte = new javax.swing.JButton();
        lblProfilbild = new javax.swing.JLabel();
        lblInloggadSom = new javax.swing.JLabel();
        jSPValtDatum = new javax.swing.JScrollPane();
        jTAValtDatum = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkomst.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblValkomst.setText("Välkommen! Just nu visas startflödet");

        btnVisaProfil.setText("Visa din profil");
        btnVisaProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaProfilActionPerformed(evt);
            }
        });

        btnVisaAktivitetsflode.setText("Visa aktivitetsflöde");

        btnForskningsFlode.setText("Visa forskningsflöde");

        btnVisaAllaFloden.setText("Visa alla flöden");

        btnForetagsFlode.setText("Visa företagsflöde");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Du har 10000 nya notiser");

        btnVisaMedelande.setText("Visa notis");

        btnTaBortMedelande.setText("Ta bort notis");

        btnBokaEttMöte.setText("Boka ett möte");

        lblProfilbild.setText(" Här visas profilbilden");

        lblInloggadSom.setText("Du är inloggad som: namn");

        jTAValtDatum.setColumns(20);
        jTAValtDatum.setRows(5);
        jTAValtDatum.setText("Här visas information om valt datum");
        jSPValtDatum.setViewportView(jTAValtDatum);

        jButton1.setText("Skapa nytt inlägg");

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(lblValkomst)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnForetagsFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisaAllaFloden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBokaEttMöte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnForskningsFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVisaAktivitetsflode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisaProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPValtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInloggadSom)
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(lblProfilbild))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnVisaMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTaBortMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProfilbild, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInloggadSom))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValkomst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel2))
                                    .addComponent(btnVisaProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnVisaMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTaBortMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnVisaAktivitetsflode, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnForskningsFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2))
                                        .addGap(38, 38, 38)
                                        .addComponent(btnForetagsFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnVisaAllaFloden, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBokaEttMöte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jSPValtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Color color = new Color(100, 53, 153);
    HashMap<String,Integer> test111 = new HashMap<String,Integer>();
    
     public void andraString(String g){
        
    /*     
     g.setColor(color);
     g.drawString("test", 20, 80);
     String testa = g.toString();
     
     test.setText(testa);
     
     Font font = new Font("Times New Roman",Font.BOLD,16);
     
     
     String testaa = "hej";
     */
     
     }
     
    public void fyllStartflode(){ 

        
   
        String textR = "";
        ArrayList<String> lista = new ArrayList();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.22.27.229:3306/namn", "Nikola", "password1234");
            
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("select Text, datum, tid, titel from inlagg order by datum desc, tid desc");
            
            while (rs.next()) {
                
                String text = rs.getString(1);
                String tid = rs.getString(3);
                String datum = rs.getString(2);
                String titel = rs.getString(4);
                StringBuilder sb = new StringBuilder( text);
                
                int i = 0;
                while ((i = sb.indexOf(" ", i + 100)) != -1) {
                    sb.replace(i, i + 1, "\n");
                    
                }
                textR = sb.toString();
                 for(int i2 = 0; i2<10; i2++){
                
                JLabel lbl = new JLabel(textR);
                lbl.setOpaque(true);
                
                
               jTextPane1.insertComponent(lbl);
                Document doc = jTextPane1.getDocument();
                try{
                doc.insertString(doc.getLength(), "\n\n", null);
                
                }
                catch (BadLocationException ex ) {
                
                }
               jTextPane1.setCaretPosition(doc.getLength());
                }
                
                
                
          
        
                
                lista.add(titel + "    " +datum + "    "+ tid + "    " + "\n" +textR);
                
            }
            
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : lista) {
            
            sb.append(s);
            sb.append("\n\n\n");
        }
        
      
        jTextPane1.setText(sb.toString());
        
    }
        
        
    
    
    
    
    public void informationDisplay(){
        Sql anslutning = new Sql();
        String namn = jLabel3.getText();
        AnvändarSida nysida = new AnvändarSida(namn, admin);
                
        anslutning.getResultGuestVarde(jLabel3);
        String fornamn = anslutning.getGuestFornamn();
        String efternamn = anslutning.getGuestEfternamn();
        String titel = anslutning.getGuestTitel();
        String epost = anslutning.getGuestEpost();
        String telnr = anslutning.getGuestTelnr();
       
        
        
        nysida.setGuestVarde(fornamn, efternamn, epost, telnr, titel);
        
        
        
    }
            
    private void btnVisaProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaProfilActionPerformed
        AnvändarSida nySida = new AnvändarSida(anvandare, admin);
        nySida.textAnvandare();
        nySida.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVisaProfilActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        pane = new JPanel();
        pane.setLayout(new GridLayout(0, 2, 2, 2));

        daysField = new JTextField(5);
        assignmentField = new JTextField(5);

        pane.add(new JLabel("How many days are left?"));
        pane.add(daysField);

        pane.add(new JLabel("How many assignments are due?"));
        pane.add(assignmentField);

    }//GEN-LAST:event_jButton2ActionPerformed
  
      
 
  
     


    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(huvudFonster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBokaEttMöte;
    private javax.swing.JButton btnForetagsFlode;
    private javax.swing.JButton btnForskningsFlode;
    private javax.swing.JButton btnTaBortMedelande;
    private javax.swing.JButton btnVisaAktivitetsflode;
    private javax.swing.JButton btnVisaAllaFloden;
    private javax.swing.JButton btnVisaMedelande;
    private javax.swing.JButton btnVisaProfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jSPValtDatum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAValtDatum;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblProfilbild;
    private javax.swing.JLabel lblValkomst;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
