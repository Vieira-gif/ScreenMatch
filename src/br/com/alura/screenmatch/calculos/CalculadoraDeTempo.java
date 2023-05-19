package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    //SETTER
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //METHOD

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
}
