package exercicios.java.praticas.beecrowd.proble1038;
import java.util.Scanner;
public class Bee1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto = sc.nextInt();
        int quantidade = sc.nextInt();
        Lanche lanche = new Lanche(produto, quantidade);
        System.out.println(lanche.total());
        sc.close();
    }
}
