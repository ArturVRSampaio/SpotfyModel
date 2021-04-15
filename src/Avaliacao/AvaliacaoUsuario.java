package Avaliacao;

import Usuario.Usuario;

public class AvaliacaoUsuario extends Avaliacao{
    private Usuario usuarioAvaliado;

    public AvaliacaoUsuario(Usuario usuario, boolean avaliacao, Usuario usuarioAvaliado) {
        super(usuario, avaliacao);
        this.usuarioAvaliado = usuarioAvaliado;
    }


    public Usuario getUsuarioAvaliado() {
        return usuarioAvaliado;
    }

    public void setUsuarioAvaliado(Usuario usuarioAvaliado) {
        this.usuarioAvaliado = usuarioAvaliado;
    }
}
