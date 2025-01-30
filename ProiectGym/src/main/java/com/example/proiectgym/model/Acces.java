package com.example.proiectgym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Acces {

    @Id
    private Long id;
    private boolean areAccesLaBazin;
    private boolean areAccesLaMasaj;
    private boolean areAccesLaDans;
    private boolean areAccesLaPilates;

    // Constructori
    public Acces() {}

    public Acces(boolean areAccesLaBazin, boolean areAccesLaMasaj, boolean areAccesLaDans, boolean areAccesLaPilates) {
        this.areAccesLaBazin = areAccesLaBazin;
        this.areAccesLaMasaj = areAccesLaMasaj;
        this.areAccesLaDans = areAccesLaDans;
        this.areAccesLaPilates = areAccesLaPilates;
    }

    // Getters și Setters
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
