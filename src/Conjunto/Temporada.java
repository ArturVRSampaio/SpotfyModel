package Conjunto;

import Conteudo.Musica;
import Conteudo.Podcast;
import Criador.PodCaster;

import java.util.List;

public class Temporada extends Conjunto{
    private PodCaster podCaster;
    private List<Podcast> listaPodcast;


    public Temporada(String nome, String descricao, String urlConjunto, String urlImagem, String listaDeConteudo, PodCaster podCaster) {
        super(nome, descricao, urlImagem, listaDeConteudo);
        this.podCaster = podCaster;
    }

    public void addPodcast(Podcast podcast) {
        this.listaPodcast.add(podcast);
    }

}
