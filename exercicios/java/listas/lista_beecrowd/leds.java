package listas.lista_beecrowd;
import java.util.Scanner;;

public class leds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int leds = 0;
            for (int j = 0; j < s.length(); j++) {
                char letra = s.charAt(j);
                switch (letra) {
                    case '1' : leds += 2; break;
                    case '2' : case '3': case '5': leds += 5; break;
                    case '4' : leds += 4; break;
                    case '0': case '6': case '9': leds += 6; break;
                    case '7' : leds += 3; break;
                    case '8' : leds += 7; break;
                    default: leds += 0;
                }
            }
            System.out.println(leds + " leds");
        }
        sc.close();
    }
}