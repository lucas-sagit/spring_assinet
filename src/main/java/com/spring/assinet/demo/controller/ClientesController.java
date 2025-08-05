package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.Clientes;
import com.spring.assinet.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Clientes> listarTodods() {
        return clienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Clientes salvar(@RequestBody Clientes clientes) {
        return clienteService.salvar(clientes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> atualizar(@PathVariable Long id, @RequestBody Clientes clientes){
        return clienteService.buscarPorId(id)
                .map(clienteExistence ->{
                    clienteExistence.setNome_completo(clientes.getNome_completo());
                    clienteExistence.setCpf(clientes.getCpf());
                    clienteExistence.setData_nascimento(clientes.getData_nascimento());

                    Clientes atualizado = clienteService.salvar(clienteExistence);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar (@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
