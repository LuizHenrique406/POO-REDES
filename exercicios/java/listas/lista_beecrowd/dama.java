package listas.lista_beecrowd;
import java.util.Scanner;

public class dama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int resultado = (x1 - y1) + (x2 - y2);
        System.out.println(resultado);
        sc.close();
    }
}
