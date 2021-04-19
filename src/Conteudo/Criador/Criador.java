package Conteudo.Criador;

import Conteudo.Conteudo;

import java.util.Calendar;

public abstract class Criador extends Conteudo{

    public Criador(Calendar dtCriacao, String nome, String urlPagina, String urlImagem) {
        super(dtCriacao, nome, urlPagina, urlImagem);
    }
}
