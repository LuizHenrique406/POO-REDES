package listas.lista_beecrowd;
import java.util.Scanner;
public class subs_vetor {
    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i ++) {
            int n = sc.nextInt();
            x[i] = n;
        }
        for (int j = 0; j < x.length; j++) {
            if (x[j] <= 0) {
                x[j] = 1;
                System.out.println("X[" + j + "] = " + x[j]);
            } else {
                System.out.println("X[" + j + "] = " + x[j]);
            }
        }
        sc.close();
    }
}
