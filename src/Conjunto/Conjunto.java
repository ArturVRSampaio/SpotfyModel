package Conjunto;

import Avaliacao.Avaliacao;

import java.util.List;

public class Conjunto {
    private String nome;
    private String descricao;
    private String UrlImagem;
    private List<Avaliacao> listaAvaliacao;

    public Conjunto(String nome, String descricao, String urlImagem) {
        this.nome = nome;
        this.descricao = descricao;
        UrlImagem = urlImagem;
    }
}
