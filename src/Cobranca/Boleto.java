package Cobranca;

import Usuario.UsuarioPremiun;

public class Boleto extends Cobranca{
    private String numeroBoleto;
    private String validadeBoleto;
    private String prazoCairBoleto;
    private String valorDocumento;


    /////////////// Constructor //////////////////
    public Boleto(String valor, UsuarioPremiun usuarioPremiun, String numeroBoleto, String validadeBoleto, String prazoCairBoleto, String valorDocumento) {
        super(valor, usuarioPremiun);
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
