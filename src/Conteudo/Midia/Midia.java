package Conteudo.Midia;
import Conteudo.Conteudo;

import java.util.Calendar;

public abstract class Midia extends Conteudo{
    private Calendar dtLancamento;
    private String duracao;

    public Midia(Calendar dtCriacao, String nome, String urlPagina, String urlImagem, Calendar dtLancamento, String duracao) {
        super(dtCriacao, nome, urlPagina, urlImagem);
        this.dtLancamento = dtLancamento;
        this.duracao = duracao;
    }
}
