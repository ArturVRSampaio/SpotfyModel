package Conteudo.Criador;

import Conteudo.Midia.Podcast;

import java.util.Calendar;
import java.util.List;

public class PodCaster extends Criador {
    private List<Podcast> listaPodcast;

    public PodCaster(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, List<Podcast> listaPodcast) {
        super(dtCriacao, nome, urlPagina, urlImagem);
        this.listaPodcast = listaPodcast;
    }
}
