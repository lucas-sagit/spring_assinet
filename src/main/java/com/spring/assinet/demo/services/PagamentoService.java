package com.spring.assinet.demo.services;

import com.spring.assinet.demo.model.Pagamentos;
import com.spring.assinet.demo.repository.PagamentosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    private PagamentosRepository pagamentosRepository;

    public Pagamentos salvar(Pagamentos pagamentos) {
        return (Pagamentos) pagamentosRepository.save(pagamentosRepository);
    }

    public List<Pagamentos> listarTodos() {
        return Pagamentos.findAll();
    }

    public void deletar(Long id) {
        pagamentosRepository.deleteById(id);
    }

    public Optional<Pagamentos> buscarPorId(Long id){
        return pagamentosRepository.findById(id);
    }
}
