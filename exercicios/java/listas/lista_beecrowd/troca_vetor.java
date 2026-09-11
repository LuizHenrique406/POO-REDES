package listas.lista_beecrowd;
import java.util.Scanner;
public class troca_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[20];
        int tamanho = 19;
        for (int i = 0; i < n.length; i++) {
            int valor = sc.nextInt();
            n[i] = valor;
        }
        for (int j = 0; j < 10; j++) {
            int inicio = n[j];
            int finaly = n[tamanho];
            n[tamanho] = inicio;
            n[j] = finaly;
            tamanho--;
        }
        for (int a = 0; a < n.length; a++) {
            System.out.println("N[" + a + "] = " + n[a]);
        }
        sc.close();
    }
}