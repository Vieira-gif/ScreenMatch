package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme velozesefuriosos = new Filme("Velozes e Furiosos", 1978);
        velozesefuriosos.avalia(4);
        Filme poderosoChefao = new Filme("Poderoso Chefão", 1998);
        poderosoChefao.avalia(9);
        Serie peacemaker = new Serie("PeaceMaker", 2022);
        peacemaker.avalia(10);
        var filmeDoJoao = new Filme("Shrek", 2001);
        filmeDoJoao.avalia(7);

        ArrayList<Titulo> lista = new ArrayList();
        lista.add(filmeDoJoao);
        lista.add(poderosoChefao);
        lista.add(velozesefuriosos);
        lista.add(peacemaker);

        for (Titulo item : lista) {
            System.out.print(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 1) {
                System.out.println(" Classificação: " + filme.getClassificacao());
            }
        }
    }
}
