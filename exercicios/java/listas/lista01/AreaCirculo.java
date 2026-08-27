package listas.lista01;
import java.util.Scanner;
import java.lang.Math;

public class AreaCirculo{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int a = leitor.nextInt();
        double pi = 3.14159;
        System.out.println("A área do circulo foi: " + ((Math.pow(a,2)) * pi));
        leitor.close();
    }
}