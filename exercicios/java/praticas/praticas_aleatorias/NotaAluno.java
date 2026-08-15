package praticas_aleatorias;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        int nota1 = leitor.nextInt();

        System.out.print("Digite uma segunda nota: ");
        double nota2 = leitor.nextInt();
        leitor.close();

        double resultado = (nota1 + nota2) / 2;

        if (resultado >= 7) {
            System.out.print("Aprovado!!!");
        }
        if (resultado >= 5 && resultado <= 6.9){
            System.out.print("Em recuperação!!!");
        }
        if (resultado <= 4.9 || resultado <= 0) {
            System.out.print("Reprovado!!!");
        }
    }
}
