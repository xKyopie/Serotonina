package com.serotonina.serotoninaback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.serotonina.serotoninaback.model.Rotina;
import com.serotonina.serotoninaback.repository.RotinaRepository;

@RestController
@CrossOrigin
public class RotinaController {
    @Autowired
    RotinaRepository rotinaRepository;

    @PostMapping("/rotina")
    public Rotina addRotina(
            @RequestBody Rotina rotina) {
        return rotinaRepository.save(rotina);
    }

    @GetMapping("/rotina")
    public List<Rotina> listaTodosUsuarios() {
        return (List<Rotina>) rotinaRepository.findAll();
    }

    @GetMapping("/rotina/{id}")
    public Optional<Rotina> RecuperarRotinaPeloId(@PathVariable("id") Long id) {
        return rotinaRepository.findById(id);
    }

    @DeleteMapping("/rotina/{id}")
    public void deletarRotina(@PathVariable("id") Long id) {
        rotinaRepository.deleteById(id);
    }

}
