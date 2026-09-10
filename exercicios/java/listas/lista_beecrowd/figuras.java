package listas.lista_beecrowd;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class figuras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1, f2, contagem, veri, maior_num;
        contagem = sc.nextInt();
        veri = 1;
        if (contagem >= 1 && contagem <= 3000) {
            while (veri <= contagem) {
                f1 = sc.nextInt();
                f2 = sc.nextInt();
                maior_num = 0;
                List<Integer> divs = new ArrayList<>();
                if (f1 > f2) {
                    maior_num = f1;
                } else {
                    maior_num = f2;
                }
                for (int i = 1; i <= maior_num ; i++) {
                    if (f1 % i == 0 && f2 % i == 0) {
                        divs.add(i);
                    }
                }
                veri += 1;
                System.out.println(divs.get(divs.size() - 1));
            }
        }
        sc.close();
    }
}