package Conteudo.Criador;

import Conteudo.Conjunto.Album;

import java.util.Calendar;
import java.util.List;

public class Artista  extends Criador {
    private Banda banda;
    private List<Album> listaAlbum;

    public Artista(Calendar dtCriacao, String nome) {
        super(dtCriacao, nome);
    }
}
