package com.example.proiectgym.repository;

import com.example.proiectgym.model.Abonament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonamentRepository extends JpaRepository<Abonament, Long> {
    // Adăugăm metode personalizate dacă este necesar, de exemplu:
    Abonament findByTip(String tip);
}
