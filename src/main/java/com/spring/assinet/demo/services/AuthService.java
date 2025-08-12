package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Funcionarios;
import com.spring.assinet.demo.model.Usuario;
import com.spring.assinet.demo.repository.FuncionariosRepository;
import com.spring.assinet.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
//
//    @Autowired
//    private FuncionariosRepository funcionariosRepository;
//
//    public Funcionarios autenticar(String nomeCompleto, String password) {
//        Optional<Funcionarios> funcionario = funcionariosRepository.findBynomeCompleto(nomeCompleto);
//        if (funcionario.isPresent() && funcionario.get().getPassword().equals(password)) {
//            return funcionario.get();
//        }
//        throw new RuntimeException("Credenciais inválidas");
//    }


    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticar(String nomeCompleto, String password) {
        Optional<Usuario> usuario = usuarioRepository.findBynomeCompleto(nomeCompleto);
        if (usuario.isPresent() && usuario.get().getPassword().equals(password)) {
            return usuario.get();
        }
        throw new RuntimeException("Credenciais inválidas");
    }
}
