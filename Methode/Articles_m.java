/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methode;

import Entite.article;
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
public class Articles_m  {
NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
    private Object Rs;
    void supprimer(int id) {
          try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`compte` WHERE `Id_article`="+id;
        stmt.executeUpdate(sql); 
           System.out.println("article supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void modifier(article A) {
       try {  
            
             stmt = con.createStatement();
           String id = null;
            String sql="UPDATE `article` SET `designation`='"+A.getDesignation()+"',"
                    + "`famille`='"+A.getFamille()+"',`coefficient`='"+A.getCoefficient()+"',"
                    + "`prix_achat`='"+A.getPrix_achat()+"',`unit_vente`='"+A.getUnit_vente()+"',"
                    + "`conditionnment`='"+A.getConditionnement()+"' WHERE `Id_article`="+id;
            stmt.executeUpdate(sql); 
           System.out.println("article modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void ajouter(article A) {
        try {   
   
       stmt = con.createStatement();
           
          
        
          
            
                   
        
            
      String sql="INSERT INTO `article`(`Id_article`, "
              + "`designation`, `famille`, `coefficient`, `prix_achat`, `unit_vente`, "
              + "`conditionnment`) VALUES"
              + " (NULL,'"+A.getDesignation()+"','"+A.getFamille()+"',"
              + "'"+A.getCoefficient()+"','"+A.getPrix_achat()+"',"
              + "'"+A.getUnit_vente()+"','"+A.getConditionnement()+"')";  

//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("article ajoute");
       
 } catch (SQLException ex) {
       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
  }
    }

    
    ResultSet lister() {
 try {
 DefaultTableModel d = new DefaultTableModel();
   
    
      stmt = con.createStatement();
        
      
        d.addColumn("Id_article");
        d.addColumn("designation");
        d.addColumn("famille");
        d.addColumn("coefficient");
         d.addColumn("prix_achat");
        d.addColumn("unit_vente");
        d.addColumn("conditionnment");
       
       JTable jtbl = new JTable(d);
        
          
   ResultSet resultat = stmt.executeQuery( "SELECT * FROM `article`");
   return resultat;

       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return null;
   
      
    }

   
    void rechercher() {
        
    }
    
}
