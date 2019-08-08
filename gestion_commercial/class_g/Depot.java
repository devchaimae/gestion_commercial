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
public class Depot {
    private String intitule;
    private String adresse;
    private String complement;
    private String ville;
    private String region;
    private String pays;
    private String responsable;
    private String text;

    public Depot(String intitule, String adresse, String complement, String ville, String region, String pays, String responsable, String text) {
        this.intitule = intitule;
        this.adresse = adresse;
        this.complement = complement;
        this.ville = ville;
        this.region = region;
        this.pays = pays;
        this.responsable = responsable;
        this.text = text;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
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

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
