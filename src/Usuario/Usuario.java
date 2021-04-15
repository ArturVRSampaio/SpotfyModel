package Usuario;

import Avaliacao.Avaliacao;
import Conjunto.Playlist;
import Plano.Plano;

import java.util.Calendar;
import java.util.List;

public class Usuario {
    private String nome;
    private Calendar dtNascimento;
    private Plano plano;
    private List<Avaliacao> listaAvaliacao;
    private List<Playlist> listaPlaylist;



    public Usuario(String nome, Calendar dtNascimento){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

}
