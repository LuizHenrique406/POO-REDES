package listas.lista_beecrowd;
import java.util.Scanner;

public class dias_idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        int ano = idade / 365;
        int resto = idade % 365;

        int mes = resto / 30;
        resto = resto % 30;

        int dia = resto;

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");
        sc.close();
    }
}
