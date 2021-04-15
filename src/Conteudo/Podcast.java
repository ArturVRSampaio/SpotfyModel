package Conteudo;

import Conjunto.Temporada;
import Criador.PodCaster;

import java.util.Calendar;
import java.util.List;

public class Podcast extends Conteudo{
    private PodCaster podCaster;
    private List<Temporada> listaTemporada;
    private String Descricao;

    public Podcast(String nome, Calendar dtCriacao, String urlImagem, PodCaster podCaster, List<Temporada> listaTemporada, String descricao) {
        super(nome, dtCriacao, urlImagem);
        this.podCaster = podCaster;
        this.listaTemporada = listaTemporada;
        Descricao = descricao;
    }
}
