package MetodoPagamento;

import Usuario.Usuario;

public class Cartao extends MetodoPagamento{
    private String numeroCartao;
    private String cvv;
    private String numero;
    private String nome;
    private String validade;


    public Cartao(Usuario usuario, int diaVencimento, String numeroCartao, String cvv, String numero, String nome, String validade) {
        super(usuario, diaVencimento);
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
