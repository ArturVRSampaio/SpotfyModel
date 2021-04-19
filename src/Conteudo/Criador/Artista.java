package Conteudo.Criador;

import Conteudo.Conjunto.Album;
import Interface.Buscavel;
import Interface.Seguivel;

import java.util.Calendar;
import java.util.List;

public class Artista  extends Criador implements Buscavel, Seguivel {
    private Banda banda;
    private List<Album> listaAlbum;

    private String urlPagina;
    private String urlImagem;
    private String descricao;

    public Artista(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, String descricao) {
        super(dtCriacao, nome);
        this.urlPagina = urlPagina;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public List<Album> getListaAlbum() {
        return listaAlbum;
    }

    public void addAlbum(Album album) {
        this.listaAlbum.add(album);
    }
    public void setListaAlbum(List<Album> listaAlbum) {
        this.listaAlbum = listaAlbum;
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
