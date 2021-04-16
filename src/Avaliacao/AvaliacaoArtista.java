package Avaliacao;

import Conteudo.Criador.Musica.Artista;
import Usuario.Usuario;

public class AvaliacaoArtista extends Avaliacao{
    
    private Artista artista;

    public AvaliacaoArtista(Usuario usuario, boolean avaliacao, Artista artista) {
        super(usuario, avaliacao);
        this.artista = artista;
    }


    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
