package com.spring.assinet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // <-- o correto!
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.html no diretório templates
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String nomeCompleto,
                               @RequestParam String password,
                               Model model) {

        // Simulação de autenticação (substitua por consulta ao banco se necessário)
        if ("user".equals(nomeCompleto) && "password".equals(password)) {
            return "redirect:/dashboard"; // sucesso
        } else {
            model.addAttribute("error", "Usuário ou senha inválidos");
            return "login"; // volta para o login.html com erro
        }
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login?logout"; // redireciona para tela de login
    }
}
