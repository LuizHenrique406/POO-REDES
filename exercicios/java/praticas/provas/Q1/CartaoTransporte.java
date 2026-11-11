package Q1;

public class CartaoTransporte {
    private double saldo;
    private int quantidadeViagens;

    public CartaoTransporte(double saldo) {
        if (saldo < 0) { this.saldo = 0; } 
        else { this.saldo = saldo; }

        this.quantidadeViagens = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getViagens() {
        return this.quantidadeViagens;
    }

    public void adicionarCreditos(double credito) {
        if (credito < 0) {
            return;
        }
        this.saldo += credito;
    }

    public boolean pagarPassagem() {
        if (this.saldo < 4.50) {
            return false;
        }
        this.saldo -= 4.50;
        this.quantidadeViagens++;
        return false;
    }

    public void zerarPassagem() {
        this.quantidadeViagens = 0;
    }

    public void mostrarCartao() {
        System.out.println("Saldo atual: " + this.saldo + "\nQuantidade de viagens: " + this.quantidadeViagens);
        System.out.println();
    }
}