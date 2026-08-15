import java.util.Scanner;

public class CalMedia {
        public static void main(String[] args){
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o valor de a: ");
            int a = leitor.nextInt();
            
            System.out.print("Digite o valor de b: ");
            int b = leitor.nextInt();
            
            System.out.print("Digite o valor de c: ");
            int c = leitor.nextInt();
            System.out.println("A média foi: " + ((a + b + c) / (3) ));
            leitor.close();
    }
}