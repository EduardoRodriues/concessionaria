package br.com.carlosrodrigues.core.models.models_produtos;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "coupees")
public class Coupees extends Carro {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_motor", nullable = false)
    private String tipoMotor;

    @Column(name = "potencia_motor", nullable = false)
    private int potenciaMotor;

    @Column(name = "configuracao_rodas", nullable = false)
    private String configuracaoRodas;

    @Column(name = "tipos_pintura", nullable = false)
    private String tiposPintura;

    @Column(name = "suspensao", nullable = false)
    private String suspensao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getConfiguracaoRodas() {
        return configuracaoRodas;
    }

    public void setConfiguracaoRodas(String configuracaoRodas) {
        this.configuracaoRodas = configuracaoRodas;
    }

    public String getTiposPintura() {
        return tiposPintura;
    }

    public void setTiposPintura(String tiposPintura) {
        this.tiposPintura = tiposPintura;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }
}
