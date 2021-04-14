package Criador;

public class PodCaster extends Criador{
    private String DtCriacao;


    /////////////// Constructor //////////////////
    public PodCaster(String nome, String urlImagem, String dtCriacao) {
        super(nome, urlImagem);
        DtCriacao = dtCriacao;
    }

    /////////////// setters  && getters //////////////////
    public String getDtCriacao() {
        return DtCriacao;
    }

}
