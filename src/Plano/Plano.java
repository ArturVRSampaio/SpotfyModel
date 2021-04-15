package Plano;

public class Plano{
    private String nomePlano;
    private double valorPlano;


    public Plano(String nomePlano, double valorPlano) {
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
    }


    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public double getValorPlano() {
        return valorPlano;
    }

    public void setValorPlano(double valorPlano) {
        this.valorPlano = valorPlano;
    }
}
