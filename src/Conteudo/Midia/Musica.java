package Conteudo.Midia;


import Avaliacao.Avaliacao;
import Conteudo.Conjunto.Album;
import Conteudo.Conjunto.Playlist;
import Conteudo.Criador.Banda;
import Interface.Avaliavel;
import Interface.Buscavel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Musica extends Midia implements Avaliavel, Buscavel {
    private Banda banda;
    private Album album;
    private List<Playlist> listaPlaylist;

    private List<Avaliacao> listaAvaliacao;

    private String urlPagina;
    private String urlImagem;
    private String descricao;

    public Musica(Calendar dtCriacao, String nome, Calendar dtLancamento, String duracao, Banda banda, Album album) {
        super(dtCriacao, nome, dtLancamento, duracao);
        
        this.listaPlaylist= new ArrayList<>();
        this.listaAvaliacao= new ArrayList<>();

        this.banda = banda;
        this.album = album;
    }

    public void addAvaliacao(Avaliacao avaliacao) {
        this.listaAvaliacao.add(avaliacao);
    }

    public List<Avaliacao> getListaAvaliacao() {
        return this.listaAvaliacao;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List<Playlist> getListaPlaylist() {
        return listaPlaylist;
    }

    public void setListaPlaylist(List<Playlist> listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
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
