package Conjunto;

import Avaliacao.Avaliacao;
import Conteudo.Conteudo;
import Criador.Artista;

import java.util.List;

public class Conjunto {
    private String nome;
    private String descricao;
    private String UrlConjunto;
    private String UrlImagem;
    private List<Conteudo> listaConteudo;
    private List<Avaliacao> listaAvaliacao;


    public Conjunto(String nome, String descricao, String urlConjunto, String urlImagem) {
        this.nome = nome;
        this.descricao = descricao;
        UrlConjunto = urlConjunto;
        UrlImagem = urlImagem;
    }
}
