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
public class client {
   int id;
   String num_compte;
   String nom;
  String Forme_juridique;
 String rp;
  String adr;
   String ville;
    String region;
    String pays;
 int numero_serie;
   int naf;
 int num_identifiant;
 String email;
 String site_web;
  int groupe;
 int categorie;
  String portable;
 String fax;
 int siret;
 String compte_collectif;
 int qte;

    public client( String num_compte, String nom, String Forme_juridique, String rp, String adr, String ville, String region, String pays, int numero_serie, int naf, int num_identifiant, String email, String site_web, int groupe, int categorie, String portable, String fax, int siret,String compte_collectif,int qte) {
        
        this.num_compte = num_compte;
        this.nom = nom;
        this.Forme_juridique = Forme_juridique;
        this.rp = rp;
        this.adr = adr;
        this.ville = ville;
        this.region = region;
        this.pays = pays;
        this.numero_serie = numero_serie;
        this.naf = naf;
        this.num_identifiant = num_identifiant;
        this.email = email;
        this.site_web = site_web;
        this.groupe = groupe;
        this.categorie = categorie;
        this.portable = portable;
        this.fax = fax;
        this.siret = siret;
        this.compte_collectif=compte_collectif;
        this.qte=qte;
    }

    public String getCompte_collectif() {
        return compte_collectif;
    }

    public void setCompte_collectif(String compte_collectif) {
        this.compte_collectif = compte_collectif;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getForme_juridique() {
        return Forme_juridique;
    }

    public void setForme_juridique(String Forme_juridique) {
        this.Forme_juridique = Forme_juridique;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite_web() {
        return site_web;
    }

    public void setSite_web(String site_web) {
        this.site_web = site_web;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public int getCategorie() {
        return categorie;
    }

    public void setCategorie(int categorie) {
        this.categorie = categorie;
    }

    public String getPortable() {
        return portable;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getSiret() {
        return siret;
    }

    public void setSiret(int siret) {
        this.siret = siret;
    }
 
}
 