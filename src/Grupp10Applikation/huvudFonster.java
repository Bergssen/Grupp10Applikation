/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

<<<<<<< HEAD
import java.awt.GridLayout;
=======
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
>>>>>>> Merre
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

=======
import java.util.Timer;
import java.util.TimerTask;
>>>>>>> Merre
/**
 *
 * @author oskar
 */
public class huvudFonster extends javax.swing.JFrame {
<<<<<<< HEAD
=======
    GridBagLayout layout = new GridBagLayout();
    AktivitetsSkapaInlagg pAktivitet;
<<<<<<< HEAD
    //Panel2 p2;
>>>>>>> Merre
=======
    ForetagsSkapaInlagg pForetag;
>>>>>>> Merre

    public final String anvandare;
    private AnvändarSida nysida;
    private int admin = 0;

    /**
     * Creates new form huvudFonster
     *
     * @param anvandarNamn
     */

    public huvudFonster(String anvandarNamn, int admin) {
        anvandare = anvandarNamn;
        this.admin = admin;
        initComponents();
<<<<<<< HEAD
  
=======

        
        pAktivitet = new AktivitetsSkapaInlagg(anvandare);
        pForetag = new ForetagsSkapaInlagg(anvandare);
        jPHuvudInlaggPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        jPHuvudInlaggPanel.add(pAktivitet, c);
        c.gridx=0;
        c.gridy=0;
        jPHuvudInlaggPanel.add(pForetag, c);
        pAktivitet.setVisible(false);
        pForetag.setVisible(false);

>>>>>>> Merre
        int tid = 1;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
<<<<<<< HEAD
                jPanel1.removeAll();
                nyttInlagg();
            }
        }, 0, 1000 * 60 * tid);

        
        
        if (admin == 1) {
            lblValkomst.setText("Välkommen! Du är inloggad som Admin");
        } else {
            lblValkomst.setText("Välkommen! Du är inloggad som användare.");
        }
=======
               fyllStartflode();
            }
        },0,100 * 60 * tid);
      

        if(admin == 1)
        {
        lblValkomst.setText("Välkommen! Du är inloggad som Admin");
    }
        else{
                lblValkomst.setText("Välkommen! Du är inloggad som användare.");
                }
>>>>>>> Merre

    }

    public int arAdmin() {

        return admin;
    }

<<<<<<< HEAD
    public void nyttInlagg() {

        String textR = "";
        Image image;
        byte[] imageBytes;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.22.27.229:3306/namn", "Nikola", "password1234");

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select Text, Profilbild, anvandarnamn from inlagg join anvandare on AnvandareID = AnvandarID");

            while (rs.next()) {

                String text = rs.getString(1);
                
                imageBytes=rs.getBytes(2);
                
                String text2 = rs.getString(3);
                
                image=getToolkit().createImage(imageBytes);
                
                ImageIcon icon = new ImageIcon(image);
                
                Image img = icon.getImage().getScaledInstance(76, 52, Image.SCALE_SMOOTH);
                
                ImageIcon bild = new ImageIcon(img);

                

                StringBuilder sb = new StringBuilder(text);

                int i = 0;
                while ((i = sb.indexOf(" ", i + 100)) != -1) {
                    sb.replace(i, i + 1, "\n");

                }

                textR = sb.toString();
                
                PanelTest paneltest = new PanelTest(textR, bild, text2);
                paneltest.setVisible(true);
                jPanel1.add(paneltest);
                

            }

        } catch (SQLException ex) {
            Logger.getLogger(huvudFonster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
=======
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
>>>>>>> Merre
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
        jTextPane1 = new javax.swing.JFormattedTextField();
        lblProfilbild = new javax.swing.JLabel();
        lblInloggadSom = new javax.swing.JLabel();
        jSPValtDatum = new javax.swing.JScrollPane();
        jTAValtDatum = new javax.swing.JTextArea();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
=======
        jPHuvudInlaggPanel = new javax.swing.JPanel();
>>>>>>> Merre

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
        btnVisaAktivitetsflode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAktivitetsflodeActionPerformed(evt);
            }
        });

        btnForskningsFlode.setText("Visa forskningsflöde");

        btnVisaAllaFloden.setText("Visa alla flöden");

        btnForetagsFlode.setText("Visa företagsflöde");
        btnForetagsFlode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForetagsFlodeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Du har 10000 nya notiser");

        btnVisaMedelande.setText("Visa notis");

        btnTaBortMedelande.setText("Ta bort notis");

        btnBokaEttMöte.setText("Boka ett möte");

        jTextPane1.setText("                                                        Här visas flödet");
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPane1ActionPerformed(evt);
            }
        });

        lblProfilbild.setText(" Här visas profilbilden");

        lblInloggadSom.setText("Du är inloggad som: namn");

        jTAValtDatum.setColumns(20);
        jTAValtDatum.setRows(5);
        jTAValtDatum.setText("Här visas information om valt datum");
        jSPValtDatum.setViewportView(jTAValtDatum);

        jLabel3.setText("Robinhock1");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

<<<<<<< HEAD
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(jPanel1);
=======
        javax.swing.GroupLayout jPHuvudInlaggPanelLayout = new javax.swing.GroupLayout(jPHuvudInlaggPanel);
        jPHuvudInlaggPanel.setLayout(jPHuvudInlaggPanelLayout);
        jPHuvudInlaggPanelLayout.setHorizontalGroup(
            jPHuvudInlaggPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        jPHuvudInlaggPanelLayout.setVerticalGroup(
            jPHuvudInlaggPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
>>>>>>> Merre

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
<<<<<<< HEAD
                            .addComponent(btnForskningsFlode, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel3)))
                .addGap(36, 36, 36)
=======
                            .addComponent(btnForskningsFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPHuvudInlaggPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sbFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel3)))
>>>>>>> Merre
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVisaMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTaBortMedelande, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
<<<<<<< HEAD
                                .addComponent(jSPValtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(183, 183, 183)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(157, 157, 157))))
=======
                                .addComponent(jSPValtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sbFlode, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(btnBokaEttMöte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPHuvudInlaggPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55))))))
>>>>>>> Merre
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
<<<<<<< HEAD
    

    public void informationDisplay() {
=======
    public void fyllStartflode(){ 

        
        String textR = "";
        ArrayList<String> lista = new ArrayList();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.22.27.229:3306/namn", "Nikola", "password1234");
            
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("select Text from inlagg order by datum, tid");
            
            while (rs.next()) {
                
                String text = rs.getString(1);
                
                StringBuilder sb = new StringBuilder(text);
                
                int i = 0;
                while ((i = sb.indexOf(" ", i + 100)) != -1) {
                    sb.replace(i, i + 1, "\n");
                    
                }
                
                textR = sb.toString();
                
                
                
                lista.add(textR);
                
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
>>>>>>> Merre
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

    private void btnVisaAktivitetsflodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAktivitetsflodeActionPerformed
        pAktivitet.setVisible(true);
        pForetag.setVisible(false);
    }//GEN-LAST:event_btnVisaAktivitetsflodeActionPerformed

    private void jTextPane1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPane1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
<<<<<<< HEAD
        nysida = new AnvändarSida(anvandare, jLabel3.getText(), arAdmin());
=======
        nysida  = new AnvändarSida(anvandare,jLabel3.getText(),arAdmin());
>>>>>>> Merre
        nysida.setVisible(true);
        dispose();

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
<<<<<<< HEAD
=======

    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnForetagsFlodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForetagsFlodeActionPerformed
        pForetag.setVisible(true);
        pAktivitet.setVisible(false);
    }//GEN-LAST:event_btnForetagsFlodeActionPerformed
  
      
 
  
     
>>>>>>> Merre

    }//GEN-LAST:event_jLabel3MouseClicked

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

                huvudFonster nysida = new huvudFonster("lol", 1);
                nysida.setVisible(true);
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
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
<<<<<<< HEAD
    private javax.swing.JPanel jPanel1;
=======
    private javax.swing.JPanel jPHuvudInlaggPanel;
>>>>>>> Merre
    private javax.swing.JScrollPane jSPValtDatum;
    private javax.swing.JTextArea jTAValtDatum;
<<<<<<< HEAD
=======
    private javax.swing.JFormattedTextField jTextPane1;
>>>>>>> Merre
    private javax.swing.JLabel lblInloggadSom;
    private javax.swing.JLabel lblProfilbild;
    private javax.swing.JLabel lblValkomst;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JScrollBar sbFlode;
    // End of variables declaration//GEN-END:variables
}
