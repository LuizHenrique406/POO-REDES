import java.util.Scanner;

public class MainCalculadora{
    Scanner sc = new Scanner(System.in);
    int LerOperacao(double valor) {
        System.out.println("Valor = " + valor);
        System.out.println("1. Somar\n2. Subtrair\n3. Multiplicar\n 4. Dividir\n0. Sair");
        return sc.nextInt();
    }
    void main() {
        
    }
}