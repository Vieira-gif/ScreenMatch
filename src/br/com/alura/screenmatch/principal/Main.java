package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Using Class Filme
        Filme velozesefuriosos = new Filme("Velozes e Furiosos", 1978);
        velozesefuriosos.setDuracao(180);
        velozesefuriosos.avalia(10);
        velozesefuriosos.avalia(10);
        velozesefuriosos.avalia(10);
        velozesefuriosos.setincluidoNoPlano(false);
        velozesefuriosos.exibeFichaTecnica();

        Filme poderosoChefao = new Filme("Poderoso Chefão", 1998);
        poderosoChefao.setDuracao(165);

        //Using Class Serie
        Serie peacemaker = new Serie("PeaceMkaer", 2022);
        peacemaker.setMinutosPorEpisodio(320);
        peacemaker.setEpisodiosPorTemporada(8);
        peacemaker.setTemporada(1);
        peacemaker.avalia(10);
        peacemaker.avalia(8);
        peacemaker.setAtiva(false);
        peacemaker.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(velozesefuriosos);
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(peacemaker);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(poderosoChefao);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(peacemaker);
        episodio.setTotalVisualizacoes(1200);

        filtro.filtra(episodio);

        var filmeDoJoao = new Filme("Shrek", 2001);
        filmeDoJoao.setDuracao(75);
        filmeDoJoao.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList();
        listaDeFilme.add(filmeDoJoao);
        listaDeFilme.add(poderosoChefao);
        listaDeFilme.add(velozesefuriosos);

        System.out.println("Tamanho da lista " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0));
        System.out.println(listaDeFilme);

        filmeDoJoao.toString();
    }
}
