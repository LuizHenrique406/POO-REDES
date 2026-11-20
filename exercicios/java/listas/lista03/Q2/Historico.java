import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Historico {
    Scanner sc = new Scanner(System.in);
    private List<Double> notas;
    private Double nota;
    public Historico() {
        this.notas = new ArrayList<>();
    }
    public Historico(Double nota) {
        this.nota = nota;
    }
    public void adiconarNotas() {
        System.out.println("\nDigite a nota do aluno:");
        this.nota = sc.nextDouble();
        sc.nextLine();
        Double historico = this.nota;
        this.notas.add(historico);
    }
    public void calcularMed() {
        int soma = 0;
        for (Double nota : this.notas) {
            soma += nota;
        }
        System.out.println("\nMédia: " + soma / this.notas.size());
    }
    public void maiorNota() {
        if (this.notas.isEmpty()) {
            System.out.println("\nLista vazia!");
            return;
        }
        Double maiorNota = this.notas.get(0);
        for (int i = 0; i < this.notas.size(); i++) {
            if (this.notas.get(i) > maiorNota) {
                maiorNota = this.notas.get(i);
            }
        }
        System.out.println("\nMaior nota: " + maiorNota);
    }
    public void menorNota() {
        if (this.notas.isEmpty()) {
            System.out.println("\nLista vazia!");
            return;
        }
        Double menorNota = this.notas.get(0);
        for (int i = 0; i < this.notas.size(); i++) {
            if (this.notas.get(i) < menorNota) {
                menorNota = this.notas.get(i);
            }
        }
        System.out.println("\nMenor nota: " + menorNota);
    }
    public void notasMed(double media) {
        int quantNotMed = 0;
        for (int i = 0; i < this.notas.size(); i++) {
            if (this.notas.get(i).equals(nota)) {
                quantNotMed += 1;
            }
        }
        System.out.println("\nNotas na média: " + quantNotMed);
    }
}