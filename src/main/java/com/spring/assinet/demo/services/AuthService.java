package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Funcionarios;
import com.spring.assinet.demo.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    public Funcionarios autenticar(String Email, String Password) {
        Optional<Funcionarios> funcionario = funcionariosRepository.findByUsuario_Email(Email);
        if (funcionario.isPresent() && funcionario.get().getPassword().equals(Password)) {
            return funcionario.orElse(null);
        }
        throw new RuntimeException("Credenciais inválidas");
    }
}
