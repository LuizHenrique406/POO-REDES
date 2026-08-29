package listas.lista_beecrowd;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (2 < n && n < 1000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
        sc.close();
    }
}