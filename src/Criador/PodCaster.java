package Criador;

import Conjunto.Temporada;
import Conteudo.Musica;

import java.util.List;

public class PodCaster extends Criador{
    private String DtCriacao;
    private List<Temporada> listaTemporada;



    public PodCaster(String nome, String urlImagem, String dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }

}
