package Avaliacao;

import Conjunto.Playlist;
import Usuario.Usuario;

public class AvaliacaoPlaylist extends Avaliacao{

    private Playlist playlist;

    public AvaliacaoPlaylist(Usuario usuario, boolean avaliacao, Playlist playlist) {
        super(usuario, avaliacao);
        this.playlist = playlist;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setAlbum(Playlist playlist) {
        this.playlist = playlist;
    }
}
