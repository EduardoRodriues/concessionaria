package br.com.carlosrodrigues.core.models.models_produtos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "esportivos")
public class Esportivos extends Carro {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "potencia_motor", nullable = false)
    private int potenciaMotor;

    @Column(name = "tipo_suspensao", nullable = false)
    private String tipoSuspensao;

    @Column(name = "tipo_turbo", nullable = false)
    private String tipoTurbo;

    @Column(name = "velocidade_maxima", nullable = false)
    private int velocidadeMaxima;

    @Column(name = "tempo_0_100", nullable = false)
    private float tempoZeroCem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public String getTipoTurbo() {
        return tipoTurbo;
    }

    public void setTipoTurbo(String tipoTurbo) {
        this.tipoTurbo = tipoTurbo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getTempoZeroCem() {
        return tempoZeroCem;
    }

    public void setTempoZeroCem(float tempoZeroCem) {
        this.tempoZeroCem = tempoZeroCem;
    }

}
