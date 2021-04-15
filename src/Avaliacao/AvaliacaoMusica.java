package Avaliacao;

import Conteudo.Musica;
import Usuario.Usuario;

public class AvaliacaoMusica extends Avaliacao{

    private Musica musica;

    public AvaliacaoMusica(Usuario usuario, boolean avaliacao, Musica musica) {
        super(usuario, avaliacao);
        this.musica = musica;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }
}
