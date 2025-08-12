package com.spring.assinet.demo.controller;

import com.spring.assinet.demo.model.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // <-- o correto!
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.html no diretório templates
    }

    @PostMapping("/login")
    public String processLogin(@RequestBody LoginRequest loginRequest, Model model) {
        String nomeCompleto = loginRequest.getnomeCompleto();
        String password = loginRequest.getpassword();

        if ("user".equals(nomeCompleto) && "password".equals(password)) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Usuário ou senha inválidos");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login?logout"; // redireciona para tela de login
    }
}
