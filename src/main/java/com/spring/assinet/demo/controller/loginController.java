package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.Funcionarios;
import com.spring.assinet.demo.model.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.spring.assinet.demo.services.AuthService;

@RestController
@RequestMapping("/login")
class LoginController {

    private final AuthService authService;

    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        Funcionarios funcionario = authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());

        if (funcionario != null) {
            return ResponseEntity.ok(funcionario);
        } else {
            return ResponseEntity.status(401).body("Credenciais inválidas ou funcionário inativo.");
        }
    }
}
