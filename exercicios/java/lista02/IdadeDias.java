import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        int ano = idade / 365 ;
        int resto = idade % 365;

        int meses = resto / 30;
        resto = resto % 30;

        int dias = resto;

        System.out.printf("%d ano (s)\n%d mes (s)\n%d dia (s)", ano, meses, dias);
        sc.close();

    }
}
