package com.bank.app.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "CarteBancaire")
public class CarteBancaire {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String numCarte;
    private Date dateExpiration;
    private String codeSecurity;

}