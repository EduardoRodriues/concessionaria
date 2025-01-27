package br.com.carlosrodrigues.web.dto.dto_produtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link br.com.carlosrodrigues.core.models.models_produtos.Picapes}
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class PicapesForm extends CarroForm implements Serializable {

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int capacidadeCarga;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoCacamba;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String sistemaTracao;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoMotor;

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int capacidadeReboque;

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoCacamba() {
        return tipoCacamba;
    }

    public void setTipoCacamba(@NotEmpty(message = "O campo deve ser preenchido") String tipoCacamba) {
        this.tipoCacamba = tipoCacamba;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getSistemaTracao() {
        return sistemaTracao;
    }

    public void setSistemaTracao(@NotEmpty(message = "O campo deve ser preenchido") String sistemaTracao) {
        this.sistemaTracao = sistemaTracao;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(@NotEmpty(message = "O campo deve ser preenchido") String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getCapacidadeReboque() {
        return capacidadeReboque;
    }

    public void setCapacidadeReboque(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int capacidadeReboque) {
        this.capacidadeReboque = capacidadeReboque;
    }
}