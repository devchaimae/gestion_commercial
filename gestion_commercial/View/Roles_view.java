/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.View;

/**
 *
 * @author Home
 */
import gestion_commercial.CONNEXION.NewCon;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Roles_view extends javax.swing.JFrame {
NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
     int position=1;
    private Object jDateChooser1;
    private Object jDateChooser2;
    private Object jTextField4;
    private Object Rs;
    /**
     * Creates new form Roles_view
     */
    private void afficher(){
           try {
 DefaultTableModel d = new DefaultTableModel();
    Container cnt = this.getContentPane();
    JTable jtbl = new JTable(d);
      stmt = con.createStatement();
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
      
        d.addColumn("display_name");
        d.addColumn("description");
        d.addColumn("created_at");
        d.addColumn("updated_at");
        
          
            ResultSet resultat = stmt.executeQuery( "SELECT * FROM `roles`");
jTable1.setModel(DbUtils.resultSetToTableModel(resultat));
       }
      
            
            
            
            
            
            
         catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
     
}
    public Roles_view() {
        initComponents();
        d=(DefaultTableModel)jTable1.getModel();
      d.addColumn("id");
d.addColumn("namee");
d.addColumn("display_name");
d.addColumn("description");
d.addColumn("created_at");
d.addColumn("updated_at");
this.setResizable(false);
afficher();
    }
    private void deplace(int i){
try {
CODE.setText(d.getValueAt(i,0).toString());
activer.setSelectedItem(d.getValueAt(i,1).toString());
DESCRIPTION.setText(d.getValueAt(i,2).toString());

}catch (Exception e){System.err.println(e);
JOptionPane.showMessageDialog(null,"erreur de deplacement"+e.getLocalizedMessage());}
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooserBeanInfo1 = new com.toedter.calendar.JDayChooserBeanInfo();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CODE = new javax.swing.JTextField();
        DESCRIPTION = new javax.swing.JTextField();
        NOM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        activer = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update icon.png"))); // NOI18N
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_16x16.gif"))); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erase-128.png"))); // NOI18N
        jButton4.setText("Vider");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Activé");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Description");

        CODE.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Code");

        activer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Desactivé", " " }));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(activer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DESCRIPTION, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(NOM))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addComponent(CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DESCRIPTION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(activer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_commercial/View/kontact-import-wizard-icon.png"))); // NOI18N
        jButton11.setText("Importer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_commercial/View/import-icon.png"))); // NOI18N
        jButton12.setText("EXPORTER");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton7.setText("<<");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("<");
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(">");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText(">>");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {   
   
       stmt = con.createStatement();
           
           String namee = null;
            String display_name = null;
           String description = null;
            Date created_at = null;
          Date updated_at = null;
          
             String sql;
                   
    //     DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            
     //    DateFormat only_date=new SimpleDateFormat("dd");
      //   DateFormat only_month=new SimpleDateFormat("MM");
      //   DateFormat only_year=new SimpleDateFormat("yyyy");
          //  df.format(jDateChooser3.getDate())
             
             
          if(activer.getSelectedItem().toString().equals("Active")){
            sql="INSERT INTO  roles(`id`, `name`, `display_name`, `description`, `created_at`, `updated_at`) VALUES (NULL,'"
              +NOM.getText()
              +"',"+1
              +",'"+DESCRIPTION.getText()
              +"',now(),now())";      
        
        }
        else{
               
        sql="INSERT INTO  roles(`id`, `name`, `display_name`, `description`, `created_at`, `updated_at`) VALUES (NULL,'"
              +NOM.getText()
              +"',"+0
              +",'"+DESCRIPTION.getText()
              +"',now(),now())";  
        }
      

jTextField5.setText(sql);
stmt.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Role Ajoute");
      System.out.println("");
       afficher();
 } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null,ex.getMessage());
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           
       
      
      
        
        try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`roles` WHERE `id`="+NOM.getText();
        stmt.executeUpdate(sql); 
           System.out.println("role supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
        
        
       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           
        try {  
             DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            
        DateFormat only_date=new SimpleDateFormat("dd");
        DateFormat only_month=new SimpleDateFormat("MM");
        DateFormat only_year=new SimpleDateFormat("yyyy");
             stmt = con.createStatement();
            String sql="UPDATE `roles` SET `namee`='"+CODE.getText()+"',`display_name`='"+jTextField2.getText()+"',`description`='"+DESCRIPTION.getText()+"',`created_at`='"+df.format(jDateChooser3.getDate())+"',`updated_at`='"+df.format(jDateChooser4.getDate())+"' WHERE `id`="+NOM.getText()+"";
            stmt.executeUpdate(sql); 
           System.out.println("role modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
         afficher();
    }//GEN-LAST:event_jButton5ActionPerformed

@SuppressWarnings("empty-statement")
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       try {   int ligne=jTable1.getSelectedRow();
           DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            
        DateFormat only_date=new SimpleDateFormat("dd");
        DateFormat only_month=new SimpleDateFormat("MM");
        DateFormat only_year=new SimpleDateFormat("yyyy");
      //  JOptionPane.showMessageDialog(null, ligne);
     
        String 	namee=jTable1.getModel().getValueAt(ligne, 1).toString();
         String display_name=jTable1.getModel().getValueAt(ligne, 2).toString();
         if(display_name.equals("1")){
           activer.setSelectedItem("Activé");  
         }else{
             activer.setSelectedItem("Desactivé"); 
         }
         
          String 		description=jTable1.getModel().getValueAt(ligne, 3).toString();
          
  
        Date 	created_at=df.parse(jTable1.getModel().getValueAt(ligne, 4).toString());
   
           
            Date		updated_at=df.parse(jTable1.getModel().getValueAt(ligne, 5).toString());
            
            String id=jTable1.getModel().getValueAt(ligne,0).toString();
             NOM.setText(namee);
             
              DESCRIPTION.setText(description);
              CODE.setText(id);
              //jDateChooser3.setDate(created_at);
              // jDateChooser4.setDate(updated_at);
              
              
              System.out.println("gestion_commercial.View.Roles_view.jTable1MouseClicked()");
             
               } catch (ParseException ex) {
        Logger.getLogger(Roles_view.class.getName()).log(Level.SEVERE, null, ex);
    }
              
             
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         int ligne = 0;
    //  JOptionPane.showMessageDialog(null, ligne);
    
    String 			namee=jTable1.getModel().getValueAt(ligne, 1).toString();
    String 	display_name=jTable1.getModel().getValueAt(ligne, 2).toString();
    String 					description	=jTable1.getModel().getValueAt(ligne, 3).toString();
   
       CODE.setText(namee);
    activer.addItem(display_name);
    DESCRIPTION.setText(description);
  
   
   
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
           position--;
      try {      
          int ligne = position;
           
                  stmt = con.createStatement();
        ResultSet resultat;
   
        resultat = stmt.executeQuery( "SELECT * FROM `roles`");
   
        
        
       int i = 0;
while (resultat.next()) {
 
i++;
}
i--;



if(position==0){
position=i;
}




    //  JOptionPane.showMessageDialog(null, ligne);
    
    String 			namee=jTable1.getModel().getValueAt(ligne, 1).toString();
    String 	display_name=jTable1.getModel().getValueAt(ligne, 2).toString();
    String 				description	=jTable1.getModel().getValueAt(ligne, 3).toString();
   
       CODE.setText(namee);
    activer.setSelectedItem(display_name);
    DESCRIPTION.setText(description);
   
         } catch (SQLException ex) {
        Logger.getLogger(utilisateurs.class.getName()).log(Level.SEVERE, null, ex);
    }
  
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
            position++;
      try {      
          int ligne = position;
           
                  stmt = con.createStatement();
        ResultSet resultat;
   
        resultat = stmt.executeQuery( "SELECT * FROM ` roles`");
   
        
        
       int i = 0;
while (resultat.next()) {
 
i++;
}
i--;



if(position==i){
position=1;
}




    //  JOptionPane.showMessageDialog(null, ligne);
    
    String 				namee=jTable1.getModel().getValueAt(ligne, 1).toString();
    String 	display_name	=jTable1.getModel().getValueAt(ligne, 2).toString();
    String 					description	=jTable1.getModel().getValueAt(ligne, 3).toString();
    
       CODE.setText(namee);
    activer.setSelectedItem(display_name);
     DESCRIPTION.setText(description);
   
        
         } catch (SQLException ex) {
        Logger.getLogger(utilisateurs.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
          try { 
        stmt = con.createStatement();
        ResultSet resultat = stmt.executeQuery( "SELECT * FROM `roles`");
        
        
       int i = 0;
while (resultat.next()) {
 
i++;

    System.out.println(i);



}
i--;
position=i;

          String 				namee=jTable1.getModel().getValueAt(position, 1).toString();
    String 	display_name=jTable1.getModel().getValueAt(position, 2).toString();
    String 				description	=jTable1.getModel().getValueAt(position, 3).toString();
    
       CODE.setText(namee);
    activer.setSelectedItem(display_name);
    DESCRIPTION.setText(description);
   
    } catch (SQLException ex) {
        Logger.getLogger(utilisateurs.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Roles_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Roles_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Roles_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Roles_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Roles_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CODE;
    private javax.swing.JTextField DESCRIPTION;
    private javax.swing.JTextField NOM;
    private javax.swing.JComboBox<String> activer;
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
    private com.toedter.calendar.JDayChooserBeanInfo jDayChooserBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
