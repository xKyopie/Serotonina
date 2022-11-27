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

import com.serotonina.serotoninaback.model.Tarefa;
import com.serotonina.serotoninaback.repository.TarefaRepository;

@RestController
@CrossOrigin
public class TarefaControler {
    @Autowired
    TarefaRepository tarefaRepository;

    @PostMapping("/tarefa")
    public Tarefa addTarefas(
            @RequestBody Tarefa tarefas) {
        return tarefaRepository.save(tarefas);
    }

    @GetMapping("/tarefa")
    public List<Tarefa> listaTodasTarefas() {
        return (List<Tarefa>) tarefaRepository.findAll();
    }

    @GetMapping("/tarefa/{id}")
    public Optional<Tarefa> RecuperarTarefaPeloId(@PathVariable("id") Long id) {
        return tarefaRepository.findById(id);
    }

    @DeleteMapping("/tarefa/{id}")
    public void deletarTarefa(@PathVariable("id") Long id) {
        tarefaRepository.deleteById(id);
    }

}