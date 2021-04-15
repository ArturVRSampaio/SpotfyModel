package Usuario;

import Plano.Plano;

import java.util.Calendar;

public class  UsuarioPremium extends Usuario {


    public UsuarioPremium(String nome, Calendar dtNascimento, Plano plano) {
        super(nome, dtNascimento, plano);
    }
}