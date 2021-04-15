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

}
