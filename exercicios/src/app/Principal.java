package src.app;
import src.modelo.Carro;
import src.modelo.Motorista;
import src.modelo.Garagem;

public class Principal{
    public static void main(String[] args) {
        Carro carro1 = new Carro("H3JS7", "BMW", "R2", 254);
        Carro carro2 = new Carro("KJ35S", "Fiat", "Uno", 301);
        Carro carro3 = new Carro("HG75H", "Fiat", "Estrada", 143);

        Motor motorista1 = new Motor("Jõao", carro1);
        Motor motorista2 = new Motor("Maria", carro2);

        Garagem garagem1 = new Garagem(carro1);

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