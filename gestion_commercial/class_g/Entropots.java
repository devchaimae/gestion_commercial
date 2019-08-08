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
public class Entropots {
    private String Nom;
    private Date created_at;
    private Date updated_at;

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
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

    public Entropots(String Nom, Date created_at, Date updated_at) {
        this.Nom = Nom;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
