package Conjunto;

import Conteudo.Musica;
import Usuario.Usuario;
import java.util.List;

public class Playlist extends Conjunto{

    private Usuario usuario;
    private List<Musica> listaMusica;

    /////////////// Constructor //////////////////
    public Playlist(String nome, String descricao, String urlConjunto, String urlImagem, String listaDeConteudo, Usuario usuario) {
        super(nome, descricao, urlConjunto, urlImagem, listaDeConteudo);
        this.usuario = usuario;
    }

    public void addMusica(Musica musica) {
        this.listaMusica.add(musica);
    }



    /////////////// setters  && getters //////////////////
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
