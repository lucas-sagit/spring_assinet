package com.spring.assinet.demo.services;

import com.spring.assinet.demo.controller.FuncionariosController;
import com.spring.assinet.demo.model.Funcionarios;
import com.spring.assinet.demo.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    public Funcionarios salvar(Funcionarios funcionarios) {
        return FuncionariosRepository.save(funcionarios);
    }

    public List<Funcionarios> listarTodos(){
        return funcionariosRepository.findAll();
    }

    public Optional<Funcionarios> buscarPorId(Long id){
       return funcionariosRepository.findById(id);
    }

    public void deletar(long id) {
        funcionariosRepository.deleteById(id);
    }
}