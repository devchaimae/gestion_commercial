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
public class famillearticles {
  private String idfamillearticle;
    private String Intitule;
    
    
  public famillearticles(String idfamillearticle,String Intitule){
        this.idfamillearticle = idfamillearticle;
        this.Intitule = Intitule;
            } 
  
   public String getidfamillearticle(){
        return this.idfamillearticle;
    }
    
    public String getIntitule(){
        return this.Intitule;
    }  
}
