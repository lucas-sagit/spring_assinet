package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.Pagamentos;
import com.spring.assinet.demo.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")

public class PagamentosController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping
    public List<Pagamentos> listarTodos() {
        return pagamentoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamentos> buscarPorId(@PathVariable Long id){
        return pagamentoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pagamentos salvar(@RequestBody Pagamentos pagamentos){
        return pagamentoService.salvar(pagamentos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pagamentos> atualizar(@PathVariable Long id, @RequestBody Pagamentos pagamentos){
        return pagamentoService.buscarPorId(id)
                .map(pagamentosExistence ->{
                    pagamentosExistence.setDescricao(pagamentos.getDescricao());
                    pagamentosExistence.setData_pagamento(pagamentos.getData_pagamento());
                    pagamentosExistence.setValor(pagamentos.getValor());
                    Pagamentos atualizado = pagamentoService.salvar(pagamentosExistence);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deletar(@PathVariable Long id){
        pagamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
