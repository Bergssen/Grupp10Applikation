/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
 * @author oskar
 */

    

public class huvudFonster extends javax.swing.JFrame {

    public final String anvandare;
    private AnvändarSida nysida;
    
    
    public huvudFonster(String anvandarNamn) {
        anvandare = anvandarNamn;
        nysida = new AnvändarSida("Lars");
        initComponents();
        klickaAnvandarenamn();
        
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
        sbFlode = new javax.swing.JScrollBar();
        txtFlode = new javax.swing.JFormattedTextField();
        lblProfilbild = new javax.swing.JLabel();
        lblInloggadSom = new javax.swing.JLabel();
        jSPValtDatum = new javax.swing.JScrollPane();
        jTAValtDatum = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();

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

        txtFlode.setText("                                                        Här visas flödet");
        txtFlode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFlode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlodeActionPerformed(evt);
            }
        });

        lblProfilbild.setText(" Här visas profilbilden");

        lblInloggadSom.setText("Du är inloggad som: namn");

        jTAValtDatum.setColumns(20);
        jTAValtDatum.setRows(5);
        jTAValtDatum.setText("Här visas information om valt datum");
        jSPValtDatum.setViewportView(jTAValtDatum);

        jButton1.setText("Skapa nytt inlägg");

        jLabel3.setText("Robinhock1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVisaAktivitetsflode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnForetagsFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisaAllaFloden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBokaEttMöte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisaProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnForskningsFlode, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addComponent(txtFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sbFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jSPValtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVisaMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTaBortMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblInloggadSom)
                                        .addGap(107, 107, 107)
                                        .addComponent(lblProfilbild))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(56, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(lblValkomst)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValkomst)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVisaProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnVisaAktivitetsflode, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnForskningsFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnForetagsFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnVisaAllaFloden, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnBokaEttMöte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVisaMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTaBortMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(jSPValtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sbFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFlodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlodeActionPerformed
    public void informationDisplay(){
        Sql anslutning = new Sql();
        String namn = jLabel3.getText();
        AnvändarSida nysida = new AnvändarSida(namn); 
                
        anslutning.getResultGuestVarde(jLabel3);
        String fornamn = anslutning.getGuestFornamn();
        String efternamn = anslutning.getGuestEfternamn();
        String titel = anslutning.getGuestTitel();
        String epost = anslutning.getGuestEpost();
        String telnr = anslutning.getGuestTelnr();
       
        
        
        nysida.setGuestVarde(fornamn, efternamn, epost, telnr, titel);
        
        
        
    }
            
    private void btnVisaProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaProfilActionPerformed
        AnvändarSida nySida = new AnvändarSida(anvandare);
        nySida.textAnvandare();
        nySida.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnVisaProfilActionPerformed
  
      
 
    public void klickaAnvandarenamn()  
    {  
       
       jLabel3.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
      
       nysida  = new AnvändarSida(jLabel3.getText());
       nysida.setVisible(true);
       
       nysida.andraSynlighettext();
       nysida.andraSynlighetknapp();
       
         Sql anslutning = new Sql();
       
       
                
        anslutning.getResultGuestVarde(jLabel3);
        String fornamn = anslutning.getGuestFornamn();
        String efternamn = anslutning.getGuestEfternamn();
        String titel = anslutning.getGuestTitel();
        String epost = anslutning.getGuestEpost();
        String telnr = anslutning.getGuestTelnr();
       
        
        
        nysida.setGuestVarde(fornamn, efternamn, epost, telnr, titel);
       
    }  
}); 

    } 
    
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
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jSPValtDatum;
    private javax.swing.JTextArea jTAValtDatum;
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblProfilbild;
    private javax.swing.JLabel lblValkomst;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JScrollBar sbFlode;
    private javax.swing.JFormattedTextField txtFlode;
    // End of variables declaration//GEN-END:variables
}
