package Conteudo.Midia;
import Conteudo.Conteudo;

import java.util.Calendar;

public abstract class Midia extends Conteudo{
    private Calendar dtLancamento;
    private String duracao;


    public Midia(Calendar dtCriacao, String nome, Calendar dtLancamento, String duracao) {
        super(dtCriacao, nome);
        this.dtLancamento = dtLancamento;
        this.duracao = duracao;
    }
}
