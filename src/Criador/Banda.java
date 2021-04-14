package Criador;

public class Banda  extends Criador{

    private String DtCriacao;





    /////////////// Constructor //////////////////
    public Banda(String nome, String urlImagem, String dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }

    /////////////// setters  && getters //////////////////
    public String getDtCriacao() {
        return DtCriacao;
    }

    public void setDtCriacao(String dtCriacao) {
        DtCriacao = dtCriacao;
    }
}
