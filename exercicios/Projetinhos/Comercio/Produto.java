package Comercio;
import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    private int quantidade;
    private int codigo;
    private double preco;
    private String nome;

    public Produto(int quantidade, int codigo, double preco, String nome) {
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    public void adicionar() {
        quantidade++;
    }
    public void AdcionarCodigo() {
        System.out.println("Digite um código para verificação de categoria:");
        codigo = sc.nextInt();
    }
    public void NovoPreco() {
        System.out.println("Digite um novo preço:");
        preco = sc.nextDouble();
    }
    public void NovoNome() {
        System.out.println("Digie um novo nome para o produto:");
        nome = sc.nextLine();
    }
    public int getQuantidade() {
        return quantidade;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }
}
