/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.View;

import gestion_commercial.CONNEXION.NewCon;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Home
 */
public class Banque_view extends javax.swing.JFrame {
NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
     int position=1;
   // private Object jDateChooser1;
   // private Object jDateChooser2;
    private Object jTextField4;
    private Object Rs;
    /**
     * Creates new form Banque_view
     */
    public Banque_view() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Code");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Banque");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("\tCompte");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update icon.png"))); // NOI18N
        jButton2.setText("Modifier");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erase-128.png"))); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Vider");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Premier");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Précédent");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Suivant");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Dernier");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setText("Rechercher par");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField6.setText("jTextField6");

        jButton10.setText("Rechercher");

        jButton11.setText("Importer");

        jButton12.setText("Exporter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(182, 182, 182))))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(28, 28, 28)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton9)
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           try {   
   
       stmt = con.createStatement();
           
           String Code = null;
            String Banque = null;
           String Compte = null;
            Date created_at = null;
          Date updated_at = null;
          
            
                   
         DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            
        DateFormat only_date=new SimpleDateFormat("dd");
        DateFormat only_month=new SimpleDateFormat("MM");
        DateFormat only_year=new SimpleDateFormat("yyyy");
            
      String sql="INSERT INTO  banque(`Id`, `Code`, `Banque`, `Compte`, `created_at`, `updated_at`) VALUES (NULL,"+jTextField1.getText()+",'"+jTextField2.getText()+"',"+jTextField3.getText()+",'"++"','"++"')";  

//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("role ajoute");
       
 } catch (SQLException ex) {
       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           try {
 DefaultTableModel d = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(d);
      stmt = con.createStatement();
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
      
        d.addColumn("Code");
        d.addColumn("Banque");
        d.addColumn("Compte");
        d.addColumn("created_at");
        d.addColumn("updated_at");
        
          
            ResultSet resultat = stmt.executeQuery( "SELECT * FROM `banque`");
jTable1.setModel(DbUtils.resultSetToTableModel(resultat));
       }
      
            
            
            
            
            
            
         catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
        this.pack();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         int ligne = 0;
    //  JOptionPane.showMessageDialog(null, ligne);
    
    String 			nom=jTable1.getModel().getValueAt(ligne, 1).toString();
    String 	prenom=jTable1.getModel().getValueAt(ligne, 2).toString();
    String 				date_naiss	=jTable1.getModel().getValueAt(ligne, 3).toString();
    String 				ville=jTable1.getModel().getValueAt(ligne, 4).toString();
    String 	adresse=jTable1.getModel().getValueAt(ligne, 5).toString();
    String 			email	=jTable1.getModel().getValueAt(ligne, 6).toString();
    String tel=jTable1.getModel().getValueAt(ligne, 7).toString();
    String 				nom_utilis	=jTable1.getModel().getValueAt(ligne, 8).toString();
    String 					motdepasse	=jTable1.getModel().getValueAt(ligne, 9).toString();
    String 	confirm_mdp=jTable1.getModel().getValueAt(ligne,0).toString();
     String 	login=jTable1.getModel().getValueAt(ligne,0).toString();
      String 	profilee=jTable1.getModel().getValueAt(ligne,0).toString();
       String 	Equipe=jTable1.getModel().getValueAt(ligne,0).toString();
       String 		display_name=jTable1.getModel().getValueAt(ligne,0).toString();
       txt_username.setText(nom);
    jTextPrenom.setText(prenom);
    jTextVille.setText(ville);
    jTextadr.setText(adresse);
    jTextEmail.setText(email);
    jTextTel.setText(tel);
    jTextNom_utils.setText(nom_utilis);
    txt_password.setText(motdepasse);
    jPasswordConfirm.setText(confirm_mdp);
     jTextLogin.setText(login);
    jTextProfile.setText(profilee);
     jTextEquipe.setText(Equipe);
    jComboBox1.setSelectedItem(display_name);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         position--;
      try {      
          int ligne = position;
           
                  stmt = con.createStatement();
        ResultSet resultat;
   
        resultat = stmt.executeQuery( "SELECT * FROM `banque`");
   
        
        
       int i = 0;
while (resultat.next()) {
 
i++;
}
i--;



if(position==0){
position=i;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
           position++;
      try {      
          int ligne = position;
           
                  stmt = con.createStatement();
        ResultSet resultat;
   
        resultat = stmt.executeQuery( "SELECT * FROM `banque`");
   
        
        
       int i = 0;
while (resultat.next()) {
 
i++;
}
i--;



if(position==i){
position=1;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         try { 
        stmt = con.createStatement();
        ResultSet resultat = stmt.executeQuery( "SELECT * FROM `compte`");
        
        
       int i = 0;
while (resultat.next()) {
 
i++;

    System.out.println(i);



}
i--;
position=i;

          String 			nom=jTable1.getModel().getValueAt(position, 1).toString();
    String 	prenom=jTable1.getModel().getValueAt(position, 2).toString();
    String 				date_naiss	=jTable1.getModel().getValueAt(position, 3).toString();
    String 				ville=jTable1.getModel().getValueAt(position, 4).toString();
    String 	adresse=jTable1.getModel().getValueAt(position, 5).toString();
    String 			email	=jTable1.getModel().getValueAt(position, 6).toString();
    String tel=jTable1.getModel().getValueAt(position, 7).toString();
    String 				nom_utilis	=jTable1.getModel().getValueAt(position, 8).toString();
    String 					motdepasse	=jTable1.getModel().getValueAt(position, 9).toString();
    String 	confirm_mdp=jTable1.getModel().getValueAt(position,0).toString();
     String 	login=jTable1.getModel().getValueAt(position,0).toString();
      String 	profilee=jTable1.getModel().getValueAt(position,0).toString();
       String 	Equipe=jTable1.getModel().getValueAt(position,0).toString();
       String 		display_name=jTable1.getModel().getValueAt(position,0).toString();
       txt_username.setText(nom);
    jTextPrenom.setText(prenom);
    jTextVille.setText(ville);
    jTextadr.setText(adresse);
    jTextEmail.setText(email);
    jTextTel.setText(tel);
    jTextNom_utils.setText(nom_utilis);
    txt_password.setText(motdepasse);
    jPasswordConfirm.setText(confirm_mdp);
     jTextLogin.setText(login);
    jTextProfile.setText(profilee);
     jTextEquipe.setText(Equipe);
    jComboBox1.setSelectedItem(display_name);
    } catch (SQLException ex) {
        Logger.getLogger(utilisateurs.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }//GEN-LAST:event_jButton9ActionPerformed
 
    
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
            java.util.logging.Logger.getLogger(Banque_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banque_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banque_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banque_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banque_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}