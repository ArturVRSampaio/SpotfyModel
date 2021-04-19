package Conteudo.Midia;


import Conteudo.Conjunto.Musica.Album;
import Conteudo.Conjunto.Musica.Playlist;
import Conteudo.Criador.Musica.Banda;

import java.util.Calendar;
import java.util.List;

public class Musica extends Midia {
    private Banda banda;
    private Album album;
    private List<Playlist> listaPlaylist;


    public Musica(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, Calendar dtLancamento, String duracao, Banda banda, Album album) {

        super(dtCriacao, nome, urlPagina, urlImagem, dtLancamento, duracao);
        this.banda = banda;
        this.album = album;
    }
}
