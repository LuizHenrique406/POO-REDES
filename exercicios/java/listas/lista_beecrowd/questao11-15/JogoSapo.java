import java.util.Scanner;

public class JogoSapo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Pulo = sc.nextInt();
        // int CanoQuant = sc.nextInt();
        // int[] Canos = new int[CanoQuant];
        int[] Canos = {1, 3, 6, 9, 7, 2, 4, 5, 8, 3};
        for (int i = 0; i < Canos.length; i++) {
            if ((Pulo - Canos[i]) <= Pulo) {
                System.out.println("GAME OVER");
                break;
            }
        }
        System.out.println("YOU WIN");
    }
}
