package com.example.proiectgym.service;

import com.example.proiectgym.model.User;
import com.example.proiectgym.repository.UserRepository;
import com.example.proiectgym.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    // Metoda pentru a găsi un utilizator după ID
    public User findUserById(Long id) {
        logger.info("Căutăm utilizatorul cu ID: {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Utilizatorul cu ID {} nu a fost găsit", id);
                    return new ResourceNotFoundException("User not found");
                });
        logger.info("Utilizatorul a fost găsit: {}", user.getName());
        return user;
    }

    // Metoda pentru a crea un utilizator
    public User createUser(User user) {
        logger.info("Creăm utilizatorul cu numele: {}", user.getName());
        User savedUser = userRepository.save(user);
        logger.info("Utilizatorul a fost creat cu ID: {}", savedUser.getId());
        return savedUser;
    }

    // Metoda pentru a actualiza un utilizator
    public User updateUser(Long id, User userDetails) {
        logger.info("Actualizăm utilizatorul cu ID: {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Utilizatorul cu ID {} nu a fost găsit pentru actualizare", id);
                    return new ResourceNotFoundException("User not found");
                });
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        // alte câmpuri de actualizat
        User updatedUser = userRepository.save(user);
        logger.info("Utilizatorul cu ID {} a fost actualizat", updatedUser.getId());
        return updatedUser;
    }

    // Metoda pentru a șterge un utilizator
    public void deleteUser(Long id) {
        logger.info("Ștergem utilizatorul cu ID: {}", id);
        User user = userRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Utilizatorul cu ID {} nu a fost găsit pentru ștergere", id);
                    return new ResourceNotFoundException("User not found");
                });
        userRepository.delete(user);
        logger.info("Utilizatorul cu ID {} a fost șters", id);
    }
}
