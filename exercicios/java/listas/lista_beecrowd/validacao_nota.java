package listas.lista_beecrowd;
import java.util.Scanner;

public class validacao_nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas_validas = 0;
        Double soma = 0.0;
        while (notas_validas < 2) {
            Double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                soma += nota;
                notas_validas++;
            } else {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f%n", soma / 2);
        sc.close();
    }
}
