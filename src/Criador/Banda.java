package Criador;

import Conjunto.Album;

import java.util.Calendar;
import java.util.List;

public class Banda  extends Criador{

    private Calendar DtCriacao;
    private List<Artista> listaArtista;
    private List<Album> listaAlbum;




    public Banda(String nome, String urlImagem, Calendar dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }


    public Calendar getDtCriacao() {
        return DtCriacao;
    }

    public void setDtCriacao(Calendar dtCriacao) {
        DtCriacao = dtCriacao;
    }

    public List<Artista> getListaArtista() {
        return listaArtista;
    }

    public void addlistaArtista(Artista artista) {
        this.listaArtista.add(artista);
    }

    public void setListaArtista(List<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }


    public void addlistaAlbum (Album album) {
        this.listaAlbum.add(album);
    }

    public List<Album> getListaAlbum() {
        return listaAlbum;
    }

    public void setListaAlbum(List<Album> listaAlbum) {
        this.listaAlbum = listaAlbum;
    }
}
