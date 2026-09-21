import java.util.Scanner;
public class Jogo2048 {
    private static Scanner sc;
    public static int[][] LerMatriz(int linhas, int colunas) {
        int[][] jogo = new int[linhas][colunas];
            for (int linha = 0; linha < 4; linha++) {
                for (int coluna = 0; coluna < 4; coluna++) {
                    jogo[linha][coluna] = sc.nextInt();
            }
        }
        return LerMatriz(linhas, colunas);
    }
    public static boolean PodeMover(int a, int b) {
        return a != 0 && (a == b || b == 0); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[][] jogo = LerMatriz(4,4);
            boolean esquerda = false;
            boolean direita = false;
            boolean cima = false;
            boolean baixo = false;
            for (int j = 0; j < jogo.length; j++) {
                for (int k = 0; k < jogo[j].length - 1; k++) {
                    if (PodeMover(jogo[j][k], jogo[j][k + 1])) {direita = true;}
                    if (PodeMover(jogo[j][k + 1], jogo[j][k])) {esquerda = true;}
                    if (PodeMover(jogo[k][j], jogo[k + 1][j])) {baixo = true;}
                    if (PodeMover(jogo[k + 1][j], jogo[k][j])) {cima = true;}
                }
            }
            String resposta = "";
            if (cima || baixo || direita || esquerda) {
                if (cima) {resposta += "UP"; }
                if (baixo) {resposta += "DOWN"; }
                if (direita) {resposta += "RIGHT"; }
                if (esquerda) {resposta += "LEFT"; }
            } else {
                resposta = "NONE";
            }
            System.out.println(resposta);
        }
        sc.close();
    }
}