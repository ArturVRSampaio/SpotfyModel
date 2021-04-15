package Cobranca;

import Usuario.UsuarioPremium;

public class Cartao extends Cobranca{
    private String numeroCartao;
    private String cvv;
    private String numero;
    private String nome;
    private String validade;


    /////////////// Constructor //////////////////
    public Cartao(double valor, UsuarioPremium usuarioPremium, String numeroCartao, String cvv, String numero, String nome, String validade) {
        super(valor, usuarioPremium);
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.numero = numero;
        this.nome = nome;
        this.validade = validade;
    }

    /////////////// setters  && getters //////////////////
    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getValidade() {
        return validade;
    }

}
