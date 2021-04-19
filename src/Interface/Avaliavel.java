package Interface;

import Avaliacao.Avaliacao;

import java.util.List;

public interface Avaliavel {
    List<Avaliacao> listaAvaliacao = null;


    public void addAvaliacao(Avaliacao avaliacao);
    public List<Avaliacao> getListaAvaliacao();
    public void setListaAvaliacao(List<Avaliacao> listaAvaliacao);
}
