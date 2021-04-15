package Conjunto;

import Avaliacao.Avaliacao;
import Usuario.Usuario;

import java.util.List;

public abstract class Conjunto {
    private String nome;
    private String descricao;
    private String UrlImagem;
    private List<Avaliacao> listaAvaliacao;

    public Conjunto(String nome, String descricao, String urlImagem) {
        this.nome = nome;
        this.descricao = descricao;
        UrlImagem = urlImagem;
    }


    public abstract Avaliacao avalia(Usuario usuario, boolean gostou);

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }

    public List<Avaliacao> getListaAvaiacao() {
        return listaAvaliacao;
    }

    public void addlistaAvaliacao (Avaliacao avaliacao) {
        this.listaAvaliacao.add(avaliacao);
    }

    public void setListaAvaiacao(List<Avaliacao> listaAvaiacao) {
        this.listaAvaliacao = listaAvaiacao;
    }
}
