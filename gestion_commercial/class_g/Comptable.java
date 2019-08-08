/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_commercial.class_g;

import java.util.Date;

/**
 *
 * @author Home
 */
public class Comptable {
    private String Nom_Enseigne_Raisonsociale;
    private String Adresse;
    private int	Codepostal ;
    private String Departement_Canton;
    private String Telephone;
    private String Fax;
    private String Mail;
    private String  Web;
    private int Numérofichier;
    private String 	Pays;
    private String Note;
   private Date created_at;
   private Date updated_at;

    public Comptable(String Nom_Enseigne_Raisonsociale, String Adresse, int Codepostal, String Departement_Canton, String Telephone, String Fax, String Mail, String Web, int Numérofichier, String Pays, String Note, Date created_at, Date updated_at) {
        this.Nom_Enseigne_Raisonsociale = Nom_Enseigne_Raisonsociale;
        this.Adresse = Adresse;
        this.Codepostal = Codepostal;
        this.Departement_Canton = Departement_Canton;
        this.Telephone = Telephone;
        this.Fax = Fax;
        this.Mail = Mail;
        this.Web = Web;
        this.Numérofichier = Numérofichier;
        this.Pays = Pays;
        this.Note = Note;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getNom_Enseigne_Raisonsociale() {
        return Nom_Enseigne_Raisonsociale;
    }

    public void setNom_Enseigne_Raisonsociale(String Nom_Enseigne_Raisonsociale) {
        this.Nom_Enseigne_Raisonsociale = Nom_Enseigne_Raisonsociale;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public int getCodepostal() {
        return Codepostal;
    }

    public void setCodepostal(int Codepostal) {
        this.Codepostal = Codepostal;
    }

    public String getDepartement_Canton() {
        return Departement_Canton;
    }

    public void setDepartement_Canton(String Departement_Canton) {
        this.Departement_Canton = Departement_Canton;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String Web) {
        this.Web = Web;
    }

    public int getNumérofichier() {
        return Numérofichier;
    }

    public void setNumérofichier(int Numérofichier) {
        this.Numérofichier = Numérofichier;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
