package Conteudo;

import Conjunto.Temporada;
import Criador.PodCaster;

import java.util.List;

public class Podcast  extends Conteudo{
    private PodCaster podCaster;
    private List<Temporada> listaTemporada;



    public Podcast(String nome, String dtCriacao, String urlConteudo, String urlImagem, PodCaster podCaster) {
        super(nome, dtCriacao, urlConteudo, urlImagem);
        this.podCaster = podCaster;
    }
}
