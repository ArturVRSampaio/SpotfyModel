package Conteudo.Conjunto;

import Conteudo.Conteudo;

import java.util.Calendar;

public abstract class Conjunto extends Conteudo{

    public Conjunto(Calendar dtCriacao, String nome, String urlPagina, String urlImagem) {
        super(dtCriacao, nome, urlPagina, urlImagem);
    }
}
