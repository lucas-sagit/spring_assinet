package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Servicos;
import com.spring.assinet.demo.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServicosService {

    @Autowired
    private ServicosRepository servicosRepository;

    public Servicos salvar(Servicos servicos) {
        return servicosRepository.save(servicos);
    }

    public List<Servicos> listarTodos() {
        return servicosRepository.findAll();
    }

    public void deletar(Long id) {
        servicosRepository.deleteById(id);
    }

    public Optional<Servicos> buscarPorId(Long id) {
        return servicosRepository.findById(id);
    }
}

