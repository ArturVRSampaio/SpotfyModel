package Conteudo;

import Conjunto.Album;
import Conjunto.Playlist;
import Criador.Artista;
import Criador.Banda;

import java.util.List;

public class Musica extends Conteudo{
    private Banda Banda;
    private Album album;
    private List<Playlist> listaPlaylist;
    private List<Artista> listaArtista;

    public Musica(String nome, String dtCriacao, String urlConteudo,
                  String urlImagem, Criador.Banda banda, Album album,
                  List<Playlist> listaPlaylist, List<Artista> listaArtista) {
        super(nome, dtCriacao, urlConteudo, urlImagem);
        Banda = banda;
        this.album = album;
        this.listaPlaylist = listaPlaylist;
        this.listaArtista = listaArtista;
    }
}
