package Conteudo;

import Criador.Artista;
import Criador.Banda;

public class Musica extends Conteudo{
    private Artista artista;
    private Banda Banda;


    /////////////// Constructor //////////////////
    public Musica(String nome, String dtCriacao, String urlConteudo, String urlImagem, Artista artista, Criador.Banda banda) {
        super(nome, dtCriacao, urlConteudo, urlImagem);
        this.artista = artista;
        Banda = banda;
    }

    /////////////// setters  && getters //////////////////
    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Banda getBanda() {
        return Banda;
    }

    public void setBanda(Banda banda) {
        Banda = banda;
    }
}
