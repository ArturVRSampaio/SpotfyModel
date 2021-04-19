package Conteudo.Conjunto;

import Conteudo.Midia.Musica;
import Interface.Avaliavel;
import Interface.Buscavel;
import Usuario.Usuario;

import java.util.Calendar;
import java.util.List;

public class Playlist extends Conjunto implements Avaliavel, Buscavel {
    private Usuario usuario;
    private List<Musica> listaMusica;

    public Playlist(Calendar dtCriacao, String nome, Usuario usuario) {
        super(dtCriacao, nome);
        this.usuario = usuario;
    }
}
