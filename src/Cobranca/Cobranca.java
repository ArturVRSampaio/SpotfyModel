package Cobranca;

import Pagamento.Pagamento;
import Usuario.Usuario;

public class Cobranca {
    private double valor;
    private Usuario usuario;
    private Pagamento pagamento;
    private int diaVencimento;

    public Cobranca(Usuario usuario, int diaVencimento) {
        this.valor = usuario.getPlano().getValorPlano();
        this.usuario = usuario;
        this.diaVencimento = diaVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }


    public int getDiaVencimento() {
        return this.diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }


}
