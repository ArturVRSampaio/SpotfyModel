package Criador;

import Avaliacao.Avaliacao;

import java.util.List;

public class Criador {
    private String nome;
    private String UrlImagem;
    private List<Avaliacao> listaAvaiacao;




    public Criador(String nome, String urlImagem) {
        this.nome = nome;
        UrlImagem = urlImagem;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }

    public List<Avaliacao> getListaAvaiacao() {
        return listaAvaiacao;
    }

    public void addlistaAvaliacao (Avaliacao avaliacao) {
        this.listaAvaiacao.add(avaliacao);
    }

    public void setListaAvaiacao(List<Avaliacao> listaAvaiacao) {
        this.listaAvaiacao = listaAvaiacao;
    }
}
