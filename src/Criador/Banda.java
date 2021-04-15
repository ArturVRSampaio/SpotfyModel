package Criador;

import Conjunto.Album;

import java.util.Calendar;
import java.util.List;

public class Banda  extends Criador{

    private Calendar DtCriacao;
    private List<Artista> listaArtista;
    private List<Album> listaAlbum;




    public Banda(String nome, String urlImagem, Calendar dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }

}
