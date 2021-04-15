package Avaliacao;

import Usuario.Usuario;

public class Avaliacao {
    private Usuario usuario;
    private boolean avaliacao;


    public Avaliacao(Usuario usuario, boolean avaliacao) {
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
}
