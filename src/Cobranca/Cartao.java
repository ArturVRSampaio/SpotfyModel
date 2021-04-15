package Cobranca;

import Usuario.UsuarioPremium;

public class Cartao extends Cobranca{
    private String numeroCartao;
    private String cvv;
    private String numero;
    private String nome;
    private String validade;


    public Cartao(double valor, UsuarioPremium usuarioPremium, String numeroCartao, String cvv, String numero, String nome, String validade) {
        super(valor, usuarioPremium);
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.numero = numero;
        this.nome = nome;
        this.validade = validade;
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
