package exercicios.java.praticas.beecrowd.proble1038;

public class Lanche {
    private int codigo;
    private int quantidade;
    public Lanche(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
    public double total() {
        double valorunidade = switch (codigo) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 0.00;
        };
        return valorunidade * quantidade;
    }
}
