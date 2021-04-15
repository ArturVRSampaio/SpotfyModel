package Conteudo;

import Conjunto.Album;
import Conjunto.Playlist;
import Criador.Artista;
import Criador.Banda;

import java.util.Calendar;
import java.util.List;

public class Musica extends Conteudo{
    private Banda Banda;
    private Album album;
    private List<Playlist> listaPlaylist;
    private List<Artista> listaArtista;

    public Musica(String nome, Calendar dtCriacao, String urlImagem, Criador.Banda banda, Album album, List<Artista> listaArtista) {
        super(nome, dtCriacao, urlImagem);
        Banda = banda;
        this.album = album;
        this.listaArtista = listaArtista;
    }

    public Musica(String nome, Calendar dtCriacao, String urlImagem, Album album, List<Artista> listaArtista) {
        super(nome, dtCriacao, urlImagem);
        this.album = album;
        this.listaArtista = listaArtista;
    }


    public Banda getBanda() {
        return Banda;
    }

    public void setBanda(Banda banda) {
        Banda = banda;
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

    public List<Artista> getListaArtista() {
        return listaArtista;
    }

    public void setListaArtista(List<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }
}
