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
public class client {
    private int id_client;
    private String num_compte;
    private String Forme_juridique;
    private String Responsable;
    private String adresse;
    private String ville;
    private String region;
    private String pays;
    private int numero_serie;
    private int naf;
    private int num_identifiant;
    private String 	MAIL;
    private String  SITE_WEB;
    private int GROUPE;
    private int CATEGORIE;
    private int PORTABLE;
    private int  FAX;
    private int  SIRET;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }

    public String getForme_juridique() {
        return Forme_juridique;
    }

    public void setForme_juridique(String Forme_juridique) {
        this.Forme_juridique = Forme_juridique;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getNaf() {
        return naf;
    }

    public void setNaf(int naf) {
        this.naf = naf;
    }

    public int getNum_identifiant() {
        return num_identifiant;
    }

    public void setNum_identifiant(int num_identifiant) {
        this.num_identifiant = num_identifiant;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    public String getSITE_WEB() {
        return SITE_WEB;
    }

    public void setSITE_WEB(String SITE_WEB) {
        this.SITE_WEB = SITE_WEB;
    }

    public int getGROUPE() {
        return GROUPE;
    }

    public void setGROUPE(int GROUPE) {
        this.GROUPE = GROUPE;
    }

    public int getCATEGORIE() {
        return CATEGORIE;
    }

    public void setCATEGORIE(int CATEGORIE) {
        this.CATEGORIE = CATEGORIE;
    }

    public int getPORTABLE() {
        return PORTABLE;
    }

    public void setPORTABLE(int PORTABLE) {
        this.PORTABLE = PORTABLE;
    }

    public int getFAX() {
        return FAX;
    }

    public void setFAX(int FAX) {
        this.FAX = FAX;
    }

    public int getSIRET() {
        return SIRET;
    }

    public void setSIRET(int SIRET) {
        this.SIRET = SIRET;
    }

    public client(int id_client, String num_compte, String Forme_juridique, String Responsable, String adresse, String ville, String region, String pays, int numero_serie, int naf, int num_identifiant, String MAIL, String SITE_WEB, int GROUPE, int CATEGORIE, int PORTABLE, int FAX, int SIRET) {
        this.id_client = id_client;
        this.num_compte = num_compte;
        this.Forme_juridique = Forme_juridique;
        this.Responsable = Responsable;
        this.adresse = adresse;
        this.ville = ville;
        this.region = region;
        this.pays = pays;
        this.numero_serie = numero_serie;
        this.naf = naf;
        this.num_identifiant = num_identifiant;
        this.MAIL = MAIL;
        this.SITE_WEB = SITE_WEB;
        this.GROUPE = GROUPE;
        this.CATEGORIE = CATEGORIE;
        this.PORTABLE = PORTABLE;
        this.FAX = FAX;
        this.SIRET = SIRET;
    }

    
    
    
}
