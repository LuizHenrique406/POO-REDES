package praticas_aleatorias;
import java.util.Scanner;
class Restaurante {
    void cardapio() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("1. Pizza\n2. Batata Frita\n3. Carne\nO que desejas, senhor?: ");
        int opcao = leitor.nextInt();
        if (opcao == 1) {
            System.out.print("Pizza chegando em 15 minutos, senhor");
        }
        if (opcao == 2) {   
            System.out.print("Batata Frita chegando em 5 minutos, senhor");
        }
        if (opcao == 3) {
            System.out.print("Carne chegando em 20 minutos, senhor");
        }
        leitor.close();
    }
}
public class Cardapio {
    public static void main(String[] args) {
        Restaurante pedido = new Restaurante();
        pedido.cardapio();
    }
}