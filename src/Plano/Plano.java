package Plano;

import Usuario.Usuario;
import Usuario.UsuarioPremium;

public class Plano{
    private String nomePlano;
    private double valorPlano;
    private int diaVencimento;


    public Plano(String nomePlano, double valorPlano, int diaVencimento) {
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
        this.diaVencimento = diaVencimento;
    }
}
