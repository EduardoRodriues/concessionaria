package br.com.carlosrodrigues.web.dto.dto_produtos;


import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class CarroForm {

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String veiculo;

    @NotNull(message = "O espaço deve ser preenchido")
    @PositiveOrZero
    @NumberFormat(style = NumberFormat.Style.CURRENCY, pattern = "#,##0.00")
    private BigDecimal preco;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String marca;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String modelo;

    @PositiveOrZero
    @NotNull(message = "O espaço deve ser preenchido")
    private Double anoFabricacao;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String cor;

    @PositiveOrZero
    @NotNull(message = "O espaço deve ser preenchido")
    private Double quilometragem;

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

    public Double getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Double anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public @NotEmpty(message = "O espaço deve ser preenchido") String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(@NotEmpty(message = "O espaço deve ser preenchido") String veiculo) {
        this.veiculo = veiculo;
    }

    public @NotNull(message = "O espaço deve ser preenchido") @PositiveOrZero BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(@NotNull(message = "O espaço deve ser preenchido") @PositiveOrZero BigDecimal preco) {
        this.preco = preco;
    }
}
