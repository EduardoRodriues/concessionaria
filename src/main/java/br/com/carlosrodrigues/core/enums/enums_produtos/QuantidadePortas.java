package br.com.carlosrodrigues.core.enums.enums_produtos;

public enum QuantidadePortas {

    DOIS("2"),
    QUATRO("4");

    private String nome;

    QuantidadePortas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
