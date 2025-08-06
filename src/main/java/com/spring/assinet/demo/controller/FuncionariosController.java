package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.Funcionarios;
import com.spring.assinet.demo.services.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionariosController {

    @Autowired
    private FuncionariosService funcionariosService;

    @GetMapping
    public List<Funcionarios> listarTodos() {
        return funcionariosService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionarios> buscarPorId(@PathVariable Long id){
        return funcionariosService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Funcionarios salvar(@RequestBody Funcionarios funcionarios) {
        return funcionariosService.salvar(funcionarios);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionarios> atualizar(@PathVariable Long id, @RequestBody Funcionarios funcionarios){
        return funcionariosService.buscarPorId(id)
                .map(funcionariosExistence ->{
                    funcionariosExistence.setNome_completo(funcionarios.getNome_completo());
                    funcionariosExistence.setCpf(funcionarios.getCpf());
                    funcionariosExistence.setData_nascimento(funcionarios.getData_nascimento());
                    funcionariosExistence.setCargo(funcionarios.getCargo());


                    Funcionarios atualizado = funcionariosService.salvar(funcionariosExistence);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        funcionariosService.buscarPorId(id).ifPresent(funcionario -> funcionariosService.deletar(id));
        return ResponseEntity.noContent().build();
    }
}
