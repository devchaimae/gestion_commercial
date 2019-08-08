/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.util.Date;
import javafx.scene.text.Text;

/**
 *
 * @author Home
 */
public class Login {
    private String nom;
    private String prenom;
    private Date date_naiss;
    private String ville;
    private Text adr;
    private Text email;
    private Text tel;
    private Text mdp;
    private int profilee;
    private int equipe;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setAdr(Text adr) {
        this.adr = adr;
    }

    public void setEmail(Text email) {
        this.email = email;
    }

    public void setTel(Text tel) {
        this.tel = tel;
    }

    public void setMdp(Text mdp) {
        this.mdp = mdp;
    }

    public void setProfilee(int profilee) {
        this.profilee = profilee;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDate_naiss() {
        return date_naiss;
    }

    public String getVille() {
        return ville;
    }

    public Text getAdr() {
        return adr;
    }

    public Text getEmail() {
        return email;
    }

    public Text getTel() {
        return tel;
    }

    public Text getMdp() {
        return mdp;
    }

    public int getProfilee() {
        return profilee;
    }

    public int getEquipe() {
        return equipe;
    }

    public Login(String nom, String prenom, Date date_naiss, String ville, Text adr, Text email, Text tel, Text mdp, int profilee, int equipe) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.ville = ville;
        this.adr = adr;
        this.email = email;
        this.tel = tel;
        this.mdp = mdp;
        this.profilee = profilee;
        this.equipe = equipe;
    }
    
}
