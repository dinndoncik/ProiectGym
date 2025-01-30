package com.example.proiectgym.dto;

public class UserDTO {

    private Long id;            // ID-ul utilizatorului
    private String nume;        // Numele utilizatorului
    private String email;       // Adresa de email
    private String tipAbonament; // Tipul de abonament ("Standard", "Pro", "Premium")
    private double pretAbonament; // Prețul abonamentului

    // Constructori
    public UserDTO() {}

    public UserDTO(Long id, String nume, String email, String tipAbonament, double pretAbonament) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.tipAbonament = tipAbonament;
        this.pretAbonament = pretAbonament;
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

    public String getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public double getPretAbonament() {
        return pretAbonament;
    }

    public void setPretAbonament(double pretAbonament) {
        this.pretAbonament = pretAbonament;
    }
}
