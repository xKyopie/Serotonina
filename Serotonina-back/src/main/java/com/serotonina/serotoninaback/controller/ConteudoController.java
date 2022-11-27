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

import com.serotonina.serotoninaback.model.Conteudo;
import com.serotonina.serotoninaback.repository.ConteudoRepository;

@RestController
@CrossOrigin
public class ConteudoController {
    @Autowired
    ConteudoRepository conteudoRepository;

    @PostMapping("/conteudo")
    public Conteudo addConteudo(
            @RequestBody Conteudo conteudo) {
        return conteudoRepository.save(conteudo);
    }

    @GetMapping("/conteudo")
    public List<Conteudo> listaTodosConteudos() {
        return (List<Conteudo>) conteudoRepository.findAll();
    }

    @GetMapping("/conteudo/{id}")
    public Optional<Conteudo> RecuperarConteudoPeloId(@PathVariable("id") Long id) {
        return conteudoRepository.findById(id);
    }

    @DeleteMapping("/conteudo/{id}")
    public void deletarConteudo(@PathVariable("id") Long id) {
        conteudoRepository.deleteById(id);
    }

}