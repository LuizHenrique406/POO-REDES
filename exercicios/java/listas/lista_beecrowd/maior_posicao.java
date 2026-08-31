package listas.lista_beecrowd;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maior = 0;
        int pos = 0;
        int i;
        for (i = 1; i < 101; i++) {
            num = sc.nextInt();
            if (num > maior) {
                maior = num;
                pos = i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
        sc.close();
    }
}
