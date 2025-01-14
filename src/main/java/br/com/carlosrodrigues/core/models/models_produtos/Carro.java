package br.com.carlosrodrigues.core.models.models_produtos;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class Carro {

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "ano_fabricacao", nullable = false)
    private BigDecimal anoFabricacao;

    @Column(name = "cor", nullable = false)
    private String cor;

    @Column(name = "quilometragem", nullable = false)
    private BigDecimal quilometragem;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(BigDecimal anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(BigDecimal quilometragem) {
        this.quilometragem = quilometragem;
    }
}
