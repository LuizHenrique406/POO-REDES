package Q2;

class Turma {
    private int codigo;
    private Aluno[] alunos;
    private int quantidade;
    public Turma(int codigo, int capacidade) {
        this.codigo = codigo;
        this.alunos = new Aluno[capacidade];
    }
    public boolean matricular(Aluno aluno) {
        if (quantidade >= this.alunos.length || aluno == null) {
            return false;
        } else {
            this.alunos[this.quantidade] = aluno;
            this.quantidade++;
            return true;
        }
    }
    public Aluno consultar(int matricula) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.alunos[i].getMatricula() == matricula) {
                return this.alunos[i];
            }
        }
        return null;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void listar() {
        for (int i = 0; i < this.quantidade; i++) {
            System.out.println("Matrícula: " + this.alunos[i].getMatricula() + "\nNome: " + this.alunos[i].getNome() + "\nNota: " + this.alunos[i].getNota());
        }
    }
}