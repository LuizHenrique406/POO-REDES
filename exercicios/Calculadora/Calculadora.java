public class Calculadora {
    private double valor;

    public Calculadora() {
        this.valor = 0.0;
    }
    public void somar(double numero) {
        this.valor += numero;
    }
    public void subtarir(double numero) {
        this.valor -= numero;
    }
    public void multiplicar(double numero) {
        this.valor *= numero;
    }
    public void dividir(double numero) {
        this.valor /= numero;
    }
    public double getValor() {
        return this.valor;
    }
}