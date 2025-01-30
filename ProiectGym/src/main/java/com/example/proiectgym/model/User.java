package com.example.proiectgym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume; // Numele utilizatorului
    private String email; // Email-ul utilizatorului
    private String numarCardAbonament; // Cardul de abonament al utilizatorului
    private Long abonamentId; // ID-ul abonamentului asociat

    // Constructori
    public User() {}

    public User(String nume, String email, String numarCardAbonament, Long abonamentId) {
        this.nume = nume;
        this.email = email;
        this.numarCardAbonament = numarCardAbonament;
        this.abonamentId = abonamentId;
    }

    // Getters și Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumarCardAbonament() {
        return numarCardAbonament;
    }

    public void setNumarCardAbonament(String numarCardAbonament) {
        this.numarCardAbonament = numarCardAbonament;
    }

    public Long getAbonamentId() {
        return abonamentId;
    }

    public void setAbonamentId(Long abonamentId) {
        this.abonamentId = abonamentId;
    }
}
