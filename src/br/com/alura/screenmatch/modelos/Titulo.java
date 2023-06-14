package br.com.alura.screenmatch.modelos;

public class Titulo {

    // DECLARER
    private String nome;
    private int anoDeLancamento, totalDeAvaliacoes, somaDeNotas, duracao;
    private boolean incluidoNoPlano;

    //CONSTRUCTOR
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
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

}
