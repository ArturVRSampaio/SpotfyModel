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


}
