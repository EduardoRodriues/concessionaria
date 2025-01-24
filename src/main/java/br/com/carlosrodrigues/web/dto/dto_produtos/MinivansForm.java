package br.com.carlosrodrigues.web.dto.dto_produtos;

import br.com.carlosrodrigues.core.enums.enums_produtos.Boleano;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link br.com.carlosrodrigues.core.models.models_produtos.Minivans}
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class MinivansForm extends CarroForm implements Serializable {

    @PositiveOrZero
    @NotNull(message = "O campo deve ser preenchido")
    private int capacidadePassageiros;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String configuracaoAssentos;

    @NotNull(message = "O campo deve ser preenchido")
    private Boleano portaLateralAutomatica;

    @NotEmpty(message = "O campo deve ser preenchido")
    private String tipoSuspensao;

    @NotNull(message = "O campo deve ser preenchido")
    private Boleano arCondicionado;

    public @PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(@PositiveOrZero @NotNull(message = "O campo deve ser preenchido") int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getConfiguracaoAssentos() {
        return configuracaoAssentos;
    }

    public void setConfiguracaoAssentos(@NotEmpty(message = "O campo deve ser preenchido") String configuracaoAssentos) {
        this.configuracaoAssentos = configuracaoAssentos;
    }

    public @NotNull(message = "O campo deve ser preenchido") Boleano getPortaLateralAutomatica() {
        return portaLateralAutomatica;
    }

    public void setPortaLateralAutomatica(@NotNull(message = "O campo deve ser preenchido") Boleano portaLateralAutomatica) {
        this.portaLateralAutomatica = portaLateralAutomatica;
    }

    public @NotEmpty(message = "O campo deve ser preenchido") String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(@NotEmpty(message = "O campo deve ser preenchido") String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public @NotNull(message = "O campo deve ser preenchido") Boleano getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(@NotNull(message = "O campo deve ser preenchido") Boleano arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}