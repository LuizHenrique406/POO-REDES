public class Jogo2048 {
    public static void main(String[] args) {
        int pos = 0;
        int[] n = 
        {0, 0, 0, 8,
         0, 0, 2, 16,
         0, 0, 2, 32,
         2, 8, 16, 32
        };


        
        for (int j = 0; j < 4; j++) {
            pos = j;
            for (int i = 0; i < 4; i++) {
                System.out.println(n[pos]);
                pos += 4;
            }
        }



    }
}