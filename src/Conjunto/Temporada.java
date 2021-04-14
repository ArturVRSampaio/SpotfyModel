package Conjunto;

import Criador.PodCaster;

public class Temporada extends Conjunto{
    PodCaster podCaster;



    /////////////// Constructor //////////////////
    public Temporada(String nome, String descricao, String urlConjunto, String urlImagem, PodCaster podCaster) {
        super(nome, descricao, urlConjunto, urlImagem);
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
