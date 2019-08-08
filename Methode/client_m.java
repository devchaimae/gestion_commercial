/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methode;

import Entite.client;
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
public class client_m {
NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
     private Object Rs;
    
 public    void supprimer(int id) {
           try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`client` WHERE `IdClient`="+id;
        stmt.executeUpdate(sql); 
           System.out.println("client supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

   
 public   void modifier(client C,int id) {
        
        try {  
            
             stmt = con.createStatement();
            String sql="UPDATE `client` SET +`num_compte`='"+C.getNum_compte()+"', `NOM_CLIENT`='"+
                    C.getNom()+"',`Forme juridique`='"+C.getForme_juridique()+"',`Responsable`= '"+C.getRp()+"',"
                    + "`adresse`='"+C.getAdr()+"',`ville`='"+C.getVille()+"',`region`='"+C.getRegion()+"',`pays`='"+C.getPays()+"',"
                    + "`numerompte`='\"+C.getNum_compte()+\"',\n" +
"                   \"`NOM_CLo_serie`='"+C.getNumero_serie()+"',`naf`='"+C.getNaf()+"',`num_identifiant`='"+C.getNum_identifiant()+"',"
                    + "`MAIL`='"+C.getEmail()+"',`SITE_WEB`='"+C.getSite_web()+"',`GROUPE`='"+C.getGroupe()+"',"
                           + "`CATEGORIE`=,'"+C.getCategorie()+"',`PORTABLE`='"+C.getPortable()+"',`FAX`='"+C.getFax()+"',`SIRET`='"+C.getSiret()+"',`compte_collectif`='"+C.getCompte_collectif()+"'"
                    + "`QTE`='"+C.getQte()+"' WHERE `IdClient`="+id;
            stmt.executeUpdate(sql); 
           System.out.println("client modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }

    
 public   void ajouter(client C) {
        try {   
   
       stmt = con.createStatement();
           
          
        
          
            
                   
        
            
      String sql="INSERT INTO `client`(`IdClient`, `num_compte`,"
              + " `NOM_CLIENT`, `Forme juridique`, `Responsable`,"
              + " `adresse`, `ville`, `region`, `pays`, `numero_serie`, `naf`, `num_identifiant`,`MAIL`,"
              + " `SITE_WEB`,`GROUPE`, `CATEGORIE`,`PORTABLE`,`FAX`,`SIRET`,`compte_collectif`,`QTE`)"
              + " VALUES (NULL,'"+C.getNum_compte()+"','"+C.getNom()+"','"+C.getForme_juridique()+"',"
              + "'"+C.getRp()+"','"+C.getAdr()+"','"+C.getVille()+"',"
              + "'"+C.getRegion()+"','"+C.getPays()+"','"+C.getNumero_serie()+"','"+C.getNaf()+"'"
              + ",'"+C.getNum_identifiant()+"','"+C.getEmail()+"','"+C.getSite_web()+"'"
              + ",'"+C.getGroupe()+"','"+C.getCategorie()+"','"+C.getPortable()+"','"+C.getFax()+"',"
              + "'"+C.getSiret()+"','"+C.getCompte_collectif()+"','"+C.getQte()+"')";  
System.out.println(sql);
//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("client ajoute");
            System.out.println(sql);
       
 } catch (SQLException ex) {
       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
  }
    }

   
    ResultSet lister() {
     
        try {
 DefaultTableModel d = new DefaultTableModel();
   
    
      stmt = con.createStatement();
       
      
        d.addColumn("IdClient");
        d.addColumn("num_compte");
        d.addColumn("NOM_CLIENT");
        d.addColumn("Forme juridique");
         d.addColumn("Responsable");
        d.addColumn("adresse");
        d.addColumn("ville");
        d.addColumn("region");
         d.addColumn("pays");
        d.addColumn("numero_serie");
        d.addColumn("naf");
        d.addColumn("num_identifiant");
        d.addColumn("MAIL");
        d.addColumn("SITE_WEB");
        d.addColumn("GROUPE");
        d.addColumn("CATEGORIE");
        d.addColumn("PORTABLE");
        d.addColumn("FAX");
        d.addColumn("SIRET");
       JTable jtbl = new JTable(d);
        
          
   ResultSet resultat = stmt.executeQuery( "SELECT * FROM `client`");
   return resultat;

       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return null;
   
      
        
    }

   

   
    
}
