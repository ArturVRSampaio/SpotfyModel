package Conteudo.Criador;

import Conteudo.Midia.Podcast;
import Interface.Buscavel;
import Interface.Seguivel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PodCaster extends Criador implements Buscavel, Seguivel {
    private List<Podcast> listaPodcast;

    private String urlPagina;
    private String urlImagem;
    private String descricao;

    public PodCaster(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, String descricao) {
        super(dtCriacao, nome);
        this.listaPodcast= new ArrayList<>();

        this.urlPagina = urlPagina;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public List<Podcast> getListaPodcast() {
        return listaPodcast;
    }

    public void setListaPodcast(List<Podcast> listaPodcast) {
        this.listaPodcast = listaPodcast;
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
