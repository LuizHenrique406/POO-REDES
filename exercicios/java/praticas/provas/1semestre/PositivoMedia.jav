import java.util.Scanner;

public class PostivosMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numspos = 0;
        double soma = 0;
        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                numspos++;
                soma += num;
            }
        }
            System.out.printf("%d valores positivos\n%.1f", numspos, soma / numspos);
            sc.close();
    }
    
}