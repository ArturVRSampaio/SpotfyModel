package Conjunto;

import Conteudo.Musica;
import Conteudo.Podcast;
import Criador.PodCaster;

import java.util.List;

public class Temporada extends Conjunto{
    PodCaster podCaster;
    private List<Podcast> listaPodcast;


    /////////////// Constructor //////////////////
    public Temporada(String nome, String descricao, String urlConjunto, String urlImagem, String listaDeConteudo, PodCaster podCaster) {
        super(nome, descricao, urlConjunto, urlImagem, listaDeConteudo);
        this.podCaster = podCaster;
    }

    public void addPodcast(Podcast podcast) {
        this.listaPodcast.add(podcast);
    }

    /////////////// setters  && getters //////////////////
    public PodCaster getPodCaster() {
        return podCaster;
    }

    public void setPodCaster(PodCaster podCaster) {
        this.podCaster = podCaster;
    }
}
