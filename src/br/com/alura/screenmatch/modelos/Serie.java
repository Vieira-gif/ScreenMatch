package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    // Atributes
    private int temporada;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;


    //GETTERS
    public int getTemporada() {
        return temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }


    //SETTERS
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // METHODS

    @Override
    public int getDuracaoEmMinutos(){
        return this.getTemporada() * this.getEpisodiosPorTemporada() * this.getMinutosPorEpisodio();
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.printf("""
                ------- %S --------
                Nome: %S
                Duração em minutos da serie: %d min
                Episodios por Temporada: %d
                Ano de Lançamento: %d
                Total de Avaliações: %d
                Media das Avaliação: %d
                Incluido no Plano: %b
                ------------------
                
                """, this.getNome(), this.getNome(), this.getDuracaoEmMinutos(), this.getEpisodiosPorTemporada(),this.getanoDeLancamento(), this.getTotalDeAvaliacoes(), this.calculaMedia(),this.isAtiva());
    }
}
