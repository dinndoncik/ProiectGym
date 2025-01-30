package com.example.proiectgym.service;

import com.example.proiectgym.exception.ResourceNotFoundException;
import com.example.proiectgym.model.User;
import com.example.proiectgym.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        // Căutăm utilizatorul în baza de date
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }
}
