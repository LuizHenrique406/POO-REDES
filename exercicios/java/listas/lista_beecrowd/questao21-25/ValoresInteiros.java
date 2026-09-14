import java.util.Scanner;

public class ValoresInteiros {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;
        System.out.printf("X = %.4f", x);
        sc.close();
    }
}
