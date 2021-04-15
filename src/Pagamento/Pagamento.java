package Pagamento;

import java.util.Calendar;

import Cobranca.Cobranca;

public class Pagamento {
    private Cobranca cobranca;
    private Calendar dtPagamento;
    private double ValorPago;

    public Pagamento(Cobranca cobranca, Calendar dtPagamento, double valorPago) {
        this.dtPagamento = dtPagamento;
        ValorPago = valorPago;
    }


    public Cobranca getCobranca() {
        return cobranca;
    }

    public void setCobranca(Cobranca cobranca) {
        this.cobranca = cobranca;
    }

    public Calendar getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Calendar dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public double getValorPago() {
        return ValorPago;
    }

    public void setValorPago(double valorPago) {
        ValorPago = valorPago;
    }
}
