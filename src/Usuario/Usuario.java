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


    public Usuario(String nome, Calendar dtNascimento, Plano plano) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.plano = plano;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Avaliacao> getListaAvaliacao() {
        return listaAvaliacao;
    }

    public void setListaAvaliacao(List<Avaliacao> listaAvaliacao) {
        this.listaAvaliacao = listaAvaliacao;
    }

    public void addlistaAvaliacao (Avaliacao avaliacao) {
        this.listaAvaliacao.add(avaliacao);
    }

    public List<Playlist> getListaPlaylist() {
        return listaPlaylist;
    }

    public void addListaPlaylist (Playlist playlist) {
        this.listaPlaylist.add(playlist);
    }


    public void setListaPlaylist(List<Playlist> listaPlaylist) {
        this.listaPlaylist = listaPlaylist;
    }
}
