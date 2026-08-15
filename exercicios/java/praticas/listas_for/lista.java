package listas_for;
import java.util.ArrayList;

public class lista {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(45);
        numeros.add(2345);
        numeros.add(35);

        System.out.println((numeros.get(0)));
        System.out.println((numeros.get(1)));
        System.out.println((numeros.get(2)));

        System.out.println("Tamanho da lista: " + numeros.size());
    }
}
