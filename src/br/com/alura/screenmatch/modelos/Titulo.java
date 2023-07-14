package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {



    // DECLARER
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;

    private int totalDeAvaliacoes;
    private int somaDeNotas;
    private int duracao;
    private boolean incluidoNoPlano;

    //CONSTRUCTOR
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmb){
        this.nome = meuTituloOmb.title();
        if (meuTituloOmb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmb.year());
        this.duracao = Integer.valueOf(meuTituloOmb.runtime().substring(0, 2));

    }

    // METHOD
    public void somaAvaliacoes(int avalia) {
        this.somaDeNotas += avalia;
    }

    public int calculaMedia(){
        if (totalDeAvaliacoes <= 0){
            return 0;
        } else {
            return (this.somaDeNotas / this.totalDeAvaliacoes);
        }
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

    public int getDuracaoEmMinutos() {
        return this.duracao;
    }

    public boolean getincluidoNoPlano(){
        return this.incluidoNoPlano;
    }


    // SETTERS
    public void setNome (String nome){
        if (!nome.isBlank()){
            this.nome = nome;
        } else {
            this.nome = null;
        }

    }
    public void setAnoDeLancamento (int anoDeLancamento){
        if (!(anoDeLancamento < 0)){
            this.anoDeLancamento = anoDeLancamento;
        } else {
            this.anoDeLancamento = 0;
        }

    }
    public void setincluidoNoPlano (boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;

    }
    public void setDuracao (int duracao){
        if (!(duracao < 0)){
            this.duracao = duracao;
        } else {
            this.duracao = 0;
        }

    }
    public void avalia(int avalia){
        if (!(avalia < 0)) {
            somaAvaliacoes(avalia);
            this.totalDeAvaliacoes++;
        } else {
            somaAvaliacoes(0);
            this.totalDeAvaliacoes = 0;
        }

    }

    // toString
    public void exibeFichaTecnica() {
        System.out.printf("""
                ------- %S --------
                Nome: %S
                Duração: %d Horas
                Ano de Lançamento: %d
                Total de Avaliações: %d
                Media das Avaliação: %d
                Incluido no Plano: %b
                ------------------
                
                """, this.getNome(), this.getNome(), this.getDuracaoEmMinutos(), this.getanoDeLancamento(), this.getTotalDeAvaliacoes(), this.calculaMedia(),this.getincluidoNoPlano());
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return ("""
                Nome: %s | Ano de Lançamento: %d | Duração: %d
                """).formatted(this.getNome(), this.getanoDeLancamento(), this.getDuracaoEmMinutos());
    }
}
