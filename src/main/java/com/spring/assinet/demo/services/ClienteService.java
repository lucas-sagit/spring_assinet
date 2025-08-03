package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Clientes;
import com.spring.assinet.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Clientes salvar(Clientes clientes) {
        return clienteRepository.save(clientes);
    }

    public List<Clientes> listarTodos(){
        return clienteRepository.findAll();
    }

    public Optional<Clientes> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public void deletar(long id){
        clienteRepository.deleteById(id);
    }

}
