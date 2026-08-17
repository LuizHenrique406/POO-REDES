import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double r1;
        double r2;

        if (delta > 0) {
            r1 = ((-b) + Math.sqrt(delta)) / (2 * a); 
            r2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\nR2 = %.5f", r1, r2);
        }
        else {
            System.out.print("Impossível calcular");
        }
        sc.close();
    }
}