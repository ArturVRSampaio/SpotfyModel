package Avaliacao;

import Interface.Avaliavel;
import Usuario.Usuario;

public class Avaliacao {
    private Usuario usuario;
    private boolean avaliacao;
    private Avaliavel avaliavel;

    public Avaliacao(Usuario usuario, boolean avaliacao) {
        this.usuario = usuario;
        this.avaliacao= avaliacao;
    }

    public Avaliavel getAvaliavel() {
        return avaliavel;
    }

    public void setAvaliavel(Avaliavel avaliavel) {
        this.avaliavel = avaliavel;
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
