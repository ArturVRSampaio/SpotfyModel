package Criador;

public class Criador {
    private String nome;
    private String UrlImagem;




    /////////////// Constructor //////////////////
    public Criador(String nome, String urlImagem) {
        this.nome = nome;
        UrlImagem = urlImagem;
    }

    /////////////// setters  && getters //////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }
}
