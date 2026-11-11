package Q2;

public class Principal {
    public static void main(String[] args) {
        Turma turma01 = new Turma(676767, 4);
        Aluno aluno01 = new Aluno(2025101404, "Sarah", 100);
        Aluno aluno02 = new Aluno(2024101404, "Cláudia", 80);
        Aluno aluno03 = new Aluno(2026101404, "Luiz", 100);

        turma01.matricular(aluno01);
        turma01.matricular(aluno02);
        turma01.matricular(aluno03);

        turma01.listar();

        System.out.println("Quantidade total de alunos: " + turma01.getQuantidade());

        turma01.consultar(2025101404);
        turma01.consultar(2023101404);
    }
}
