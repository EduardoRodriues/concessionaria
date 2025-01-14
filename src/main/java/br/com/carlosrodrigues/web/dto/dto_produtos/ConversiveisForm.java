package br.com.carlosrodrigues.web.dto.dto_produtos;

import br.com.carlosrodrigues.core.enums.enums_produtos.QuantidadePortas;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class ConversiveisForm extends CarroForm{

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String tipoTeto;

    @NotNull(message = "O espaço deve ser preenchido")
    @PositiveOrZero
    private BigDecimal capacidadeMotor;

    private QuantidadePortas quantidadePortas;

    @NotEmpty(message = "O espaço deve ser preenchido")
    private String configuracaoAssentos;

    public String getTipoTeto() {
        return tipoTeto;
    }

    public void setTipoTeto(String tipoTeto) {
        this.tipoTeto = tipoTeto;
    }

    public BigDecimal getCapacidadeMotor() {
        return capacidadeMotor;
    }

    public void setCapacidadeMotor(BigDecimal capacidadeMotor) {
        this.capacidadeMotor = capacidadeMotor;
    }

    public QuantidadePortas getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(QuantidadePortas quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getConfiguracaoAssentos() {
        return configuracaoAssentos;
    }

    public void setConfiguracaoAssentos(String configuracaoAssentos) {
        this.configuracaoAssentos = configuracaoAssentos;
    }
}
