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
public class Depot_m extends methode {

    NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
    private Object Rs;
    void supprimer(int id) {
         try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`depot` WHERE `Id_depot`="+id;
        stmt.executeUpdate(sql); 
           System.out.println("depot supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
    void modifier(int Id_depot,String inttitule, String adr,String complement,String ville,String 	region,String pays,String responsable) {
        try {  
            
             stmt = con.createStatement();
            String sql="UPDATE `depot` SET `inttitule`='"+inttitule+"',`adresse`='"+adr+"',`complement`='"+complement+"',`ville`='"+ville+"',`region`='"+region+"',`pays`='"+pays+"',`responsable`='"+responsable+"' WHERE `Id_depot`="+Id_depot;
            stmt.executeUpdate(sql); 
           System.out.println("depot modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

   
    void ajouter(int Id_depot,String inttitule, String adr,String complement,String ville,String 	region,String pays,String responsable) {
      try {   
   
       stmt = con.createStatement();
           
          
        
          
            
                   
        
            
      String sql="INSERT INTO `depot`(`Id_depot`, `inttitule`, `adresse`, `complement`, `ville`, `region`, `pays`,`responsable`) VALUES (NULL,'"+inttitule+"','"+adr+"','"+complement+"','"+ville+"','"+region+"','"+pays+"','"+responsable+"')";  

//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("depot ajoute");
       
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
      
        d.addColumn("Id_depot");
        d.addColumn("inttitule");
        d.addColumn("adresse");
        d.addColumn("complement");
         d.addColumn("ville");
        d.addColumn("region");
        d.addColumn("pays");
        d.addColumn("responsable");
       
       JTable jtbl = new JTable(d);
        
          
   ResultSet resultat = stmt.executeQuery( "SELECT * FROM `depot`");
   return resultat;

       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return null;
   
      
    }

    
    void rechercher() {
        
    }
    
}
