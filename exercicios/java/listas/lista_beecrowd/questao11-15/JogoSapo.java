import java.util.Scanner;

public class JogoSapo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do Sapo: ");
        int pulo = sc.nextInt();
        System.out.println("Digite a quantidade de muro: ");
        int muroquant = sc.nextInt();
        int[] muro = new int[muroquant];
        boolean win = true;
        System.out.println("Insira alturas pros muros: ");
        
        for (int j = 0; j < muro.length; j++) {
            int valor = sc.nextInt();
            muro[j] = valor;
        }

        for (int i = 0; i < muro.length; i++) {
            if ((Math.abs(pulo - muro[i])) > pulo) {
                win = false;
                break;
            }
        }

        if (win) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }

        sc.close();
    }
}
