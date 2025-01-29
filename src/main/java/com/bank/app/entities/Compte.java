package com.bank.app.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "COMPTE")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String numCompte;
    private double solde;
    private String typeCompte;
    private Date dateOuverture;

    public Compte() {
    }

    public Compte(String numCompte, double solde, String typeCompte, Date dateOuverture) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.typeCompte = typeCompte;
        this.dateOuverture = dateOuverture;
    }
    
    public String getNumCompte() {
        return this.numCompte;
    }
    
    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }
    
    public double getSolde() {
        return this.solde;
    }
    
    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public String getTypeCompte() {
        return this.typeCompte;
    }
    
    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }
    
    public Date getDateOuverture() {
        return this.dateOuverture;
    }
    
    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
}

