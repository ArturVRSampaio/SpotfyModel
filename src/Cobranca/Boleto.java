package Cobranca;

import Usuario.UsuarioPremium;

public class Boleto extends Cobranca{
    private String numeroBoleto;
    private String validadeBoleto;
    private String prazoCairBoleto;
    private String valorDocumento;


    public Boleto(double valor, UsuarioPremium usuarioPremium, String numeroBoleto, String validadeBoleto, String prazoCairBoleto, String valorDocumento) {
        super(valor, usuarioPremium);
        this.numeroBoleto = numeroBoleto;
        this.validadeBoleto = validadeBoleto;
        this.prazoCairBoleto = prazoCairBoleto;
        this.valorDocumento = valorDocumento;
    }


    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(String numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public String getValidadeBoleto() {
        return validadeBoleto;
    }

    public void setValidadeBoleto(String validadeBoleto) {
        this.validadeBoleto = validadeBoleto;
    }

    public String getPrazoCairBoleto() {
        return prazoCairBoleto;
    }

    public void setPrazoCairBoleto(String prazoCairBoleto) {
        this.prazoCairBoleto = prazoCairBoleto;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
    }
}
