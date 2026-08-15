package praticas_aleatorias;
import java.util.Scanner;

public class Cartao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o seu nome?: ");
        String nome = leitor.nextLine();

        System.out.print("Quantos tu tens?: ");
        String idade = leitor.nextLine();

        System.out.print("Qual linguagem de pogramação você mais curti?: ");
        String gosto = leitor.nextLine();

        System.out.printf("Nome: %s\nIdade: %s\nGosto: %s", nome, idade, gosto);

        leitor.close();
    }
}
