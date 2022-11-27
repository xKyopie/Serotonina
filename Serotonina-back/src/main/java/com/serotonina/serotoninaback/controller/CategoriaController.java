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

import com.serotonina.serotoninaback.model.Categoria;
import com.serotonina.serotoninaback.repository.CategoriaRepository;

@RestController
@CrossOrigin
public class CategoriaController {
    @Autowired
    CategoriaRepository categoriaRepository;

    @PostMapping("/categoria")
    public Categoria addCategorias(
            @RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @GetMapping("/categoria")
    public List<Categoria> listaTodasCategorias() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @GetMapping("/categoria/{id}")
    public Optional<Categoria> RecuperarCategoriaPeloId(@PathVariable("id") Long id) {
        return categoriaRepository.findById(id);
    }

    @DeleteMapping("/categoria/{id}")
    public void deletarCategoria(@PathVariable("id") Long id) {
        categoriaRepository.deleteById(id);
    }

}
