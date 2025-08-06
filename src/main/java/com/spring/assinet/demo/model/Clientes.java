package com.spring.assinet.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String telefone;
    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private int cep;
    private boolean status;
    private String pagamento;

    @OneToMany(mappedBy = "clientes")
    private List<Pagamentos> pagamentos;

    @OneToMany(mappedBy = "clientes")
    private List<Servicos> servicos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_completo() {
        return nomeCompleto;
    }

    public void setNome_completo(String nome_completo) {
        this.nomeCompleto = nome_completo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
