package calculadora;

public class Main {
    private double valorA;
    private double valorB;

    public Main() {
        this(0.0, 0.0);
    }

    public Main(double valor, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }
    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }
    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getSoma() {
        return (getValorA() + getValorB());
    }
    public double getDiferenca() {
        return (getValorA() - getValorB());
    }
    public double getProduto() {
        return (getValorA() * getValorB());
    }
    public double getQuociente() {
        return (getValorA() / getValorB());
    }
}