package lista03.Q1;

public class Principal {
    public static void main(String[] args) {
        Tarefa calendario = new Tarefa();
        calendario.adiconarAcoes();
        calendario.adiconarAcoes();
        calendario.removerPelaDesc();
        System.out.println(calendario.getLista());
    }
}
