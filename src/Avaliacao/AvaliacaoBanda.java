package Avaliacao;

import Conteudo.Criador.Banda;
import Usuario.Usuario;

public class AvaliacaoBanda extends Avaliacao{

    private Banda banda;

    public AvaliacaoBanda(Usuario usuario, boolean avaliacao, Banda banda) {
        super(usuario, avaliacao);
        this.banda = banda;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
}
