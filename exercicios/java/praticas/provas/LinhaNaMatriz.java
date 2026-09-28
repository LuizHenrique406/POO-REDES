import java.util.Scanner;

public class LinhaNaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        int linha = sc.nextInt();
        int soma = 0;
        int media = 0;
        int[][] matriz = {{2},{1,2,3,4,5,6,7,8,9,10,11,12}};
        if (t == "S") {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 12; j++) {
                    soma+= matriz[linha][j];
                }
            }
            System.out.printf("%.1f", soma);
        }
        if (t == "M") {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 12; j++) {
                    soma+= matriz[linha][j];
                }
            }
            System.out.printf("%.1f", media);
    }
    sc.close();
    }
}


