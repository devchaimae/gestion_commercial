/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.class_g;

/**
 *
 * @author Home
 */
public class fournisseur {
    private int Num_compte;
    private int Compte_collectif;
    private String Intitule;
    private int Quantite;
    private String Contact;
    private String 	Ville;
    private int Numero_serie;
    private int Identifiant;
    private String 	Tel;
    private String Telecopie;
    private String 	Email;
    private String Site;

    public int getNum_compte() {
        return Num_compte;
    }

    public void setNum_compte(int Num_compte) {
        this.Num_compte = Num_compte;
    }

    public int getCompte_collectif() {
        return Compte_collectif;
    }

    public void setCompte_collectif(int Compte_collectif) {
        this.Compte_collectif = Compte_collectif;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String Intitule) {
        this.Intitule = Intitule;
    }

    public int getQuantite() {
        return Quantite;
    }

    public void setQuantite(int Quantite) {
        this.Quantite = Quantite;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public int getNumero_serie() {
        return Numero_serie;
    }

    public void setNumero_serie(int Numero_serie) {
        this.Numero_serie = Numero_serie;
    }

    public int getIdentifiant() {
        return Identifiant;
    }

    public void setIdentifiant(int Identifiant) {
        this.Identifiant = Identifiant;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getTelecopie() {
        return Telecopie;
    }

    public void setTelecopie(String Telecopie) {
        this.Telecopie = Telecopie;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public fournisseur(int Num_compte, int Compte_collectif, String Intitule, int Quantite, String Contact, String Ville, int Numero_serie, int Identifiant, String Tel, String Telecopie, String Email, String Site) {
        this.Num_compte = Num_compte;
        this.Compte_collectif = Compte_collectif;
        this.Intitule = Intitule;
        this.Quantite = Quantite;
        this.Contact = Contact;
        this.Ville = Ville;
        this.Numero_serie = Numero_serie;
        this.Identifiant = Identifiant;
        this.Tel = Tel;
        this.Telecopie = Telecopie;
        this.Email = Email;
        this.Site = Site;
    }
}
