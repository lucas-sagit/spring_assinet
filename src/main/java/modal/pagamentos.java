package modal;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class pagamentos {

    @Id

    private String id;
    private Number valor;
    private String status;
    private String forma_pagamento;
    private String pagamento_cliente;
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getPagamento_cliente() {
        return pagamento_cliente;
    }

    public void setPagamento_cliente(String pagamento_cliente) {
        this.pagamento_cliente = pagamento_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
