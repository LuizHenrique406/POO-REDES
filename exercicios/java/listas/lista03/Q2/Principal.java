public class Principal {
    public static void main(String[] args) {
        Historico historico = new Historico();
        historico.adiconarNotas();
        historico.adiconarNotas();
        historico.notasMed(6);
        historico.calcularMed();
        historico.maiorNota();
        historico.menorNota();
    }
}
