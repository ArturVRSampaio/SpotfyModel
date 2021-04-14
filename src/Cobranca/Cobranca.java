package Cobranca;

import Usuario.UsuarioPremiun;

public class Cobranca {
    private String valor;
    private UsuarioPremiun usuarioPremiun;

    /////////////// Constructor //////////////////
    public Cobranca(String valor, UsuarioPremiun usuarioPremiun) {
        this.valor = valor;
        this.usuarioPremiun = usuarioPremiun;
    }

    /////////////// setters  && getters //////////////////
    public String getValor() {
        return valor;
    }

}
