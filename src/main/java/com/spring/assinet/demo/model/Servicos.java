package com.spring.assinet.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Number valor;
    private String status;
    private String formaPagamento;
    private LocalDate dataPagamento;
    private String descricao;
    private String planos;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes clientes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getValor() {
        return valor;
    }

    public void setValor(Number valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setForma_pagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate data_pagamento) {
        this.dataPagamento = data_pagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlanos() {
        return planos;
    }

    public void setPlanos(String planos) {
        this.planos = planos;
    }
}
