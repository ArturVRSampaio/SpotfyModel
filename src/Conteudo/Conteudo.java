package Conteudo;

import java.util.Calendar;

public class Conteudo {
    private String nome;
    private Calendar DtCriacao;
    private String UrlImagem;


    public Conteudo(String nome, Calendar dtCriacao, String urlImagem) {
        this.nome = nome;
        DtCriacao = dtCriacao;
        UrlImagem = urlImagem;
    }
}
