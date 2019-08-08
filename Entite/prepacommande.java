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
public class prepacommande {
  private String ref_article;
    private String designation;
    private String quantite;
    private String unite;
    private Float remise;
    
    
  public prepacommande(String ref_article,String designation,String quantite,String unite,Float remise){
        this.ref_article = ref_article;
        this.designation = designation;
         this.quantite = quantite;
          this.unite = unite;
          this.remise = remise;
                } 
  
   public String getref_article(){
        return this.ref_article;
    }
    
    public String getdesignation(){
        return this.designation;
    }   
    public String getquantite(){
        return this.quantite;
    }
    
    public String getunite(){
        return this.unite;
    }  
     public Float getremise(){
        return this.remise;
    }  
}
