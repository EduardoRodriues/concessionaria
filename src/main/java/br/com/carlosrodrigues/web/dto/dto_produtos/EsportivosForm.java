package br.com.carlosrodrigues.web.dto.dto_produtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link br.com.carlosrodrigues.core.models.models_produtos.Esportivos}
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class EsportivosForm extends CarroForm implements Serializable {

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int potenciaMotor;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoSuspensao;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoTurbo;

    @NotNull(message = "O campo deve ser preenchido")
    @PositiveOrZero
    private int velocidadeMaxima;

    @NotNull(message = "O campo deve ser preenchido")
    @PositiveOrZero
    private int tempoZeroCem;

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(@NotEmpty(message = "O campo deve ser preenchido") String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoTurbo() {
        return tipoTurbo;
    }

    public void setTipoTurbo(@NotEmpty(message = "O campo deve ser preenchido") String tipoTurbo) {
        this.tipoTurbo = tipoTurbo;
    }

    public @NotNull(message = "O campo deve ser preenchido") @PositiveOrZero int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(@NotNull(message = "O campo deve ser preenchido") @PositiveOrZero int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public @NotNull(message = "O campo deve ser preenchido") @PositiveOrZero int getTempoZeroCem() {
        return tempoZeroCem;
    }

    public void setTempoZeroCem(@NotNull(message = "O campo deve ser preenchido") @PositiveOrZero int tempoZeroCem) {
        this.tempoZeroCem = tempoZeroCem;
    }
}