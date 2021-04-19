package Conteudo.Conjunto;


import Avaliacao.Avaliacao;
import Conteudo.Criador.Artista;
import Conteudo.Criador.Banda;
import Conteudo.Midia.Musica;
import Exceptions.jaAvaliadoException;
import Interface.Avaliavel;
import Interface.Buscavel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Album extends Conjunto implements Avaliavel, Buscavel {
    private Banda banda;
    private List<Musica> listaMusica;
    private List<Artista> listaArtista;

    private List<Avaliacao> listaAvaliacao;

    private String urlPagina;
    private String urlImagem;
    private String descricao;



    public Album(Calendar dtCriacao, String nome, Banda banda, List<Artista> listaArtista) {
        super(dtCriacao, nome);
        this.listaArtista= new ArrayList<>();
        this.listaMusica= new ArrayList<>();
        this.listaAvaliacao= new ArrayList<>();

        this.banda = banda;
        this.listaArtista = listaArtista;

    }

    public Album(Calendar dtCriacao, String nome, List<Artista> listaArtista) {
        super(dtCriacao, nome);
        this.listaArtista = listaArtista;
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

    public void addAvaliacao(Avaliacao avaliacao) throws Exception{

        for (int i = 0; i < this.listaAvaliacao.size(); i++) {
            if (this.listaAvaliacao.get(i).getUsuario() == avaliacao.getUsuario()) {
                throw new jaAvaliadoException();
            }
        }
        this.listaAvaliacao.add(avaliacao);
    }

    public List<Avaliacao> getListaAvaliacao() {
        return this.listaAvaliacao;
    }

    public Banda getBanda() {
        return this.banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public List<Artista> getListaArtista() {
        return listaArtista;
    }

    public void setListaArtista(List<Artista> listaArtista) {
        this.listaArtista = listaArtista;
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
