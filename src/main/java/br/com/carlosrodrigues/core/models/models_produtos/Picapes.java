package br.com.carlosrodrigues.core.models.models_produtos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "picapes")
public class Picapes extends Carro {

    @Id
    @EqualsAndHashCode.Include
    @ToString.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "capacidade_carga", nullable = false)
    private int capacidadeCarga;

    @Column(name = "tipo_caçamba", nullable = false)
    private String tipoCacamba;

    @Column(name = "sistema_tracao", nullable = false)
    private String sistemaTracao;

    @Column(name = "tipo_motor", nullable = false)
    private String tipoMotor;

    @Column(name = "capacidade_reboque", nullable = false)
    private int capacidadeReboque;

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

    public String getTipoCacamba() {
        return tipoCacamba;
    }

    public void setTipoCacamba(String tipoCacamba) {
        this.tipoCacamba = tipoCacamba;
    }

    public String getSistemaTracao() {
        return sistemaTracao;
    }

    public void setSistemaTracao(String sistemaTracao) {
        this.sistemaTracao = sistemaTracao;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadeReboque() {
        return capacidadeReboque;
    }

    public void setCapacidadeReboque(int capacidadeReboque) {
        this.capacidadeReboque = capacidadeReboque;
    }

}
