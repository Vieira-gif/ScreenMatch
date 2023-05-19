package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;


    //SETTERS
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    // GETTERS
    public Serie getSerie() {
        return this.serie;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTotalVisualizacoes() {
        return this.totalVisualizacoes;
    }

    // INTERFACES
    @Override
    public int getClassificacao() {
        if (this.totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    //METHODS

}
