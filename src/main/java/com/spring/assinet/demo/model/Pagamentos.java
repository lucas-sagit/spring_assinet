package com.spring.assinet.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pagamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Number valor;
    private String status;
    private String formaPagamento;
    private LocalDate dataPagamento;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes clientes;

    public static List<Pagamentos> findAll() {
        return null;
    }

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

    public String getForma_pagamento() {
        return formaPagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.formaPagamento = forma_pagamento;
    }

    public LocalDate getData_pagamento() {
        return dataPagamento;
    }

    public void setData_pagamento(LocalDate data_pagamento) {
        this.dataPagamento = data_pagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
