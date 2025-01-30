package com.example.proiectgym.service;

import com.example.proiectgym.model.Acces;
import com.example.proiectgym.repository.AccesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccesService {

    private final AccesRepository accesRepository;

    @Autowired
    public AccesService(AccesRepository accesRepository) {
        this.accesRepository = accesRepository;
    }

    // Obține accesul pentru un anumit abonament
    public Optional<Acces> getAccesById(Long id) {
        return accesRepository.findById(id);
    }

    // Crează sau actualizează accesul pentru un abonament
    public Acces saveAcces(Acces acces) {
        return accesRepository.save(acces);
    }

    // Șterge accesul pentru un abonament
    public void deleteAcces(Long id) {
        accesRepository.deleteById(id);
    }
}
