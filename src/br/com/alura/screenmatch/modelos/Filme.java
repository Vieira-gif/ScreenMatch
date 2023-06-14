package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    // VARS
    private String diretor;

    // CONSTRUCTOR
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // GETTERS
    public String getDiretor() {
        return diretor;
    }

    // SETTERS
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // METHODS
    @Override
    public int getClassificacao() {
        return calculaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getanoDeLancamento() + ")";
    }
}
