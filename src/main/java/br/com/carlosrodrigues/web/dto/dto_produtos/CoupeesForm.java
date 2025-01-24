package br.com.carlosrodrigues.web.dto.dto_produtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link br.com.carlosrodrigues.core.models.models_produtos.Coupees}
 */

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class CoupeesForm extends CarroForm implements Serializable {

    @NotEmpty(message = "O campo deve ser preenchido")
    String tipoMotor;

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    int potenciaMotor;

    @NotEmpty(message = "O campo deve ser preenchido")
    String configuracaoRodas;

    @NotEmpty(message = "O campo deve ser preenchido")
    String tiposPintura;

    @NotEmpty(message = "O campo deve ser preenchido")
    String suspensao;

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

    public @NotEmpty(message = "O campo deve ser preenchido") String getConfiguracaoRodas() {
        return configuracaoRodas;
    }

    public void setConfiguracaoRodas(@NotEmpty(message = "O campo deve ser preenchido") String configuracaoRodas) {
        this.configuracaoRodas = configuracaoRodas;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTiposPintura() {
        return tiposPintura;
    }

    public void setTiposPintura(@NotEmpty(message = "O campo deve ser preenchido") String tiposPintura) {
        this.tiposPintura = tiposPintura;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(@NotEmpty(message = "O campo deve ser preenchido") String suspensao) {
        this.suspensao = suspensao;
    }
}