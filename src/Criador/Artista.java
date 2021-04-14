package Criador;

public class Artista  extends Criador{
    private String DtNascimento;



    /////////////// Constructor //////////////////
    public Artista(String nome, String urlImagem, String dtNascimento) {
        super(nome, urlImagem);
        DtNascimento = dtNascimento;
    }

    /////////////// setters  && getters //////////////////
    public String getDtNascimento() {
        return DtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        DtNascimento = dtNascimento;
    }
}
