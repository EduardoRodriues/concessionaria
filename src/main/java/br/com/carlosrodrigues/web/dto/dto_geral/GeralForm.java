package br.com.carlosrodrigues.web.dto.dto_geral;

import br.com.carlosrodrigues.core.models.models_produtos.Conversiveis;
import br.com.carlosrodrigues.core.models.models_produtos.SUVs;
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

    @Override
    public String toString() {
        return "GeralForm{" +
                "conversiveis=" + (conversiveis != null ? conversiveis.toString() : "null") +
                ", suvs=" + (suvs != null ? suvs.toString() : "null") +
                '}';
    }
}
