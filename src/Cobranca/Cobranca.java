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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public UsuarioPremium getUsuarioPremium() {
        return usuarioPremium;
    }

    public void setUsuarioPremium(UsuarioPremium usuarioPremium) {
        this.usuarioPremium = usuarioPremium;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
