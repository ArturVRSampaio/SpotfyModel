package Conjunto;

import Criador.Banda;

public class Album extends Conjunto{
    private Banda banda;


    /////////////// Constructor //////////////////
    public Album(String nome, String descricao, String urlConjunto, String urlImagem, Banda banda) {
        super(nome, descricao, urlConjunto, urlImagem);
        this.banda = banda;
    }

    /////////////// setters  && getters //////////////////
    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
