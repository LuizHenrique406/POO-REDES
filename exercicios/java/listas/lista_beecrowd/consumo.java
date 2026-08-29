package listas.lista_beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;
// class Combustivel {
//     void consumo(int x, double y){
//         double resultado = x / y;
//         System.out.printf("%.3f km/l", resultado); 
//     }
// }
public class consumo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double resultado = x / y;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.printf(df.format(resultado) + " km/l");
        // Combustivel v1 = new Combustivel();
        // v1.consumo(x, y);
        sc.close();
    }
}