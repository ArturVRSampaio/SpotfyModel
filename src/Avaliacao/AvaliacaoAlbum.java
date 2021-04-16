package Avaliacao;

import Conteudo.Conjunto.Album;
import Usuario.Usuario;

public class AvaliacaoAlbum extends Avaliacao{

    private Album album;

    public AvaliacaoAlbum(Usuario usuario, boolean avaliacao, Album album) {
        super(usuario, avaliacao);
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
