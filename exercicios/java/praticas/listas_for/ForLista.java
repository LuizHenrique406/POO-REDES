package listas_for;
import java.util.ArrayList;

public class ForLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Lista: " + numeros);
    }
}