package listas.lista_beecrowd;
import java.util.Scanner;
import java.lang.Math;

public class eh_maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int resultado = ( ((a + b) + (Math.abs(a-b))) /2 );
        if (resultado > c){
            System.out.println(resultado + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }
        sc.close();
    }
}
