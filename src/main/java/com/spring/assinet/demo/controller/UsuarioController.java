package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.Usuario;
import com.spring.assinet.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listartodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id){
        return usuarioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.buscarPorId(id)
                .map(usuarioExistence ->{
                    usuarioExistence.setNome(usuario.getNome());
                    usuarioExistence.setEmail(usuario.getEmail());
                    usuarioExistence.setPassword(usuario.getPassword());
                    usuarioExistence.setRole(usuario.getRole());

                    Usuario atualizado = usuarioService.salvar(usuarioExistence);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        usuarioService.buscarPorId(id).ifPresent(usuario -> usuarioService.deletar(id));
        return ResponseEntity.noContent().build();
    }
}
