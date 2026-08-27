package listas.lista01;
import java.util.Scanner;

public class MaiorQue {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int a = leitor.nextInt();

        System.out.print("Digite um valor: ");
        int b = leitor.nextInt();

        System.out.print("Digite um valor: ");
        int c = leitor.nextInt();

        int maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        System.out.print("O maior valor foi: " + maior);
        leitor.close();
    }
}