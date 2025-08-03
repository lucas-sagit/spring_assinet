package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
class FuncionariosController {

    @Autowired
    private FuncionariosRepository funcionariosRepositorysitory;

    // CREATE
    @PostMapping
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return FuncionariosRepository.save(funcionario);
    }

    // READ (Todos)
//    @GetMapping
//    public List<Funcionario> listarTodos() {
//        List<funcionarios> all = funcionariosRepository.findAll();
//        return null;
//    }
//
//    // READ (Por ID)
//    @GetMapping("/{id}")
//    public Optional<Funcionario> buscarPorId(@PathVariable Long id) {
//        return funcionariosRepository.findById(id);
//    }

    // UPDATE
//    @PutMapping("/{id}")
//    public Funcionario atualizar(@PathVariable Long id, @RequestBody Funcionario funcionarioAtualizado) {
//        return repository.findById(id).map(funcionario -> {
//            funcionario.setNome(funcionarioAtualizado.getNome());
//            funcionario.setCargo(funcionarioAtualizado.getCargo());
//            funcionario.setSalario(funcionarioAtualizado.getSalario());
//            return repository.save(funcionario);
//        }).orElseThrow(() -> new RuntimeException("Funcionário não encontrado com ID: " + id));
//    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        funcionariosRepositorysitory.deleteById(id);
    }
}
