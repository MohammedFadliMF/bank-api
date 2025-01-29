package com.bank.app.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Pret")
public class Pret {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPret;
    private String montantPret;
    private double tauxInteret;
    private Date dateDebut;
    private Date dateFin;

    public Pret() {
    }

    public Pret(UUID idPret, String montantPret, double tauxInteret, Date dateDebut, Date dateFin) {
        this.idPret = idPret;
        this.montantPret = montantPret;
        this.tauxInteret = tauxInteret;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public UUID getIdPret() {
        return idPret;
    }

    public void setIdPret(UUID idPret) {
        this.idPret = idPret;
    }

    public String getMontantPret() {
        return montantPret;
    }

    public void setMontantPret(String montantPret) {
        this.montantPret = montantPret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
