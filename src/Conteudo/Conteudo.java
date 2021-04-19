package Conteudo;

import java.util.Calendar;

public abstract class Conteudo{

    private Calendar dtCriacao;
    private String nome;
    private String urlPagina;
    private String UrlImagem;
    private int vezesEscutado;
    private String descricao;


    public Conteudo(Calendar dtCriacao, String nome, String urlPagina, String urlImagem) {
        this.dtCriacao = dtCriacao;
        this.nome = nome;
        this.urlPagina = urlPagina;
        UrlImagem = urlImagem;
    }

    public void exibe(){
        this.vezesEscutado+=1;
    }

    public Calendar getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Calendar dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlPagina() {
        return urlPagina;
    }

    public void setUrlPagina(String urlPagina) {
        this.urlPagina = urlPagina;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }

    public int getVezesEscutado() {
        return vezesEscutado;
    }

    public void setVezesEscutado(int vezesEscutado) {
        this.vezesEscutado = vezesEscutado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
