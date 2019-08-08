/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methode;

import gestion_commercial.CONNEXION.NewCon;
import gestion_commercial.View.GeMaME;
import gestion_commercial.View.Login;
import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Home
 */
public class Login_m {
NewCon cnx=new NewCon();
       Connection con=cnx.getInstance();
      Statement stmt;  
    DefaultTableModel d =new DefaultTableModel();
    int selectedrow;
    // private Object jDateChoosr1;
    //private Object jDateChoer2;
    
    private Object Rs;

    void supprimer(int id) {
                try {  
            
             stmt = con.createStatement();
            String sql="DELETE FROM `megecbase`.`compte` WHERE `num_compte`="+id;
        stmt.executeUpdate(sql); 
           System.out.println("compte supprimé");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }


    void modifier(int id,String nom,String prenom,Date date_naiss,String ville,String adr,String email,String Tel,String mdp,int profilee,int Equipe,String display_name) {
        
         try {  
            
             stmt = con.createStatement();
            String sql="UPDATE `compte` SET `nom`='"+nom+"',`prenom`='"+prenom+"',`date_naiss`='"+date_naiss+"',`ville`='"+ville+"',`adresse`='"+adr+"',`email`='"+email+"',`tel`='"+Tel+"',`motdepasse`='"+mdp+"',`profilee`='"+profilee+"',`Equipe`='"+Equipe+"',`display_name`='"+display_name+"' WHERE `num_compte`="+id;
            stmt.executeUpdate(sql); 
           System.out.println("compte modifié");
        }catch(Exception e){ System.out.println("les champs vous manque à remplir");}
    }


    void ajouter(int id,String nom,String prenom,Date date_naiss,String ville,String adr,String email,String Tel,String mdp,int profilee,int Equipe,String display_name) {
        
          try {   
   
       stmt = con.createStatement();
           
          
        
          
            
                   
        
            
      String sql="INSERT INTO `compte`(`Id_compte`, `nom`, `prenom`, `date_naiss`, `ville`, `adresse`, `email`, `tel`, `motdepasse`, `profilee`, `Equipe`, `display_name`) VALUES (NULL,'"+nom+"','"+prenom+"','"+date_naiss+"','"+ville+"','"+adr+"','"+email+"','"+Tel+"','"+mdp+"','"+profilee+"','"+Equipe+"','"+display_name+"')";  

//jTextField5.setText(sql);
stmt.executeUpdate(sql);
      System.out.println("compte ajoute");
       
 } catch (SQLException ex) {
       Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
  }
    }

    /**
     *
     * @return
     */
    
    public JTable tab(){
 DefaultTableModel d = new DefaultTableModel();
       d.addColumn("Id_compte");
        d.addColumn("nom");
        d.addColumn("prenom");
        d.addColumn("date_naiss");
         d.addColumn("ville");
        d.addColumn("adresse");
        d.addColumn("email");
        d.addColumn("tel");
         d.addColumn("motdepasse");
        d.addColumn("profilee");
        d.addColumn("Equipe");
        d.addColumn("display_name");
       JTable jtbl = new JTable(d);
       return jtbl;


}

    public ResultSet lister() {
       
        try {

    
      stmt = con.createStatement();
       
      
    
        
          
   ResultSet resultat = stmt.executeQuery( "SELECT * FROM `compte`");
   return resultat;

       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    return null;
   
      
        
    }
     public  void rechercher(String mdp) {
           
           try {    
         NewCon cnx=new NewCon();
         cnx.getInstance();
         boolean rech=false;
   
        Statement stmt = (Statement) cnx.getStatement();
        
        
        /* Exécution d'une requête de lecture */
       
ResultSet resultat = stmt.executeQuery( "SELECT * FROM `compte` WHERE `motdepasse` ='"+mdp+"'");

   //On récupère les MetaData
      ResultSetMetaData resultMeta = resultat.getMetaData();
         
    //  System.out.println("\n**********************************");
      //On affiche le nom des colonnes
      for(int i = 1; i <= resultMeta.getColumnCount(); i++);
       // System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
         
      //System.out.println("\n**********************************");
         
      while(resultat.next()){         
        for(int i = 1; i <= resultMeta.getColumnCount(); i++){
        //intrface p=new intrface();
        GeMaME p=new GeMaME();
        rech=true;
p.show(true);

break;
            
        }
            
         // System.out.print("\t" + resultat.getObject(i).toString() + "\t |");
            
       // System.out.println("\n---------------------------------");


      }
      if(rech==false){
          JOptionPane.showMessageDialog(null,"login ou mot de passe incorrect");
      }
  

  
     
    }catch (Exception ex) {
      ex.printStackTrace();
    }
 
           
           
           
           
      }

    
    
}
