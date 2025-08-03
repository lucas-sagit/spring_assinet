package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Usuario;
import com.spring.assinet.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listartodos(){
        return usuarioRepository.findAll();
    }

    public void deletar(Long id){
        usuarioRepository.deleteById(id);
    }

    public Optional<Usuario> buscarPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public Optional<Usuario> BuscarPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }
}
