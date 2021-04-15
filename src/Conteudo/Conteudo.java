package Conteudo;

import java.util.Calendar;
import java.util.List;

import Avaliacao.Avaliacao;

public class Conteudo {
    private String nome;
    private Calendar DtCriacao;
    private String UrlImagem;
    private List<Avaliacao> listaAvaliacao;


    public Conteudo(String nome, Calendar dtCriacao, String urlImagem) {
        this.nome = nome;
        DtCriacao = dtCriacao;
        UrlImagem = urlImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDtCriacao() {
        return DtCriacao;
    }

    public void setDtCriacao(Calendar dtCriacao) {
        DtCriacao = dtCriacao;
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
