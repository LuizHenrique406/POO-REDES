package praticas_aleatorias;
import java.util.Scanner;

public class MaquinaDesconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Calculo de 10% sobre seu valor, qual será?: ");
        double valor = leitor.nextInt();
        double resultado = (valor * 10) / 100.0;
        System.out.printf("Valor original: %.2f\nValor economizado: %.2f\nValor final com desconto: %.2f", valor, resultado, valor - resultado);
        leitor.close();
    }
}
