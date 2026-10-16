public class Motorista {
    private String nome;
    private Carro carro;
    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }
    public void exibir(){
        System.out.println("Motorista: " + nome);
        if (carro == null) {
            System.out.println("Carro: nenhum");
        }
        System.out.println("Carro: " + carro.getPlaca() + " - " + carro.getMarca());
    }
    public void trocarCarro(Carro novoCarro) {
        this.carro = novoCarro;
    }
}
