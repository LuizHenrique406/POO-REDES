import java.util.Scanner;

public class MenorPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int menor = x[0];
        for (int j = 1; j < n; j++) {
            if (x[j] <= menor) {
                menor = x[j];
                posicao = j;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao); 
        sc.close();
    }
}
