package com.bank.app.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;
@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTransaction;
    private double montant;
    private Date dateTransaction;
    private String type;

    public Transaction() {
    }

    public Transaction(UUID idTransaction, double montant, Date dateTransaction, String type) {
        this.idTransaction = idTransaction;
        this.montant = montant;
        this.dateTransaction = dateTransaction;
        this.type = type;
    }

    public UUID getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(UUID idTransaction) {
        this.idTransaction = idTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
