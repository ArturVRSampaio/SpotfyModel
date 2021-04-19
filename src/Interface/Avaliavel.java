package Interface;

import Avaliacao.Avaliacao;

import java.util.List;

public interface Avaliavel {
    List<Avaliacao> listaAvaliacao = null;


    void addAvaliacao(Avaliacao avaliacao);
    List<Avaliacao> getListaAvaliacao();
    void setListaAvaliacao(List<Avaliacao> listaAvaliacao);
}
