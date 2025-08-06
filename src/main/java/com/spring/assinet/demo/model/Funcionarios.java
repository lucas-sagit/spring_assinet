package com.spring.assinet.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Funcionarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private String bairro;
    private int cep;
    private Boolean status;
    private String password;
    private String Cargo;
    private String salario;
    private String email;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getNome_completo() {
        return nomeCompleto;
    }

    public void setNome_completo(String nome_completo) {
        this.nomeCompleto = nome_completo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return dataNascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.dataNascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public boolean Status() {
        return Status();
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getStatus() {
        return null;
    }

    @Override
    public String toString() {
        return "Funcionario{id=" + id + ", nome='" + nomeCompleto + "', cargo='"  + "', salario=" + salario + '}';
    }
}

