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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Home
 */
public class Materiel_m extends methode{

     NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
    private Object Rs;
    void supprimer(int id) {
          try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`materiel` WHERE `Id_materiel`="+id;
        stmt.executeUpdate(sql); 
           System.out.println("materiel supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void modifier(int Id_materiel,String categorie, int marque,int code,String nom,String couleur,int puissance,String types,String matricule,int poids,int capacite,Date DateFabri,Date DateAchat) {
         try {  
            
             stmt = con.createStatement();
            String sql="UPDATE `depot` SET `categorie`='"+categorie+"',`marque`='"+marque+"',`code`='"+code+"',`nom`='"+nom+"',`couleur`='"+couleur+"',`puissance`='"+puissance+"',`types`='"+types+"',`matricule`='"+matricule+"',`poids`='"+poids+"',`capacite`='"+capacite+"',`DateFabri`='"+DateFabri+"',`DateAchat`='"+DateAchat+"' WHERE `Id_materiel`="+Id_materiel;
            stmt.executeUpdate(sql); 
           System.out.println("materiel modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void ajouter(int Id_materiel,String categorie, int marque,int code,String nom,String couleur,int puissance,String types,String matricule,int poids,int capacite,Date DateFabri,Date DateAchat) {
        
     try {   
   
       stmt = con.createStatement();
           
          
        
          
            
                   
        
            
      String sql="INSERT INTO `materiel`(`Id_materiel`, `categorie`, `marque`, `code`, `nom`, `couleur`, `puissance`,"
              + "`types`,`matricule`,`poids`,`capacite`,`DateFabri`,`DateAchat`) VALUES "
              + "(NULL,'"+categorie+"','"+marque+"','"+code+"','"+nom+"','"+couleur+"','"+puissance+"','"+types+"','"+matricule+"','"+poids+"','"+capacite+"','"+DateFabri+"','"+DateAchat+"')";  

//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("materiel ajoute");
       
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
      
        d.addColumn("Id_materiel");
        d.addColumn("categorie");
        d.addColumn("marque");
        d.addColumn("code");
         d.addColumn("nom");
        d.addColumn("couleur");
        d.addColumn("puissance");
        d.addColumn("types");
        d.addColumn("matricule");
        d.addColumn("poids");
        d.addColumn("capacite");
        d.addColumn("DateFabri");
        d.addColumn("DateAchat");
        
        
       
       JTable jtbl = new JTable(d);
        
          
   ResultSet resultat = stmt.executeQuery( "SELECT * FROM `materiel`");
   return resultat;

       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return null;
   
    }

    
    void rechercher() {
       
    }
    
}
