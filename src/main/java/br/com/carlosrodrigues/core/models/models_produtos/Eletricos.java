package br.com.carlosrodrigues.core.models.models_produtos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "eletricos")
public class Eletricos extends Carro {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "autonomia", nullable = false)
    private int autonomia;

    @Column(name = "capacidade_bateria", nullable = false)
    private int capacidadeBateria;

    @Column(name = "tempo_carregamento", nullable = false)
    private float tempoCarregamento;

    @Column(name = "tipo_motor", nullable = false)
    private String tipoMotor;

    @Column(name = "potencia_motor", nullable = false)
    private int potenciaMotor;

    @Column(name = "tipo_carregador", nullable = false)
    private String tipoCarregador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public float getTempoCarregamento() {
        return tempoCarregamento;
    }

    public void setTempoCarregamento(float tempoCarregamento) {
        this.tempoCarregamento = tempoCarregamento;
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

    public String getTipoCarregador() {
        return tipoCarregador;
    }

    public void setTipoCarregador(String tipoCarregador) {
        this.tipoCarregador = tipoCarregador;
    }

}
