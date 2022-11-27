package com.serotonina.serotoninaback.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.serotonina.serotoninaback.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    List<Usuario> findByNomeUsuario(String nome);
}
