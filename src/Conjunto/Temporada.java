package Conjunto;

import Conteudo.Podcast;
import Criador.PodCaster;

import java.util.List;

public class Temporada extends Conjunto{
    private PodCaster podCaster;
    private List<Podcast> listaPodcast;


    public Temporada(String nome, String descricao, String urlImagem, PodCaster podCaster) {
        super(nome, descricao, urlImagem);
        this.podCaster = podCaster;
    }

    public void addPodcast(Podcast podcast) {
        this.listaPodcast.add(podcast);
    }

    public PodCaster getPodCaster() {
        return podCaster;
    }

    public void setPodCaster(PodCaster podCaster) {
        this.podCaster = podCaster;
    }

    public List<Podcast> getListaPodcast() {
        return listaPodcast;
    }

    public void setListaPodcast(List<Podcast> listaPodcast) {
        this.listaPodcast = listaPodcast;
    }
}
