package listas.lista_beecrowd;
import java.util.Scanner;
public class preenchi_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int v1 = sc.nextInt();
        n[0] = v1;
        for (int i = 1; i < n.length; i++) {
            int dobro = n[i - 1];
            n[i] = dobro * 2;
        }
        for (int j = 0; j < n.length; j++) {
            System.out.println("N[" + j + "] = " + n[j]);
        }
        sc.close();
    }
}
