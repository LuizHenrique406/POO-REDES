package listas.lista_beecrowd;
import java.util.Scanner;

class triangulo {
    void calcular(double a, double c){
        double area = (a * c) / 2;
        System.out.printf("TRIANGULO: %.3f%n", area); 
    }
}
class circulo {
    void calcular(double c){
        double pi = 3.14159;
        double area = pi * (c*c);
        System.out.printf("CIRCULO: %.3f%n", area);
    }
}
class trapezio {
    void calcular(double a, double b, double c){
        double area = ((a + b) * c) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", area);
    }
}
class quadrado {
    void calcular(double b){
        double area = b * b;
        System.out.printf("QUADRADO: %.3f%n", area); 
    }
}
class retangulo {
    void calcular(double a, double b){
        double area = a * b;
        System.out.printf("RETANGULO: %.3f%n", area);
    }
}
public class areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        triangulo f1 = new triangulo();
        circulo f2 = new circulo();
        trapezio f3 = new trapezio();
        quadrado f4 = new quadrado();
        retangulo f5 = new retangulo();

        f1.calcular(a, c);
        f2.calcular(c);
        f3.calcular(a, b, c);
        f4.calcular(b);
        f5.calcular(a, b);

        sc.close();
    }
}

