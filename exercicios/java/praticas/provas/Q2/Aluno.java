package Q2;

class Aluno {
    private int matricula;
    private String nome;
    private int nota;
    public Aluno(int matricula, String nome, int nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getNota() {
        return nota;
    }
}