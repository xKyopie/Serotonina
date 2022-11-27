
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

import com.serotonina.serotoninaback.model.Usuario;
import com.serotonina.serotoninaback.repository.UsuarioRepository;

@RestController
@CrossOrigin
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/usuario")
    public Usuario addUsuario(
            @RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/usuario")
    public List<Usuario> listaTodosUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> RecuperarUsuarioPeloId(@PathVariable("id") Long id) {
        return usuarioRepository.findById(id);
    }

    @DeleteMapping("/usuario/{id}")
    public void deletarUsuario(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }

}
