/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author Home
 */
public class marque {
    int code_marque;
   String nom_marque;

    public marque(int code_marque, String nom_marque) {
        this.code_marque = code_marque;
        this.nom_marque = nom_marque;
    }

    public int getCode_marque() {
        return code_marque;
    }

    public void setCode_marque(int code_marque) {
        this.code_marque = code_marque;
    }

    public String getNom_marque() {
        return nom_marque;
    }

    public void setNom_marque(String nom_marque) {
        this.nom_marque = nom_marque;
    }
  
}
