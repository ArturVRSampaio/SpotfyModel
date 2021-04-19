package Conteudo.Midia;


import Avaliacao.Avaliacao;
import Conteudo.Criador.PodCaster;
import Interface.Avaliavel;
import Interface.Buscavel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Podcast extends Midia implements Avaliavel, Buscavel {
    private PodCaster podCaster;

    private List<Avaliacao> listaAvaliacao;

    private String urlPagina;
    private String urlImagem;
    private String descricao;

    public Podcast(Calendar dtCriacao, String nome, Calendar dtLancamento, String duracao, PodCaster podCaster) {
        super(dtCriacao, nome, dtLancamento, duracao);

        this.listaAvaliacao= new ArrayList<>();

        this.podCaster = podCaster;
    }


    public void addAvaliacao(Avaliacao avaliacao) {
        this.listaAvaliacao.add(avaliacao);
    }

    public List<Avaliacao> getListaAvaliacao() {
        return this.listaAvaliacao;
    }

    public PodCaster getPodCaster() {
        return podCaster;
    }

    public void setPodCaster(PodCaster podCaster) {
        this.podCaster = podCaster;
    }

    public void setListaAvaliacao(List<Avaliacao> listaAvaliacao) {
        this.listaAvaliacao = listaAvaliacao;
    }

    public String getUrlPagina() {
        return urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }

    public String geturlImagem() {
        return urlImagem;
    }

    public void seturlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
