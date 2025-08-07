package com.spring.assinet.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")

public class Login {

    @Id
    @Column(name = "usuario")

    private String nomeCompleto;
    private String password;

    public String getnomeCompleto() {
        return nomeCompleto;
    }

    public void setUsuario(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getpassword() {
        return password;
    }

    public void setSenha(String password) {
        this.password = password;
    }
}

