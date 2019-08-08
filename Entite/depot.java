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
public class depot {
    
     private int codedepot;
    private String inttitule;
    
    
  public depot(int codedepot,String inttitule){
        this.codedepot = codedepot;
        this.inttitule = inttitule;
            } 
  
   public int getcodedepot(){
        return this.codedepot;
    }
    
    public String getinttitule(){
        return this.inttitule;
    }
}
