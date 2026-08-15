package praticas_aleatorias;
import java.util.Scanner;

class Posto {
    void abastecimento() {
    double gasolina = 5.80;
    double etanol = 3.90;

    Scanner leitor = new Scanner(System.in);
    System.out.printf("1. Gasolina (R$%.2f o litro)\n2. Etanol (R$%.2f o litro)\nQual desejas, senhor?: ", gasolina, etanol);

    int opcao = leitor.nextInt();
    
    switch (opcao) {
        case 1:
            System.out.print("Quantos litros desejas?: ");
            double litros = leitor.nextDouble();
            System.out.printf("O total da conta foi: %.2f", litros * gasolina);
            break;
        case 2:
            System.out.print("Quantos você deseja?: ");
            litros = leitor.nextDouble();
            System.out.printf("O total da conta foi: %.2f", litros * etanol);
            break;
        default:
            System.out.print("Por favor, digite os valores disponíveis!");
            break;
    }
    leitor.close();
    }

}

public class PostoGasolina {
    public static void main(String[] args) {
        Posto abastecer = new Posto();
        abastecer.abastecimento();
    }
}
