package listas.lista_beecrowd;
import java.util.Scanner;
public class consumo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double resultado = x / y;
        System.out.printf("%.3f km/l%n", resultado);
        // Combustivel v1 = new Combustivel();
        // v1.consumo(x, y);
        sc.close();
    }
}