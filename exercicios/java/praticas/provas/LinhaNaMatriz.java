import java.util.Scanner;

public class LinhaNaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha = sc.nextInt();
        String t = sc.next();
        int soma = 0;
        double media = 0;
        int[][] matriz = {{2}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};

        if (t.equals("S")) {
            for (int j = 0; j < matriz[linha].length; j++) {
                soma += matriz[linha][j];
            }
            System.out.printf("%.1f", (double) soma);
        } else if (t.equals("M")) {
            for (int j = 0; j < matriz[linha].length; j++) {
                soma += matriz[linha][j];
            }
            media = (double) soma / matriz[linha].length;
            System.out.printf("%.1f", media);
        }
        sc.close();
    }
}


