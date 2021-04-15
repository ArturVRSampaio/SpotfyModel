package Criador;

import Conjunto.Temporada;

import java.util.Calendar;
import java.util.List;

public class PodCaster extends Criador{
    private Calendar DtCriacao;
    private List<Temporada> listaTemporada;



    public PodCaster(String nome, String urlImagem, Calendar dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }

    public Calendar getDtCriacao() {
        return DtCriacao;
    }

    public void setDtCriacao(Calendar dtCriacao) {
        DtCriacao = dtCriacao;
    }

    public List<Temporada> getListaTemporada() {
        return listaTemporada;
    }

    public void setListaTemporada(List<Temporada> listaTemporada) {
        this.listaTemporada = listaTemporada;
    }
}
