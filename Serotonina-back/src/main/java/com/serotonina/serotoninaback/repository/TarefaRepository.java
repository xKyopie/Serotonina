package com.serotonina.serotoninaback.repository;

import org.springframework.data.repository.CrudRepository;

import com.serotonina.serotoninaback.model.Tarefa;

public interface TarefaRepository extends CrudRepository<Tarefa, Long> {
    
}