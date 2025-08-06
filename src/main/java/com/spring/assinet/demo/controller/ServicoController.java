package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.Servicos;
import com.spring.assinet.demo.services.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicosService servicoService;

    @GetMapping
    public List<Servicos> listarTodos() {
        return servicoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servicos> bucarPorId(@PathVariable Long id){
        return servicoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Servicos salvar(@RequestBody Servicos servico){
        Servicos salvo = servicoService.salvar(servico);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo).getBody();
    }
//@PostMapping
//public Servicos salvar(@RequestBody Servicos servico) {
//    return servicoService.salvar(servico);
//}
    @PutMapping("/{id}")
    public ResponseEntity<Servicos> atualizar(@PathVariable Long id, @RequestBody Servicos servicos){
        return servicoService.buscarPorId(id)
                .map(servicosExistence ->{
                    servicosExistence.setDescricao(servicos.getDescricao());
                    servicosExistence.setDataPagamento(servicos.getDataPagamento());
                    servicosExistence.setPlanos(servicos.getPlanos());
                    servicosExistence.setValor(servicos.getValor());
                    Servicos atualizado = servicoService.salvar(servicosExistence);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        servicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
