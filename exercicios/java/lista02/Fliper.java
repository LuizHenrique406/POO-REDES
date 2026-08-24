import java.util.Scanner;

public class Fliper {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int p = leitor.nextInt();
        int r = leitor.nextInt();

        if (p == 1) {
            System.out.print("Caminho C");
        } else if (r == 1) {
            System.out.print("Caminho B");
        } else {
            System.out.print("Caminho A");
        }
        
        leitor.close();
        }
    }