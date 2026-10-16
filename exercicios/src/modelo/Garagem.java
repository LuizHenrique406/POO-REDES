package src.modelo;
import java.util.ArrayList;

public class Garagem {
    private ArrayList<Carro> estacionamento;

    public Garagem() {
        this.estacionamento = new ArrayList<>();
    }

    public void estacionar(Carro carro) {
        if (this.estacionamento.size() == 3) {
            System.out.println("Estacionamento cheio");
            return;
        }
        this.estacionamento.add(carro);
    }

    public void exibir() {
        int idCarro = 1;
        for (Carro carro : this.estacionamento) {
            System.out.println(idCarro + ". " + carro.getPlaca() + " - " + carro.getMarca() + " " + carro.getModelo());
            idCarro++;
        }
    }
}