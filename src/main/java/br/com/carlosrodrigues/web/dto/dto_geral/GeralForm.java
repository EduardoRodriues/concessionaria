package br.com.carlosrodrigues.web.dto.dto_geral;

import br.com.carlosrodrigues.core.models.models_produtos.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
public class GeralForm {

    @ToString.Include
    private Conversiveis conversiveis;

    @ToString.Include
    private SUVs suvs;

    @ToString.Include
    private Coupees coupees;

    @ToString.Include
    private Eletricos eletricos;

    @ToString.Include
    private Esportivos esportivos;

    @ToString.Include
    private Minivans minivans;

    @ToString.Include
    private Picapes picapes;

    public Coupees getCoupees() {
        return coupees;
    }

    public void setCoupees(Coupees coupees) {
        this.coupees = coupees;
    }

    public Eletricos getEletricos() {
        return eletricos;
    }

    public void setEletricos(Eletricos eletricos) {
        this.eletricos = eletricos;
    }

    public Esportivos getEsportivos() {
        return esportivos;
    }

    public void setEsportivos(Esportivos esportivos) {
        this.esportivos = esportivos;
    }

    public Minivans getMinivans() {
        return minivans;
    }

    public void setMinivans(Minivans minivans) {
        this.minivans = minivans;
    }

    public Picapes getPicapes() {
        return picapes;
    }

    public void setPicapes(Picapes picapes) {
        this.picapes = picapes;
    }

    public Conversiveis getConversiveis() {
        return conversiveis;
    }

    public void setConversiveis(Conversiveis conversiveis) {
        this.conversiveis = conversiveis;
    }

    public SUVs getSuvs() {
        return suvs;
    }

    public void setSuvs(SUVs suvs) {
        this.suvs = suvs;
    }
}
