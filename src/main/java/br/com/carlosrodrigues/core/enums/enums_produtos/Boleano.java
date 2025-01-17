package br.com.carlosrodrigues.core.enums.enums_produtos;

public enum Boleano {

    SIM("sim"),
    NAO("não");

    private String nome;

    Boleano(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
