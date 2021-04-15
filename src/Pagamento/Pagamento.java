package Pagamento;

import java.util.Calendar;

public class Pagamento {
    private Calendar dtPagamento;
    private double ValorPago;

    public Pagamento(Calendar dtPagamento, double valorPago) {
        this.dtPagamento = dtPagamento;
        ValorPago = valorPago;
    }
}
