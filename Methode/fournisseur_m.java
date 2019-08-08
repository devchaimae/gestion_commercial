/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methode;

import gestion_commercial.CONNEXION.NewCon;
import gestion_commercial.View.Login;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class fournisseur_m extends methode{
NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
    private Object Rs;
   
    void supprimer(int id) {
          try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`fournisseur` WHERE `Id_Fournie`="+id;
        stmt.executeUpdate(sql); 
           System.out.println("fournisseur supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void modifier(int Id_Fournie,int Num_compte,int Compte_collectif,String Intitule,int Quantite,String Contact,String Ville,int Numero_serie,int Identifiant,String Tel,String Telecopie,String Email,String Site) {
        try {  
            
             stmt = con.createStatement();
            String sql="UPDATE `fournisseur` SET `Num_compte`='"+Num_compte+"',`Compte_collectif`='"+Compte_collectif+"',`Intitule`='"+Intitule+"',`Quantite`='"+Quantite+"',`Contact`='"+Contact+"',`Ville`='"+Ville+"',`Numero_serie`='"+Numero_serie+"',`Identifiant`='"+Identifiant+"',`Tel`='"+Tel+"',`Telecopie`='"+Telecopie+"',`Email`='"+Email+"',`Site`='"+Site+"' WHERE `Id_Fournie`="+Id_Fournie;
            stmt.executeUpdate(sql); 
           System.out.println("fournisseur modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void ajouter(int Id_Fournie,int Num_compte,int Compte_collectif,String Intitule,int Quantite,String Contact,String Ville,int Numero_serie,int Identifiant,String Tel,String Telecopie,String Email,String Site) {
      try {   
   
       stmt = con.createStatement();
           
          
        
          
            
                   
        
            
      String sql="INSERT INTO `fournisseur`(`Id_Fournie`, `Num_compte`, `Compte_collectif`, `Intitule`, `Quantite`, `Contact`, `Ville`, `Numero_serie`, `Identifiant`, `Tel`, `Telecopie`, `Email`, `Site`) VALUES (NULL,'"+Num_compte+"','"+Compte_collectif+"','"+Intitule+"','"+Quantite+"','"+Contact+"','"+Ville+"','"+Numero_serie+"','"+Identifiant+"','"+Tel+"','"+Telecopie+"','"+Email+"','"+Site+"')";  

//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("fournisseur ajoute");
       
 } catch (SQLException ex) {
       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
  }
    }

    
    ResultSet lister() {
       try {
 DefaultTableModel d = new DefaultTableModel();
    Container cnt = this.getContentPane();
    
      stmt = con.createStatement();
        cnt.setLayout(new FlowLayout(FlowLayout.LEFT));
      
        d.addColumn("Id_Fournie");
        d.addColumn("Num_compte");
        d.addColumn("Compte_collectif");
        d.addColumn("Intitule");
         d.addColumn("Quantite");
        d.addColumn("Contact");
        d.addColumn("Ville");
            d.addColumn("Numero_serie");
        d.addColumn("Identifiant");
        d.addColumn("Tel");
            d.addColumn("Telecopie");
        d.addColumn("Email");
        d.addColumn("Site");
       
       JTable jtbl = new JTable(d);
        
          
   ResultSet resultat = stmt.executeQuery( "SELECT * FROM `fournisseur`");
   return resultat;

       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return null;
   
    }

    
    void rechercher() {
       
    }
    
}
