package provas;

public class DifeMaiorMenor {
    public static int MaiorMenor(int[] x) {
        int menor = x[0];
        for(int i = 0; i < x.length; i++) {
            if (menor > x[i]) {
                menor = x[i];
            }
        }
        int maior = x[0];
        for(int j = 0; j < x.length; j++) {
            if (maior < x[j]) {
                maior = x[j];
            }
        }
        int diferenca = maior - menor;

        return diferenca; 
    }
    public static void main(String[] args) {
        int[] a = {234, 343, 5676, 123, 5765};
        int resultado = MaiorMenor(a);
        System.out.println(resultado);
    }    
}
