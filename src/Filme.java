public class Filme {

    // DECLARER
    private String nome;
    private double duracao;
    private int anoDeLancamento, totalDeAvaliacoes, somaDeNotas;
    private boolean incluidoNoPlano;

    // METHOD
    void somaAvaliacoes(int avalia) {
        this.somaDeNotas += avalia;
    }

    int CalculaMedia (){
       return (this.somaDeNotas / this.totalDeAvaliacoes);
    }

    //GETTERS
    int getanoDeLancamento() {
        return this.anoDeLancamento;
    }

    int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    String getNome() {
        return this.nome;
    }

    double getDuracao() {
        return this.duracao;
    }

    boolean getincluidoNoPlano(){
        return this.incluidoNoPlano;
    }

    // SETTERS
    void setNome (String nome){
        this.nome = nome;
    }
    void setAnoDeLancamento (int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    void setincluidoNoPlano (boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    void setDuracao (double duracao){
        this.duracao = duracao;
    }
    void setAvalia(int avalia){
        somaAvaliacoes(avalia);
        this.totalDeAvaliacoes++;
    }

    // toString
    public String toString () {
        return ("""
                Nome: %S
                Duração: %.1f
                Ano de Lançamento: %d
                Soma das Avaliação: %d
                Total de Avaliações: %d
                Media das Avaliação: %d
                Incluido no Plano: %b
                """).formatted(this.nome, this.duracao, this.anoDeLancamento, this.somaDeNotas, this.totalDeAvaliacoes, this.CalculaMedia(),this.incluidoNoPlano);
    }

}
