package com.example.proiectgym.controller;

import com.example.proiectgym.model.Abonament;
import com.example.proiectgym.service.AbonamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonamente")
public class AbonamentController {

    @Autowired
    private AbonamentService abonamentService;

    // Endpoint pentru a obține toate abonamentele
    @GetMapping
    public List<Abonament> getAllAbonamente() {
        return abonamentService.getAllAbonamente();
    }

    // Endpoint pentru a salva un abonament
    @PostMapping
    public Abonament createAbonament(@RequestBody Abonament abonament) {
        return abonamentService.createAbonament(abonament);
    }

    // Endpoint pentru a actualiza un abonament
    @PutMapping("/{id}")
    public Abonament updateAbonament(@PathVariable Long id, @RequestBody Abonament abonament) {
        return abonamentService.updateAbonament(id, abonament);
    }

    // Endpoint pentru a șterge un abonament
    @DeleteMapping("/{id}")
    public void deleteAbonament(@PathVariable Long id) {
        abonamentService.deleteAbonament(id);
    }

    // Endpoint pentru a găsi un abonament după tip
    @GetMapping("/tip/{tip}")
    public Abonament getAbonamentByTip(@PathVariable String tip) {
        return abonamentService.findByTip(tip);
    }
}
