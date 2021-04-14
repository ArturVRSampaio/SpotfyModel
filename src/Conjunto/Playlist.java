package Conjunto;

import Usuario.Usuario;

public class Playlist extends Conjunto{

    private Usuario usuario;


    /////////////// Constructor //////////////////
    public Playlist(String nome, String descricao, String urlConjunto, String urlImagem, Usuario usuario) {
        super(nome, descricao, urlConjunto, urlImagem);
        this.usuario = usuario;
    }

    /////////////// setters  && getters //////////////////
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
