package Criador;

import Avaliacao.Avaliacao;

import java.util.List;

public class Criador {
    private String nome;
    private String UrlImagem;
    private List<Avaliacao> listaAvaiacao;




    /////////////// Constructor //////////////////
    public Criador(String nome, String urlImagem) {
        this.nome = nome;
        UrlImagem = urlImagem;
    }
}
