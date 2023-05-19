import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        // Using Class Filme
        Filme velozesefuriosos = new Filme();
        velozesefuriosos.setNome("Velozes e Furiosos");
        velozesefuriosos.setAnoDeLancamento(1978);
        velozesefuriosos.setDuracao(180);
        velozesefuriosos.setAvalia(10);
        velozesefuriosos.setAvalia(10);
        velozesefuriosos.setAvalia(10);
        velozesefuriosos.setincluidoNoPlano(false);
        velozesefuriosos.exibeFichaTecnica();

        Filme poderosoChefao = new Filme();
        poderosoChefao.setNome("poderosoChefao");
        poderosoChefao.setAnoDeLancamento(1998);
        poderosoChefao.setDuracao(165);

        //Using Class Serie
        Serie peacemaker = new Serie();
        peacemaker.setNome("PeaceMaker");
        peacemaker.setMinutosPorEpisodio(320);
        peacemaker.setEpisodiosPorTemporada(8);
        peacemaker.setTemporada(1);
        peacemaker.setAnoDeLancamento(2022);
        peacemaker.setAvalia(10);
        peacemaker.setAvalia(8);
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
    }
}
