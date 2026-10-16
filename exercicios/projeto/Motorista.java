public class Motorista {
    private String nome;
    private Carro carro;
    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }
    public void exibir(){
        System.out.println("Motorista: " + nome);
        System.out.println("Carro: " + carro);
    }
    public static void main(String[] args) {
        Carro carro1 = new Carro("H7GR", "Gol", "Estrada", 231);
        Motorista motorista1 = new Motorista("Jõao", carro1);
        Carro carro2 = new Carro("BHKFT", "Fiat", "Sla", 234);
        Motorista motorista2 = new Motorista("Maria", carro2);
        
        motorista1.exibir();
        motorista2.exibir();
    }
}
