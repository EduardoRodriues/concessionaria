package br.com.carlosrodrigues.core.models.models_produtos;
import br.com.carlosrodrigues.core.enums.enums_produtos.Boleano;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "minivans")
public class Minivans extends Carro {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "capacidade_passageiros", nullable = false)
    private int capacidadePassageiros;

    @Column(name = "configuracao_assentos", nullable = false)
    private String configuracaoAssentos;

    @Column(name = "porta_lateral", nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano portaLateralAutomatica;

    @Column(name = "tipo_suspensao", nullable = false)
    private String tipoSuspensao;

    @Column(name = "ar_condicionado", nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano arCondicionado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getConfiguracaoAssentos() {
        return configuracaoAssentos;
    }

    public void setConfiguracaoAssentos(String configuracaoAssentos) {
        this.configuracaoAssentos = configuracaoAssentos;
    }

    public Boleano getPortaLateralAutomatica() {
        return portaLateralAutomatica;
    }

    public void setPortaLateralAutomatica(Boleano portaLateralAutomatica) {
        this.portaLateralAutomatica = portaLateralAutomatica;
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public Boleano getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boleano arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}
