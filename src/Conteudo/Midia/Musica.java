package Conteudo.Midia;


import Conteudo.Conjunto.Album;
import Conteudo.Conjunto.Playlist;
import Conteudo.Criador.Banda;
import Interface.Avaliavel;

import java.util.Calendar;
import java.util.List;

public class Musica extends Midia implements Avaliavel {
    private Banda banda;
    private Album album;
    private List<Playlist> listaPlaylist;

    public Musica(Calendar dtCriacao, String nome, Calendar dtLancamento, String duracao, Banda banda, Album album) {
        super(dtCriacao, nome, dtLancamento, duracao);
        this.banda = banda;
        this.album = album;
    }
}
