package Usuario;

import Avaliacao.Avaliacao;
import Conteudo.Conjunto.Playlist;
import Conteudo.Midia.Musica;
import Interface.Avaliavel;
import Plano.Plano;

import java.util.Calendar;
import java.util.List;

public class Usuario {
    private String nome;
    private Calendar dtNascimento;
    private Plano plano;
    private List<Avaliacao> listaAvaliacao;
    private List<Playlist> listaPlaylist;
    private List<Musica> listaMusicasGostei;


    public Usuario(String nome, Calendar dtNascimento, Plano plano) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.plano = plano;
    }


    public void avalia(boolean gostou, Avaliavel avaliavel){
        Avaliacao avaliacao = new Avaliacao(this, gostou, avaliavel);
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

    public void setListaMusicasGostei(List<Musica> listaMusicasGostei) {
        this.listaMusicasGostei = listaMusicasGostei;
    }

    public List<Musica> getListaMusicasGostei() {
        return listaMusicasGostei;
    }

    public void addListaMusicasGostei (Musica musica) {
        this.listaMusicasGostei.add(musica);
    }

}
