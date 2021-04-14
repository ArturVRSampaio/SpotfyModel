package Usuario;

public class Usuario {
    private String nome;
    private String dtNascimento;



    /////////////// Constructor //////////////////
    public Usuario(String nome, String dtNascimento){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    /////////////// setters  && getters //////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        dtNascimento = dtNascimento;
    }
}
