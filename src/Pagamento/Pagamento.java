package Pagamento;

import java.util.Calendar;

public class Pagamento {
    private Calendar dtPagamento;
    private double ValorPago;

    public Pagamento(Calendar dtPagamento, double valorPago) {
        this.dtPagamento = dtPagamento;
        ValorPago = valorPago;
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
