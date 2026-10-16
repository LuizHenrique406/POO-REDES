public class Principal{
    public static void main(String[] args) {
        Carro carro1 = new Carro("H3JS7", "BMW", "R2", 254);
        Carro carro2 = new Carro("KJ35S", "Fiat", "Uno", 301);
        Carro carro3 = new Carro("HG75H", "Fiat", "Estrada", 143);

        Motorista motorista1 = new Motorista("Jõao", carro1);
        Motorista motorista2 = new Motorista("Maria", carro2);

        Garagem garagem1 = new Garagem(carro1);
        
        System.out.println("Carros criados: " + Carro.getQuantidade());
    }
}