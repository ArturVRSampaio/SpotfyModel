package Cobranca;

import Usuario.UsuarioPremium;

public class Cobranca {
    private String valor;
    private UsuarioPremium usuarioPremium;

    /////////////// Constructor //////////////////
    public Cobranca(String valor, UsuarioPremium usuarioPremium) {
        this.valor = valor;
        this.usuarioPremium = usuarioPremium;
    }

    /////////////// setters  && getters //////////////////
    public String getValor() {
        return valor;
    }

}
