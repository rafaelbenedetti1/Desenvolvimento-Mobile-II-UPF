package com.example.benedetti;

public class Pessoa {
    private String nome;
    private Integer idade;

    public String getResultado() {
        return nome+ "você viveu aproximadamente" + (idade+365)+ " dias";
    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
