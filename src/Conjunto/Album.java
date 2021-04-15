package Conjunto;

import Conteudo.Musica;
import Criador.Banda;

import java.util.List;

public class Album extends Conjunto{
    private Banda banda;
    private List<Musica> listaMusica;

    /////////////// Constructor //////////////////
    public Album(String nome, String descricao, String urlConjunto, String urlImagem, String listaDeConteudo, Banda banda) {
        super(nome, descricao, urlConjunto, urlImagem, listaDeConteudo);
        this.banda = banda;
    }

    /////////////// setters  && getters //////////////////
    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
