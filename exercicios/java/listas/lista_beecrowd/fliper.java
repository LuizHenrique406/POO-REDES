package listas.lista_beecrowd;
import java.util.Scanner;

public class fliper {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int r = sc.nextInt();
    
    if (p == 0) {
        System.out.println("C");
    } else if (p == 1 && r == 1) {
        System.out.println("A");
    } else {
        System.out.println("B");
    }
    sc.close();
    }
}
