package Conteudo;

import Avaliacao.Avaliacao;
import Avaliacao.AvaliacaoPodcast;
import Conjunto.Temporada;
import Criador.PodCaster;
import Usuario.Usuario;

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



    public Avaliacao avalia(Usuario usuario, boolean gostou) {
        Avaliacao avaliacao = new AvaliacaoPodcast(usuario, gostou, this);
        return avaliacao;
    }
    
    public PodCaster getPodCaster() {
        return podCaster;
    }

    public void setPodCaster(PodCaster podCaster) {
        this.podCaster = podCaster;
    }

    public List<Temporada> getListaTemporada() {
        return listaTemporada;
    }

    public void setListaTemporada(List<Temporada> listaTemporada) {
        this.listaTemporada = listaTemporada;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
