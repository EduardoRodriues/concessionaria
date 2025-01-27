package br.com.carlosrodrigues.core.models.models_produtos;

import br.com.carlosrodrigues.core.enums.enums_produtos.Boleano;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "suvs")
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SUVs extends Carro{

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracao_integral", nullable = false)
    @Enumerated(EnumType.STRING)
    private Boleano tracaoIntegral; // Atributo para indicar se o SUV possui tração integral.

    @Column(name = "capacidade_carga", nullable = false)
    private int capacidadeCarga; // A capacidade de carga do veículo, característica de SUVs.

    @Column(name = "tipo_motor", nullable = false)
    private String tipoMotor; // Exemplo: V6, V8, híbrido.

    @Column(name = "tipo_suspensao", nullable = false)
    private String tipoSuspensao; // Tipo de suspensão: independente, multilink, suspensão a ar, etc.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoSuspensao() {
        return tipoSuspensao;
    }

    public void setTipoSuspensao(String tipoSuspensao) {
        this.tipoSuspensao = tipoSuspensao;
    }

    public Boleano getTracaoIntegral() {
        return tracaoIntegral;
    }

    public void setTracaoIntegral(Boleano tracaoIntegral) {
        this.tracaoIntegral = tracaoIntegral;
    }

}