package comercio;
import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    private int quantidade;
    private double preco;
    private String nome;

    public Produto(int quantidade, int codigo, double preco, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }
    public void adicionar() {
        quantidade++;
    }
    public void setNovoPreco() {
        System.out.println("Digite um novo preço:");
        preco = sc.nextDouble();
    }
    public void setNovoNome() {
        System.out.println("Digie um novo nome para o produto:");
        nome = sc.nextLine();
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}
