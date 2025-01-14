package br.com.carlosrodrigues.web.dto.dto_produtos;


import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class CarroForm {

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String marca;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String modelo;

    @PositiveOrZero
    @NotNull(message = "O espaço deve ser preenchido")
    private BigDecimal anoFabricacao;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String cor;

    @PositiveOrZero
    @NotNull(message = "O espaço deve ser preenchido")
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
