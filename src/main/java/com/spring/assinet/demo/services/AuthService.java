package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Funcionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import repository.UsuarioRepository; fazendo teste com funcionario
import com.spring.assinet.demo.repository.FuncionariosRepository;

@Service
public class AuthService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    public Funcionarios authenticate(String username, String password) {
        Funcionarios funcionario = funcionariosRepository.findByUsername(username);
        if (funcionario != null && funcionario.getPassword().equals(password) && Boolean.TRUE.equals(funcionario.getStatus())) {
            return funcionario;
        }
        return null;
    }
}
