package classes;

public abstract class OperacaoMatematica {
    protected Double soma;
    protected Double subtrair;
    protected Double dividir;
    protected Double multiplicar;
    public abstract void calcular(double x, double y);









    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

    public Double getSubtrair() {
        return subtrair;
    }

    public void setSubtrair(Double subtrair) {
        this.subtrair = subtrair;
    }

    public Double getDividir() {
        return dividir;
    }

    public void setDividir(Double dividir) {
        this.dividir = dividir;
    }

    public Double getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(Double multiplicar) {
        this.multiplicar = multiplicar;
    }
}
