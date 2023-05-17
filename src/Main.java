import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        // Using Class Filme
        Filme velozesefuriosos = new Filme();
        velozesefuriosos.setNome("Velozes e Furiosos");
        velozesefuriosos.setAnoDeLancamento(1978);
        velozesefuriosos.setDuracao(188);
        velozesefuriosos.setAvalia(10);
        velozesefuriosos.setAvalia(10);
        velozesefuriosos.setAvalia(10);
        velozesefuriosos.setincluidoNoPlano(false);
        velozesefuriosos.exibeFichaTecnica();

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

    }
}
