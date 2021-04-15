package Conjunto;

import Conteudo.Musica;
import Criador.Artista;
import Criador.Banda;

import java.util.List;

public class Album extends Conjunto{
    private Banda banda;
    private List<Musica> listaMusica;
    private List<Artista> listaArtista;

    public Album(String nome, String descricao, String urlConjunto, String urlImagem, String listaDeConteudo, Banda banda) {
        super(nome, descricao, urlImagem, listaDeConteudo);
        this.banda = banda;
    }

}
