package listas.lista01;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = leitor.nextInt();
        if (valor % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Ímpar");
        }
        leitor.close();
    }
}