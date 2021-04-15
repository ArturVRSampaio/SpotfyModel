package Conjunto;

public class Conjunto {
    private String nome;
    private String descricao;
    private String UrlConjunto;
    private String UrlImagem;
    private String listaDeConteudo;


    /////////////// Constructor //////////////////
    public Conjunto(String nome, String descricao, String urlConjunto, String urlImagem) {
        this.nome = nome;
        this.descricao = descricao;
        UrlConjunto = urlConjunto;
        UrlImagem = urlImagem;
    }

    /////////////// setters  && getters //////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlConjunto() {
        return UrlConjunto;
    }

    public void setUrlConjunto(String urlConjunto) {
        UrlConjunto = urlConjunto;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }
}
