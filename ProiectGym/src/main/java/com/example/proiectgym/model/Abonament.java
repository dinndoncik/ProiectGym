package com.example.proiectgym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abonament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tip;  // Tipul abonamentului: "Standard", "Pro", "Premium"
    private double pret; // Prețul abonamentului
    private boolean areAccesLaBazin; // Indică dacă abonamentul include acces la bazin
    private boolean areAccesLaMasaj; // Indică dacă abonamentul include acces la masaj
    private boolean areAccesLaDans; // Indică dacă abonamentul include acces la dans
    private boolean areAccesLaPilates; // Indică dacă abonamentul include acces la pilates

    // Constructori, Getters și Setters

    public Abonament() {}

    public Abonament(String tip, double pret, boolean areAccesLaBazin, boolean areAccesLaMasaj, boolean areAccesLaDans, boolean areAccesLaPilates) {
        this.tip = tip;
        this.pret = pret;
        this.areAccesLaBazin = areAccesLaBazin;
        this.areAccesLaMasaj = areAccesLaMasaj;
        this.areAccesLaDans = areAccesLaDans;
        this.areAccesLaPilates = areAccesLaPilates;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public boolean isAreAccesLaBazin() {
        return areAccesLaBazin;
    }

    public void setAreAccesLaBazin(boolean areAccesLaBazin) {
        this.areAccesLaBazin = areAccesLaBazin;
    }

    public boolean isAreAccesLaMasaj() {
        return areAccesLaMasaj;
    }

    public void setAreAccesLaMasaj(boolean areAccesLaMasaj) {
        this.areAccesLaMasaj = areAccesLaMasaj;
    }

    public boolean isAreAccesLaDans() {
        return areAccesLaDans;
    }

    public void setAreAccesLaDans(boolean areAccesLaDans) {
        this.areAccesLaDans = areAccesLaDans;
    }

    public boolean isAreAccesLaPilates() {
        return areAccesLaPilates;
    }

    public void setAreAccesLaPilates(boolean areAccesLaPilates) {
        this.areAccesLaPilates = areAccesLaPilates;
    }
}
