/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author Boubacar
 */
public class materiel {
  
    private String codemateriel;
    private String Nom;
    private String matricule;
    private String marque;
    private String type;
    
  public materiel(String codemateriel,String Nom,String matricule,String marque,String type){
        this.codemateriel = codemateriel;
        this.Nom = Nom;
        this.matricule = matricule;
        this.marque = marque;
        this.type = type;
            } 
  
   public String getcodemateriel(){
        return this.codemateriel;
    }
    
       public String getmatricule(){
        return this.matricule;
    }
        public String getNom(){
        return this.Nom;
    }
         public String getmarque(){
        return this.marque;
    }
          public String gettype(){
        return this.type;
    }
}
