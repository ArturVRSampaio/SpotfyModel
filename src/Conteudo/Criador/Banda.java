package Conteudo.Criador;

import Conteudo.Conjunto.Album;

import java.util.Calendar;
import java.util.List;

public class Banda  extends Criador {

    private List<Artista> listaArtista;
    private List<Album> listaAlbum;

    public Banda(Calendar dtCriacao, String nome) {
        super(dtCriacao, nome);
    }
}
