package com.example.proiectgym.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/access")
@RequiredArgsConstructor
public class AccessController {

    private final AccessService accessService;
    private static final Logger logger = LoggerFactory.getLogger(AccessController.class);

    @GetMapping
    public ResponseEntity<String> checkAccess(@RequestParam Long userId, @RequestParam String activity) {
        logger.info("Verificare acces pentru utilizatorul {} la activitatea {}", userId, activity);

        String message = accessService.checkAccess(userId, activity);

        return ResponseEntity.ok(message);
    }
}
