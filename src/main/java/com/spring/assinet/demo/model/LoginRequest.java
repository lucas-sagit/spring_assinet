package com.spring.assinet.demo.model;

public class LoginRequest {
    private String nomeCompleto;
    private String password;

    // Getters e Setters
    public String getnomeCompleto() {
        return nomeCompleto;
    }

    public void setnomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
