package Conteudo.Conjunto;


import Conteudo.Criador.Artista;
import Conteudo.Criador.Banda;
import Conteudo.Midia.Musica;
import Interface.Avaliavel;

import java.util.Calendar;
import java.util.List;

public class Album extends Conjunto implements Avaliavel {
    private Banda banda;
    private List<Musica> listaMusica;
    private List<Artista> listaArtista;

    public Album(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, Banda banda, List<Musica> listaMusica, List<Artista> listaArtista) {
        super(dtCriacao, nome, urlPagina, urlImagem);
        this.banda = banda;
        this.listaMusica = listaMusica;
        this.listaArtista = listaArtista;
    }

    public Album(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, List<Musica> listaMusica, List<Artista> listaArtista) {
        super(dtCriacao, nome, urlPagina, urlImagem);
        this.listaMusica = listaMusica;
        this.listaArtista = listaArtista;
    }


}