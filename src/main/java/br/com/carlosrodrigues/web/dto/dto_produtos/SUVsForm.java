package br.com.carlosrodrigues.web.dto.dto_produtos;

import br.com.carlosrodrigues.core.enums.enums_produtos.Boleano;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class SUVsForm extends CarroForm{

    private Boleano tracaoIntegral;

    @NotNull(message = "O espaço deve ser preenchido")
    @PositiveOrZero
    private BigDecimal capacidadeCarga;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String tipoMotor;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String tipoSuspensao;

    public Boleano getTracaoIntegral() {
        return tracaoIntegral;
    }

    public void setTracaoIntegral(Boleano tracaoIntegral) {
        this.tracaoIntegral = tracaoIntegral;
    }

    public BigDecimal getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(BigDecimal capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }
}
