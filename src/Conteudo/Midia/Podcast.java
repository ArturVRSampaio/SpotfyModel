package Conteudo.Midia;


import Conteudo.Criador.PodCaster;
import Interface.Avaliavel;

import java.util.Calendar;

public class Podcast extends Midia implements Avaliavel {
    private PodCaster podCaster;

    public Podcast(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, Calendar dtLancamento, String duracao, PodCaster podCaster) {
        super(dtCriacao, nome, urlPagina, urlImagem, dtLancamento, duracao);
        this.podCaster = podCaster;
    }
}
