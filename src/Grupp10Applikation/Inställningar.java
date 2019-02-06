/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grupp10Applikation;

/**
 *
 * @author Chris
 */
public class Inställningar extends javax.swing.JFrame {
    private final String anvandare;
    private Sql sql;
    private BildMetoder bildMetoder;
    private int admin = 0;
    /**
     * Creates new form Inställningar
     */
    public Inställningar(String anvandare, int admin) {
        this.anvandare = anvandare;
        sql = new Sql();
        bildMetoder = new BildMetoder();
        this.admin=admin;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAndraNamn = new javax.swing.JPanel();
        jLProfilbild = new javax.swing.JLabel();
        jBValjbild = new javax.swing.JButton();
        txtAndraNamn = new javax.swing.JTextField();
        txtAndraEfternamn = new javax.swing.JTextField();
        txtAndraTitel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAndraAlder = new javax.swing.JButton();
        btnAndraTitel = new javax.swing.JButton();
        btnAndraTeleNr = new javax.swing.JButton();
        btnAndraEpost = new javax.swing.JButton();
        txtAndraTeleNr = new javax.swing.JTextField();
        txtAndraEpost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passNya = new javax.swing.JPasswordField();
        passNyaRep = new javax.swing.JPasswordField();
        btnAndraLosen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBSparabild = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAndraNamn.setBackground(new java.awt.Color(255, 255, 255));
        btnAndraNamn.setForeground(new java.awt.Color(153, 153, 153));

        jBValjbild.setBackground(new java.awt.Color(255, 255, 255));
        jBValjbild.setText("Välj profilbild");
        jBValjbild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBValjbildActionPerformed(evt);
            }
        });

        txtAndraNamn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtAndraEfternamn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtAndraTitel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Förnamn:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Efternamn");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Epost");

        jButton1.setText("Ändra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAndraAlder.setText("Ändra");
        btnAndraAlder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlderActionPerformed(evt);
            }
        });

        btnAndraTitel.setText("Ändra");
        btnAndraTitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraTitelActionPerformed(evt);
            }
        });

        btnAndraTeleNr.setText("Ändra");
        btnAndraTeleNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraTeleNrActionPerformed(evt);
            }
        });

        btnAndraEpost.setText("Ändra");
        btnAndraEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraEpostActionPerformed(evt);
            }
        });

        txtAndraTeleNr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtAndraEpost.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Titel");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Telefonnummer");

        passNya.setText("jPasswordField1");

        passNyaRep.setText("jPasswordField2");

        btnAndraLosen.setText("Ändra");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        jLabel7.setText("Nya lösenordet");

        jLabel8.setText("Repetera nya lösenordet");

        jBSparabild.setText("Spara Bild");
        jBSparabild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSparabildActionPerformed(evt);
            }
        });

        jButton2.setText("Tillbaka");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnAndraNamnLayout = new javax.swing.GroupLayout(btnAndraNamn);
        btnAndraNamn.setLayout(btnAndraNamnLayout);
        btnAndraNamnLayout.setHorizontalGroup(
            btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAndraNamnLayout.createSequentialGroup()
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnAndraNamnLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, btnAndraNamnLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAndraEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAndraEpost))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, btnAndraNamnLayout.createSequentialGroup()
                                        .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(46, 46, 46)
                                        .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(btnAndraNamnLayout.createSequentialGroup()
                                                .addComponent(txtAndraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAndraAlder))
                                            .addGroup(btnAndraNamnLayout.createSequentialGroup()
                                                .addComponent(txtAndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                            .addGroup(btnAndraNamnLayout.createSequentialGroup()
                                                .addComponent(txtAndraTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAndraTitel))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAndraNamnLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtAndraTeleNr, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(btnAndraTeleNr)))
                        .addGroup(btnAndraNamnLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passNya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(btnAndraNamnLayout.createSequentialGroup()
                                    .addComponent(passNyaRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAndraLosen)))))
                    .addGroup(btnAndraNamnLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLProfilbild, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBValjbild)
                            .addComponent(jBSparabild, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btnAndraNamnLayout.setVerticalGroup(
            btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAndraNamnLayout.createSequentialGroup()
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(btnAndraNamnLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLProfilbild, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(btnAndraNamnLayout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jBValjbild)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSparabild)))
                    .addComponent(jButton2))
                .addGap(77, 77, 77)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnAndraAlder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAndraTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnAndraEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAndraEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnAndraTeleNr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAndraTeleNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btnAndraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passNya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passNyaRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(342, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void textInstallningar()
    {
       
       txtAndraNamn.setText(sql.fyllText(anvandare,"Fornamn"));
       txtAndraEfternamn.setText(sql.fyllText(anvandare,"Efternamn"));
       txtAndraTitel.setText(sql.fyllText(anvandare,"Titel"));
       txtAndraTeleNr.setText(sql.fyllText(anvandare,"Epost"));
       txtAndraEpost.setText(sql.fyllText(anvandare,"Telnr"));
    }
    private void btnAndraEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraEpostActionPerformed
        String namn = txtAndraEpost.getText();
           Sql sql = new Sql(anvandare);
           sql.andraEpost(namn);
    }//GEN-LAST:event_btnAndraEpostActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        if(Validering.kontrollAttNyaLosenMatchar(passNya, passNyaRep)){
            
              String nyalosen = passNya.getText();
              Sql sql = new Sql(anvandare);
  
              sql.andraLosen(nyalosen);
               
        }
        
        
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String namn = txtAndraNamn.getText();
           Sql sql = new Sql(anvandare);
           sql.andraFornamn(namn);
       
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAndraAlderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlderActionPerformed
        String namn = txtAndraEfternamn.getText();
           Sql sql = new Sql(anvandare);
           sql.andraEfternamn(namn);
    }//GEN-LAST:event_btnAndraAlderActionPerformed

    private void btnAndraTitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraTitelActionPerformed
        String namn = txtAndraTitel.getText();
           Sql sql = new Sql(anvandare);
           sql.andraTitel(namn);
    }//GEN-LAST:event_btnAndraTitelActionPerformed

    private void btnAndraTeleNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraTeleNrActionPerformed
        String tele = txtAndraTeleNr.getText();
           Sql sql = new Sql(anvandare);
           sql.andraTelefonnummer(tele);
    }//GEN-LAST:event_btnAndraTeleNrActionPerformed

    private void jBValjbildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBValjbildActionPerformed
       jLProfilbild.setIcon(bildMetoder.valjProfilBild());        
    }//GEN-LAST:event_jBValjbildActionPerformed

    private void jBSparabildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSparabildActionPerformed
        bildMetoder.laddaUppBildDatabas(anvandare);
    }//GEN-LAST:event_jBSparabildActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        
     AnvändarSida nyasida = new AnvändarSida(anvandare, admin);  
     
     nyasida.textAnvandare();
     
     nyasida.setVisible(true);
     this.setVisible(false);
        
        
        
        
        
        
        
        
        
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inställningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inställningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inställningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inställningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAlder;
    private javax.swing.JButton btnAndraEpost;
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JPanel btnAndraNamn;
    private javax.swing.JButton btnAndraTeleNr;
    private javax.swing.JButton btnAndraTitel;
    private javax.swing.JButton jBSparabild;
    private javax.swing.JButton jBValjbild;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLProfilbild;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField passNya;
    private javax.swing.JPasswordField passNyaRep;
    private javax.swing.JTextField txtAndraEfternamn;
    private javax.swing.JTextField txtAndraEpost;
    private javax.swing.JTextField txtAndraNamn;
    private javax.swing.JTextField txtAndraTeleNr;
    private javax.swing.JTextField txtAndraTitel;
    // End of variables declaration//GEN-END:variables
}
