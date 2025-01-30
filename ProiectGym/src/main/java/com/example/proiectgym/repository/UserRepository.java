package com.example.proiectgym.repository;

import com.example.proiectgym.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNumarCardAbonament(String numarCardAbonament);
}
