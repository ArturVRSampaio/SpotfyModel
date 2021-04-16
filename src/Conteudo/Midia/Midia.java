package Conteudo.Midia;
import Avaliacao.Avaliacao;
import Conteudo.Conteudo;

import java.util.Calendar;
import java.util.List;

public abstract class Midia extends Conteudo{
    private String nome;
    private Calendar DtCriacao;
    private String UrlImagem;
    private List<Avaliacao> listaAvaliacao;
    private int totalView;


}
