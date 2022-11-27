package com.serotonina.serotoninaback.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public int resposta;
    public String nomeUsuario;
    public String email;
    public String senha;

    public Usuario() {

    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cadastroUsuario")
    // @JsonManagedReference
    public CadastroUsuario cadastroUsuario;

    //@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_usuario")
    //@JsonManagedReference
    private List<Tarefa> tarefas;

    public Usuario(Long id, int resposta, String nomeUsuario, String email, String senha,
            CadastroUsuario cadastroUsuario, List<Tarefa> tarefas) {
        this.id = id;
        this.resposta = resposta;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.cadastroUsuario = cadastroUsuario;
        this.tarefas = tarefas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CadastroUsuario getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
