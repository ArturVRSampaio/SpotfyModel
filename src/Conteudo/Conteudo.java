package Conteudo;

public class Conteudo {
    private String nome;
    private String DtCriacao;
    private String UrlConteudo;
    private String UrlImagem;



    /////////////// Constructor //////////////////
    public Conteudo(String nome, String dtCriacao, String urlConteudo, String urlImagem) {
        this.nome = nome;
        DtCriacao = dtCriacao;
        UrlConteudo = urlConteudo;
        UrlImagem = urlImagem;
    }

    /////////////// setters  && getters //////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtCriacao() {
        return DtCriacao;
    }

    public void setDtCriacao(String dtCriacao) {
        DtCriacao = dtCriacao;
    }

    public String getUrlConteudo() {
        return UrlConteudo;
    }

    public void setUrlConteudo(String urlConteudo) {
        UrlConteudo = urlConteudo;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }
}
