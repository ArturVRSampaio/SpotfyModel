package Conteudo.Conjunto;

import Avaliacao.Avaliacao;
import Conteudo.Midia.Musica;
import Interface.Avaliavel;
import Interface.Buscavel;
import Usuario.Usuario;

import java.util.Calendar;
import java.util.List;

public class Playlist extends Conjunto implements Avaliavel, Buscavel {
    private Usuario usuario;
    private List<Musica> listaMusica;

    private List<Avaliacao> listaAvaliacao;

    private String urlPagina;
    private String urlImagem;
    private String descricao;

    public Playlist(Calendar dtCriacao, String nome, Usuario usuario) {
        super(dtCriacao, nome);
        this.usuario = usuario;
    }

    public void addAvaliacao(Avaliacao avaliacao) {
        this.listaAvaliacao.add(avaliacao);
    }

    public List<Avaliacao> getListaAvaliacao() {
        return this.listaAvaliacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Musica> getListaMusica() {
        return listaMusica;
    }

    public void addMusica(Musica musica) {
        this.listaMusica.add(musica);
    }

    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
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
