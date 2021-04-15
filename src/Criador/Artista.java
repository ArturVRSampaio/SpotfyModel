package Criador;

import Conjunto.Album;
import Conteudo.Musica;

import java.util.Calendar;
import java.util.List;

public class Artista  extends Criador{
    private Calendar DtNascimento;
    private Banda banda;
    private List<Album> listaAlbum;
    private List<Musica> listaMusica;



    public Artista(String nome, String urlImagem, Calendar dtNascimento) {
        super(nome, urlImagem);
        DtNascimento = dtNascimento;
    }

}
