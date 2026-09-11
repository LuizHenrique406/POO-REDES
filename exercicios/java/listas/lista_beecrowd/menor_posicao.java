package listas.lista_beecrowd;
import java.util.Scanner;

public class menor_posicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int menor = 0;
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int j = 0; j < n - 1; j++) {
            if (x[j] > x[j + 1]) {
                menor = x[j + 1];
                posicao = j;
            } else {
                menor = x[j];
                posicao = j;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao); 
        sc.close();
    }
}
