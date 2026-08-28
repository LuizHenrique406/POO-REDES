package listas.lista_beecrowd;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class formula_baskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = (b*b) - (4 * a * c);

        double r1;
        double r2;


        if (delta == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            r1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            r2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));
        }
        sc.close();
    }

}