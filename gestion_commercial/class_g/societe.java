/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.class_g;

import java.util.Date;

/**
 *
 * @author didiy
 */
public class societe {
     private int id;
    private String Nom_Enseigne_Raison_sociale;
    private String  	Adresse;
    private String  Code_postal;
     private String 	Ville;
    private String 	Pays;
    private String  Departement_Canton;
    private String  	Devise_principale;
     private String Téléphone;
    private String Fax;
    private String  	Email;
    private String  Web;
     private String  	Logo;
     private String 	Note;
    private String directeur;
    private Float  	Capital;
    private int  	Id_prof_1;
     private int  Id_prof_2;
     private int  Id_prof_3;
     private int 	Id_prof_4;
    private String 	Id_prof_5;
    private  Date 		Mois_de_debut_dexercice;
    private int  		TVA;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_Enseigne_Raison_sociale() {
        return Nom_Enseigne_Raison_sociale;
    }

    public void setNom_Enseigne_Raison_sociale(String Nom_Enseigne_Raison_sociale) {
        this.Nom_Enseigne_Raison_sociale = Nom_Enseigne_Raison_sociale;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getCode_postal() {
        return Code_postal;
    }

    public void setCode_postal(String Code_postal) {
        this.Code_postal = Code_postal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public String getDepartement_Canton() {
        return Departement_Canton;
    }

    public void setDepartement_Canton(String Departement_Canton) {
        this.Departement_Canton = Departement_Canton;
    }

    public String getDevise_principale() {
        return Devise_principale;
    }

    public void setDevise_principale(String Devise_principale) {
        this.Devise_principale = Devise_principale;
    }

    public String getTéléphone() {
        return Téléphone;
    }

    public void setTéléphone(String Téléphone) {
        this.Téléphone = Téléphone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String Web) {
        this.Web = Web;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public String getDirecteur() {
        return directeur;
    }

    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }

    public Float getCapital() {
        return Capital;
    }

    public void setCapital(Float Capital) {
        this.Capital = Capital;
    }

    public int getId_prof_1() {
        return Id_prof_1;
    }

    public void setId_prof_1(int Id_prof_1) {
        this.Id_prof_1 = Id_prof_1;
    }

    public int getId_prof_2() {
        return Id_prof_2;
    }

    public void setId_prof_2(int Id_prof_2) {
        this.Id_prof_2 = Id_prof_2;
    }

    public int getId_prof_3() {
        return Id_prof_3;
    }

    public void setId_prof_3(int Id_prof_3) {
        this.Id_prof_3 = Id_prof_3;
    }

    public int getId_prof_4() {
        return Id_prof_4;
    }

    public void setId_prof_4(int Id_prof_4) {
        this.Id_prof_4 = Id_prof_4;
    }

    public String getId_prof_5() {
        return Id_prof_5;
    }

    public void setId_prof_5(String Id_prof_5) {
        this.Id_prof_5 = Id_prof_5;
    }

    public Date getMois_de_debut_dexercice() {
        return Mois_de_debut_dexercice;
    }

    public void setMois_de_debut_dexercice(Date Mois_de_debut_dexercice) {
        this.Mois_de_debut_dexercice = Mois_de_debut_dexercice;
    }

    public int getTVA() {
        return TVA;
    }

    public void setTVA(int TVA) {
        this.TVA = TVA;
    }

    public societe(int id, String Nom_Enseigne_Raison_sociale, String Adresse, String Code_postal, String Ville, String Pays, String Departement_Canton, String Devise_principale, String Téléphone, String Fax, String Email, String Web, String Logo, String Note, String directeur, Float Capital, int Id_prof_1, int Id_prof_2, int Id_prof_3, int Id_prof_4, String Id_prof_5, Date Mois_de_debut_dexercice, int TVA) {
        this.id = id;
        this.Nom_Enseigne_Raison_sociale = Nom_Enseigne_Raison_sociale;
        this.Adresse = Adresse;
        this.Code_postal = Code_postal;
        this.Ville = Ville;
        this.Pays = Pays;
        this.Departement_Canton = Departement_Canton;
        this.Devise_principale = Devise_principale;
        this.Téléphone = Téléphone;
        this.Fax = Fax;
        this.Email = Email;
        this.Web = Web;
        this.Logo = Logo;
        this.Note = Note;
        this.directeur = directeur;
        this.Capital = Capital;
        this.Id_prof_1 = Id_prof_1;
        this.Id_prof_2 = Id_prof_2;
        this.Id_prof_3 = Id_prof_3;
        this.Id_prof_4 = Id_prof_4;
        this.Id_prof_5 = Id_prof_5;
        this.Mois_de_debut_dexercice = Mois_de_debut_dexercice;
        this.TVA = TVA;
    }
    
}
