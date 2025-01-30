package com.example.proiectgym.service;

import com.example.proiectgym.model.Abonament;
import com.example.proiectgym.repository.AbonamentRepository;
import com.example.proiectgym.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonamentService {

    private static final Logger logger = LoggerFactory.getLogger(AbonamentService.class);

    @Autowired
    private AbonamentRepository abonamentRepository;

    // Metoda pentru a găsi un abonament după ID
    public Abonament getAbonamentById(Long id) {
        logger.info("Căutăm abonamentul cu ID: {}", id);
        Abonament abonament = abonamentRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Abonamentul cu ID {} nu a fost găsit", id);
                    return new ResourceNotFoundException("Abonament not found");
                });
        logger.info("Abonamentul cu ID {} a fost găsit", abonament.getId());
        return abonament;
    }

    // Metoda pentru a crea un abonament
    public Abonament createAbonament(Abonament abonament) {
        logger.info("Creăm un nou abonament de tip: {}", abonament.getTip());
        Abonament savedAbonament = abonamentRepository.save(abonament);
        logger.info("Abonamentul a fost creat cu ID: {}", savedAbonament.getId());
        return savedAbonament;
    }

    // Metoda pentru a actualiza un abonament
    public Abonament updateAbonament(Long id, Abonament abonamentDetails) {
        logger.info("Actualizăm abonamentul cu ID: {}", id);
        Abonament abonament = abonamentRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Abonamentul cu ID {} nu a fost găsit pentru actualizare", id);
                    return new ResourceNotFoundException("Abonament not found");
                });
        abonament.setTip(abonamentDetails.getTip());
        abonament.setPret(abonamentDetails.getPret());
        // alte câmpuri de actualizat
        Abonament updatedAbonament = abonamentRepository.save(abonament);
        logger.info("Abonamentul cu ID {} a fost actualizat", updatedAbonament.getId());

    });