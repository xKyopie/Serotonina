package com.serotonina.serotoninaback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    String meta;
    boolean urgencia;
      /* Configuração de relacionamentos com o JPA */
    // Referenciando na classe Tarefa pelo campo "tarefas"
    @ManyToOne
    //@JsonBackReference
    private Tarefa tarefa;

    public Categoria(){

    }

    public Categoria(Long id, boolean urgencia, String meta, Tarefa tarefa, Conteudo conteudo) {
        this.id = id;
        this.urgencia = urgencia;
        this.meta = meta;
        this.tarefa = tarefa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    
}