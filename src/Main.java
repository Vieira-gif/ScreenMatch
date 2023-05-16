import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Velozes e Furiosos");
        filme1.setAnoDeLancamento(1978);
        filme1.setDuracao(188);
        filme1.setAvalia(10);
        filme1.setAvalia(10);
        filme1.setAvalia(10);
        filme1.setincluidoNoPlano(false);
        System.out.println(filme1.getNome());

        //System.out.println(filme1);


    }
}
