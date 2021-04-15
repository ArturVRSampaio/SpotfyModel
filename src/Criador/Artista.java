package Criador;

import Conjunto.Album;
import Conteudo.Musica;

import java.util.Calendar;
import java.util.List;

public class Artista  extends Criador{
    private Calendar DtNascimento;
    private Banda banda;
    private List<Album> listaAlbum;
    private List<Musica> listaMusica;



    public Artista(String nome, String urlImagem, Calendar dtNascimento) {
        super(nome, urlImagem);
        DtNascimento = dtNascimento;
    }


    public Calendar getDtNascimento() {
        return DtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        DtNascimento = dtNascimento;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public void addListaAlbum (Album album) {
        this.listaAlbum.add(album);
    }

    public List<Album> getListaAlbum() {
        return listaAlbum;
    }

    public void setListaAlbum(List<Album> listaAlbum) {
        this.listaAlbum = listaAlbum;
    }

    public void addMusica(Musica musica) {
        this.listaMusica.add(musica);
    }

    public List<Musica> getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }
}
