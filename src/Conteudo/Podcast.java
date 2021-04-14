package Conteudo;

import Criador.PodCaster;

public class Podcast  extends Conteudo{
    private PodCaster podCaster;


    /////////////// Constructor //////////////////
    public Podcast(String nome, String dtCriacao, String urlConteudo, String urlImagem, PodCaster podCaster) {
        super(nome, dtCriacao, urlConteudo, urlImagem);
        this.podCaster = podCaster;
    }

    /////////////// setters  && getters //////////////////
    public PodCaster getPodCaster() {
        return podCaster;
    }

    public void setPodCaster(PodCaster podCaster) {
        this.podCaster = podCaster;
    }
}
