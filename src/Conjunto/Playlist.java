package Conjunto;

import Conteudo.Musica;
import Usuario.Usuario;
import java.util.List;

public class Playlist extends Conjunto{

    private Usuario usuario;
    private List<Musica> listaMusica;

    public Playlist(String nome, String descricao, String urlImagem, Usuario usuario) {
        super(nome, descricao, urlImagem);
        this.usuario = usuario;
    }

    public void addMusica(Musica musica) {
        this.listaMusica.add(musica);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Musica> getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }
}
