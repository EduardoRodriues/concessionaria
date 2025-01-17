package br.com.carlosrodrigues.core.models.models_produtos;

import br.com.carlosrodrigues.core.enums.enums_produtos.QuantidadePortas;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "conversiveis")
public class Conversiveis extends Carro{

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_teto", nullable = false)
    private String tipoTeto; // Tipo de teto: conversível de lona, metálico, etc.

    @Column(name = "capacidade_motor", nullable = false)
    private BigDecimal capacidadeMotor; // Capacidade do motor, muito relevante em conversíveis de alto desempenho.

    @Column(name = "quantidade_portas", nullable = false)
    @Enumerated(EnumType.STRING)
    private QuantidadePortas quantidadePortas; // Conversíveis geralmente têm 2 ou 4 portas.

    @Column(name = "configuracao_assentos", nullable = false)
    private String configuracaoAssentos;  // Ex: 2+2, 2 lugares esportivos.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Conversiveis{" +
                "id=" + id +
                ", tipoTeto='" + tipoTeto + '\'' +
                ", capacidadeMotor=" + capacidadeMotor +
                ", quantidadePortas=" + quantidadePortas +
                ", configuracaoAssentos='" + configuracaoAssentos + '\'' +
                '}';
    }
}