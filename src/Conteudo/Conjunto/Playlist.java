package Conteudo.Conjunto;

import Conteudo.Midia.Musica;
import Usuario.Usuario;

import java.util.Calendar;
import java.util.List;

public class Playlist extends Conjunto {
    private Usuario usuario;
    private List<Musica> listaMusica;

    public Playlist(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, Usuario usuario, List<Musica> listaMusica) {
        super(dtCriacao, nome, urlPagina, urlImagem);
        this.usuario = usuario;
        this.listaMusica = listaMusica;
    }
}
