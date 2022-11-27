package com.serotonina.serotoninaback.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Rotina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public double horario, data;
    public String nomeDaMeta, notificacao;
    public int resposta;

    public Rotina() {

    }

    @ManyToMany(mappedBy = "rotina")
    @JsonBackReference
    private List<Tarefa> tarefa;

    public Rotina(Long id, double horario, double data, String nomeDaMeta, String notificacao, int resposta) {
        this.id = id;
        this.horario = horario;
        this.data = data;
        this.nomeDaMeta = nomeDaMeta;
        this.notificacao = notificacao;
        this.resposta = resposta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getNomeDaMeta() {
        return nomeDaMeta;
    }

    public void setNomeDaMeta(String nomeDaMeta) {
        this.nomeDaMeta = nomeDaMeta;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public List<Tarefa> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }

}
