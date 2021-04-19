package Conteudo;

import java.util.Calendar;

public abstract class Conteudo{

    private Calendar dtCriacao;
    private String nome;
    private int vezesEscutado =0;


    public Conteudo(Calendar dtCriacao, String nome) {
        this.dtCriacao = dtCriacao;
        this.nome = nome;
        this.vezesEscutado = vezesEscutado;
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
}
