package Cobranca;

import Usuario.UsuarioPremium;

public class Boleto extends Cobranca{
    private String numeroBoleto;
    private String validadeBoleto;
    private String prazoCairBoleto;
    private String valorDocumento;


    /////////////// Constructor //////////////////
    public Boleto(double valor, UsuarioPremium usuarioPremium, String numeroBoleto, String validadeBoleto, String prazoCairBoleto, String valorDocumento) {
        super(valor, usuarioPremium);
        this.numeroBoleto = numeroBoleto;
        this.validadeBoleto = validadeBoleto;
        this.prazoCairBoleto = prazoCairBoleto;
        this.valorDocumento = valorDocumento;
    }

    /////////////// setters  && getters //////////////////
    public String getNumeroBoleto() {
        return numeroBoleto;
    }

    public String getValidadeBoleto() {
        return validadeBoleto;
    }

    public String getPrazoCairBoleto() {
        return prazoCairBoleto;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }
}
