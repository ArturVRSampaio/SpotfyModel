package Conteudo.Criador;

import Conteudo.Conjunto.Album;
import Interface.Buscavel;
import Interface.Seguivel;

import java.util.Calendar;
import java.util.List;

public class Artista  extends Criador, Buscavel, Seguivel {
    private Banda banda;
    private List<Album> listaAlbum;

    public Artista(Calendar dtCriacao, String nome) {
        super(dtCriacao, nome);
    }
}
