package src.app;
import src.modelo.Carro;
import src.modelo.Garagem;
import src.modelo.Motorista;

public class Principal{
    public static void main(String[] args) {
        Carro carro1 = new Carro("H3JS7", "BMW", "R2", 254);
        Carro carro2 = new Carro("KJ35S", "Fiat", "Uno", 301);
        Carro carro3 = new Carro("HG75H", "Fiat", "Estrada", 143);

        Motorista motorista1 = new Motorista("Jõao", carro1);
        Motorista motorista2 = new Motorista("Maria", carro2);

        Garagem garagem1 = new Garagem();

        System.out.println("=== VEÍCULOS ===\n");
        carro1.exibir();
        carro2.exibir();
        carro3.exibir();
        System.out.println("\n=== MOTORISTAS ===\n");
        motorista1.exibir();
        motorista2.exibir();
        System.out.println("\n=== GARAGEM ===\n");
        garagem1.exibir();
        System.out.println("\nTotal de Carros criados: " + Carro.getQuantidade());
    }
}