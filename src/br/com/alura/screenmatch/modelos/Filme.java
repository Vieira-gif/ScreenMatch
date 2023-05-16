package br.com.alura.screenmatch.modelos;

public class Filme {

    // DECLARER
    private String nome;
    private double duracao;
    private int anoDeLancamento, totalDeAvaliacoes, somaDeNotas;
    private boolean incluidoNoPlano;

    // METHOD
    public void somaAvaliacoes(int avalia) {
        this.somaDeNotas += avalia;
    }

    public int CalculaMedia (){
       return (this.somaDeNotas / this.totalDeAvaliacoes);
    }

    //GETTERS
    public int getanoDeLancamento() {
        return this.anoDeLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public boolean getincluidoNoPlano(){
        return this.incluidoNoPlano;
    }

    // SETTERS
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setAnoDeLancamento (int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setincluidoNoPlano (boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracao (double duracao){
        this.duracao = duracao;
    }
    public void setAvalia(int avalia){
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
