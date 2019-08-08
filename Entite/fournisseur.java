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
public class fournisseur {
    private String numcompf;
    private String intitule;
    
    
  public fournisseur(String numcompf,String intitule){
        this.numcompf = numcompf;
        this.intitule = intitule;
            } 
  
   public String getnumcompf(){
        return this.numcompf;
    }
    
    public String getintitule(){
        return this.intitule;
    }
}
