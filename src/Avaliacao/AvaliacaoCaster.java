package Avaliacao;

import Conteudo.Criador.PodCaster;
import Usuario.Usuario;

public class AvaliacaoCaster extends Avaliacao{
    
    private PodCaster caster;

    public AvaliacaoCaster(Usuario usuario, boolean avaliacao, PodCaster caster) {
        super(usuario, avaliacao);
        this.caster = caster;
    }

    public PodCaster getCaster() {
        return caster;
    }

    public void setCaster(PodCaster caster) {
        this.caster = caster;
    }
}
