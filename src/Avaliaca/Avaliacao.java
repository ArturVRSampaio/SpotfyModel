package Avaliaca;

import Conjunto.Conjunto;
import Conteudo.Conteudo;
import Criador.Criador;
import Usuario.Usuario;

public class Avaliacao {
    private Usuario usuario;
    private boolean avaliacao;


//constructors
    // avalicacao de conteudo
    public Avaliacao(Usuario usuario, boolean avaliacao, Conteudo conteudo) {
        this.usuario = usuario;
        this.avaliacao= avaliacao;
    }

    // avalicacao de conjunto
    public Avaliacao(Usuario usuario, boolean avaliacao, Conjunto conjunto) {
        this.usuario = usuario;
        this.avaliacao= avaliacao;
    }

    // avalicacao de criador
    public Avaliacao(Usuario usuario, boolean avaliacao, Criador criador) {
        this.usuario = usuario;
        this.avaliacao= avaliacao;
    }

}
