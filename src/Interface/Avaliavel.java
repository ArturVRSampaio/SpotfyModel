package Interface;

import Avaliacao.Avaliacao;

import java.util.List;

public interface Avaliavel {

    public void addAvaliacao(Avaliacao avaliacao) throws Exception;

    public List<Avaliacao> getListaAvaliacao();

}