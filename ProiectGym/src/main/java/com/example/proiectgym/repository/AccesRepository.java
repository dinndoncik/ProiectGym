package com.example.proiectgym.repository;

import com.example.proiectgym.model.Acces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesRepository extends JpaRepository<Acces, Long> {
    // Aici poți adăuga metode suplimentare, dacă este necesar
}
