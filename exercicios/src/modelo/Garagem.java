import java.util.ArrayList;

public class Garagem {
    private Carro carro1;
    private Carro carro2;
    private Carro carro3;
    public Garagem(Carro carro) {
        this.carro1 = carro;
        this.carro2 = carro;
        this.carro3 = carro;
    }
    public void estacionar(Carro carro) {
        ArrayList<Carro> carros = new ArrayList<>();
        if (carros.size() > 3) {
            System.out.println("Garagem cheia");
            return;
        }
        carros.add(carro);
    }
    public void exibir() {
        System.out.println("1. " + carro1.getPlaca() + " - " + carro1.getMarca() + " " + carro1.getModelo());
        System.out.println("2. " + carro2.getPlaca() + " - " + carro2.getMarca() + " " + carro2.getModelo());
        System.out.println("3. " + carro3.getPlaca() + " - " + carro3.getMarca() + " " + carro3.getModelo());
    }
}
