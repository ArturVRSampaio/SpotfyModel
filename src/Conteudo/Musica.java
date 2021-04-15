package Conteudo;

import Criador.Artista;
import Criador.Banda;

public class Musica extends Conteudo{
    private Artista artista;
    private Banda Banda;


    public Musica(String nome, String dtCriacao, String urlConteudo, String urlImagem, Artista artista, Criador.Banda banda) {
        super(nome, dtCriacao, urlConteudo, urlImagem);
        this.artista = artista;
        Banda = banda;
    }
}
