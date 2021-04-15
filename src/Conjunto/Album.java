package Conjunto;

import Conteudo.Conteudo;
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


}
