package br.com.carlosrodrigues.web.dto.dto_produtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link br.com.carlosrodrigues.core.models.models_produtos.Eletricos}
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class EletricosForm extends CarroForm implements Serializable {

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int autonomia;

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int capacidadeBateria;

    private float tempoCarregamento;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoMotor;

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int potenciaMotor;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoCarregador;

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int autonomia) {
        this.autonomia = autonomia;
    }

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public float getTempoCarregamento() {
        return tempoCarregamento;
    }

    public void setTempoCarregamento(float tempoCarregamento) {
        this.tempoCarregamento = tempoCarregamento;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(@NotEmpty(message = "O campo deve ser preenchido") String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoCarregador() {
        return tipoCarregador;
    }

    public void setTipoCarregador(@NotEmpty(message = "O campo deve ser preenchido") String tipoCarregador) {
        this.tipoCarregador = tipoCarregador;
    }
}