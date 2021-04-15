package Avaliacao;

import Conjunto.Conjunto;
import Conteudo.Conteudo;
import Criador.Criador;
import Usuario.Usuario;

public class Avaliacao {
    private Usuario usuario;
    private boolean avaliacao;
    private Conteudo Conteudo;
    private Conjunto Conjunto;
    private Criador Criador;


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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Conteudo getConteudo() {
        return Conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        Conteudo = conteudo;
    }

    public Conjunto getConjunto() {
        return Conjunto;
    }

    public void setConjunto(Conjunto conjunto) {
        Conjunto = conjunto;
    }

    public Criador getCriador() {
        return Criador;
    }

    public void setCriador(Criador criador) {
        Criador = criador;
    }
}
