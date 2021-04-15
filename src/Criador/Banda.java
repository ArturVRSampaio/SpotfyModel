package Criador;

import Conjunto.Album;
import Conteudo.Musica;

import java.util.List;

public class Banda  extends Criador{

    private String DtCriacao;
    private List<Artista> listaArtista;
    private List<Album> listaAlbum;




    public Banda(String nome, String urlImagem, String dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }

}
