package Conjunto;

import Conteudo.Musica;
import Criador.Artista;
import Criador.Banda;

import java.util.List;

public class Album extends Conjunto{
    private Banda banda;
    private List<Musica> listaMusica;
    private List<Artista> listaArtista;


    public Album(String nome, String descricao, String urlImagem, Banda banda, List<Artista> listaArtista) {
        super(nome, descricao, urlImagem);
        this.banda = banda;
        this.listaArtista = listaArtista;
    }

    public void addMusica(Musica musica) {
        this.listaMusica.add(musica);
    }


    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public List<Musica> getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }

    public List<Artista> getListaArtista() {
        return listaArtista;
    }

    public void setListaArtista(List<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }
}
