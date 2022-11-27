package com.serotonina.serotoninaback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class CadastroUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    public String email;
    public String senha;

    public CadastroUsuario() {

    }

    @OneToOne(mappedBy = "cadastroUsuario")
    //@JsonBackReference
    public Usuario usuario;

    public CadastroUsuario(Long id, String email, String senha, Usuario usuario) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
