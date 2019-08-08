/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.class_g;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author didiy
 */

public class utilisateur {

     private int id_compte;
    private String nom;
    private String prenom;
    private Date date_naiss;
    private String ville;
    private String adresse;
    private String email;
    private String tel;
    private String motdepasse;
    private String confirm_mdp;
    private int profilee;
    private int equipe;
    private int display_name; 
    public utilisateur(int id_compte, String nom, String prenom, Date date_naiss, String ville, String adresse, String email, String tel, String motdepasse, String confirm_mdp, int profilee, int equipe, int display_name) {
        this.id_compte = id_compte;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.ville = ville;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
        this.motdepasse = motdepasse;
        this.confirm_mdp = confirm_mdp;
        this.profilee = profilee;
        this.equipe = equipe;
        this.display_name = display_name;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getConfirm_mdp() {
        return confirm_mdp;
    }

    public void setConfirm_mdp(String confirm_mdp) {
        this.confirm_mdp = confirm_mdp;
    }

 

    public int getProfilee() {
        return profilee;
    }

    public void setProfilee(int profilee) {
        this.profilee = profilee;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public int getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(int display_name) {
        this.display_name = display_name;
    }
   
    
    
}
