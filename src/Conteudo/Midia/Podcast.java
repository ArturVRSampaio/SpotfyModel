package Conteudo.Midia;


import Conteudo.Conjunto.Podcast.Temporada;

import java.util.Calendar;

public class Podcast extends Midia {
    private Temporada temporada;

    public Podcast(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, Calendar dtLancamento, String duracao, Temporada temporada) {
        super(dtCriacao, nome, urlPagina, urlImagem, dtLancamento, duracao);
        this.temporada = temporada;
    }
}
