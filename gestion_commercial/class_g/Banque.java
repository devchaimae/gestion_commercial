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
public class Banque {
    
    private int Code;
    private int Banque;
    private int Compte;
    private Date created_at;
    private Date updated_at;

    public Banque(int Code, int Banque, int Compte, Date created_at, Date updated_at) {
        this.Code = Code;
        this.Banque = Banque;
        this.Compte = Compte;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public int getBanque() {
        return Banque;
    }

    public void setBanque(int Banque) {
        this.Banque = Banque;
    }

    public int getCompte() {
        return Compte;
    }

    public void setCompte(int Compte) {
        this.Compte = Compte;
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
