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
public class article {
    private String idarticle;
    private String designation;
    private String  famille;
    private int coefficient;
    private float prix_achat;
    private float unit_vente;
    private String Conditionnement;

    public article(String idarticle, String designation, String famille, int coefficient, float prix_achat, float unit_vente, String Conditionnement) {
        this.idarticle = idarticle;
        this.designation = designation;
        this.famille = famille;
        this.coefficient = coefficient;
        this.prix_achat = prix_achat;
        this.unit_vente = unit_vente;
        this.Conditionnement = Conditionnement;
    }

    public String getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(String idarticle) {
        this.idarticle = idarticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public float getPrix_achat() {
        return prix_achat;
    }

    public void setPrix_achat(float prix_achat) {
        this.prix_achat = prix_achat;
    }

    public float getUnit_vente() {
        return unit_vente;
    }

    public void setUnit_vente(float unit_vente) {
        this.unit_vente = unit_vente;
    }

    public String getConditionnement() {
        return Conditionnement;
    }

    public void setConditionnement(String Conditionnement) {
        this.Conditionnement = Conditionnement;
    }
    
    
 
    
}
