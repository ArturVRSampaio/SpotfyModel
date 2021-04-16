package Avaliacao;

import Conteudo.Midia.Podcast;
import Usuario.Usuario;

public class AvaliacaoPodcast extends Avaliacao{
    private Podcast podcast;

    public AvaliacaoPodcast(Usuario usuario, boolean avaliacao, Podcast podcast) {
        super(usuario, avaliacao);
        this.podcast = podcast;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }
}
