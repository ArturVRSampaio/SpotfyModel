package Cobranca;

import Usuario.UsuarioPremium;

public class Cobranca {
    private double valor;
    private UsuarioPremium usuarioPremium;

    /////////////// Constructor //////////////////
    public Cobranca(double valor, UsuarioPremium usuarioPremium) {
        this.valor = valor;
        this.usuarioPremium = usuarioPremium;
    }

    /////////////// setters  && getters //////////////////
    public double getValor() {
        return valor;
    }

}
