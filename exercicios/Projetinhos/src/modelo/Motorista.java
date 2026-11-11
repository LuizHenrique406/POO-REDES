package src.modelo;

public class Motorista {
    private String nome;
    private Carro carro;
    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }
    public void exibir(){
        System.out.println(nome + " -> " + carro.getPlaca());
    }
    public void trocarCarro(Carro novoCarro) {
        this.carro = novoCarro;
    }
}
