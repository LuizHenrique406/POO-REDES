package listas.lista_beecrowd;
import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha_correta = 2002;
        int senha = 0;
        while (senha != senha_correta) {
            senha = sc.nextInt();
            if (senha != senha_correta) {
                System.out.println("Senha Invalida");
            }
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
