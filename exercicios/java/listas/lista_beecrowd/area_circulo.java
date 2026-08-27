package listas.lista_beecrowd;
import java.util.Scanner;
import java.lang.Math;

public class area_circulo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double n = 3.14159;
        double valor =  n * (Math.pow(raio, 2));
        String a = String.format("%4,f", valor);
        System.out.printf("A=" + a);
        sc.close();
    }
}
