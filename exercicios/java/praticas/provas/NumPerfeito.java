import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NumPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean veri = false;
        int n = sc.nextInt();
        int soma = 0;
        List<Integer> divs = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            if (n % i == 0) {
            divs.add(i);  
            }
        }
        for (int j = 0; j < divs.size(); j++) {
            soma += divs.get(j);
            if (soma == n){
                veri = true;
                break;
            }
        }
        if (veri) {
            System.out.println(n + " eh perfeito");
        } else {
            System.out.println(n + " nao eh perfeito");
        }
        sc.close();
    }    
}
