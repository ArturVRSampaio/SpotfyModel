package Conteudo;

import Criador.PodCaster;

public class Podcast  extends Conteudo{
    private PodCaster podCaster;


    public Podcast(String nome, String dtCriacao, String urlConteudo, String urlImagem, PodCaster podCaster) {
        super(nome, dtCriacao, urlConteudo, urlImagem);
        this.podCaster = podCaster;
    }
}
