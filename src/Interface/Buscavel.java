package Interface;

public interface Buscavel {
    String urlPagina = null;
    String UrlImagem = null;
    String descricao = null;


    public String getUrlPagina();
    public void setUrlPagina(String urlPagina);
    public String getUrlImagem();
    public void setUrlImagem(String urlImagem);

    public int getVezesEscutado();
    public void setVezesEscutado(int vezesEscutado);

    public String getDescricao();
    public void setDescricao(String descricao);


}
