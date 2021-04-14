package Usuario;

public class UsuarioPremium extends Usuario{
    private double mensalidade;
    private String venciento;





    /////////////// Constructor //////////////////
    public UsuarioPremium(String nome, String dtNascimento, double mensalidade, String venciento) {
        super(nome, dtNascimento);
        this.mensalidade = mensalidade;
        this.venciento = venciento;
    }

    /////////////// setters  && getters //////////////////
    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getVenciento() {
        return venciento;
    }

    public void setVenciento(String venciento) {
        this.venciento = venciento;
    }
}
