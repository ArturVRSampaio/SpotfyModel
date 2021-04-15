package Plano;

public class Plano{
    private String nomePlano;
    private double valorPlano;
    private int diaVencimento;


    public Plano(String nomePlano, double valorPlano, int diaVencimento) {
        this.nomePlano = nomePlano;
        this.valorPlano = valorPlano;
        this.diaVencimento = diaVencimento;
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

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
}
