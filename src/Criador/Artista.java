package Criador;

import Conjunto.Album;
import Conteudo.Musica;

import java.util.List;

public class Artista  extends Criador{
    private String DtNascimento;
    private Banda banda;
    private List<Album> listaAlbum;
    private List<Musica> listaMusica;




    public Artista(String nome, String urlImagem, String dtNascimento) {
        super(nome, urlImagem);
        DtNascimento = dtNascimento;
    }

}
