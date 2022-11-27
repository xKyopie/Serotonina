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

import com.serotonina.serotoninaback.model.CadastroUsuario;
import com.serotonina.serotoninaback.repository.CadastroUsuarioRepository;

@RestController
@CrossOrigin
public class CadastroUsuarioController {
    @Autowired
    CadastroUsuarioRepository cadastroUsuarioRepository;

    @PostMapping("/cadastroUsuario")
    public CadastroUsuario addCadastroUsuario(
            @RequestBody CadastroUsuario cadastroUsuario) {
        return cadastroUsuarioRepository.save(cadastroUsuario);
    }

    @GetMapping("/cadastroUsuario")
    public List<CadastroUsuario> listaTodasCadastrados() {
        return (List<CadastroUsuario>) cadastroUsuarioRepository.findAll();
    }

    @GetMapping("/cadastroUsuario/{id}")
    public Optional<CadastroUsuario> RecuperarCadastradosPeloId(@PathVariable("id") Long id) {
        return cadastroUsuarioRepository.findById(id);
    }

    @DeleteMapping("/cadastroUsuario/{id}")
    public void deletarCadastrado(@PathVariable("id") Long id) {
        cadastroUsuarioRepository.deleteById(id);
    }
}