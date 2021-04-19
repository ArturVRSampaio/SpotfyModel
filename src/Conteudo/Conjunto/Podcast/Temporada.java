package Conteudo.Conjunto.Podcast;

import Conteudo.Conjunto.Conjunto;
import Conteudo.Criador.Podcast.PodCaster;
import Conteudo.Midia.Podcast;

import java.util.Calendar;
import java.util.List;

public class Temporada extends Conjunto{
    private PodCaster podCaster;
    private List<Podcast> listaPodcast;

    public Temporada(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, PodCaster podCaster, List<Podcast> listaPodcast) {
        super(dtCriacao, nome, urlPagina, urlImagem);
        this.podCaster = podCaster;
        this.listaPodcast = listaPodcast;
    }
}
