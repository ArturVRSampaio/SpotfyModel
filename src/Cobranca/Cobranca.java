package Cobranca;

import Pagamento.Pagamento;
import Usuario.UsuarioPremium;

public class Cobranca {
    private double valor;
    private UsuarioPremium usuarioPremium;
    private Pagamento pagamento;

    public Cobranca(double valor, UsuarioPremium usuarioPremium) {
        this.valor = valor;
        this.usuarioPremium = usuarioPremium;
    }

}
