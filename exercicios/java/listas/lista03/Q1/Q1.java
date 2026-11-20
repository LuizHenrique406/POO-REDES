package lista03.Q1;
import java.util.Scanner;
import java.util.ArrayList;
class Tarefa {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Tarefa> agenda;
    private String descricao;
    private int prioridade;
    public Tarefa() {
        this.agenda = new ArrayList<>();
    }
    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }
    public void adiconarAcoes() {
        System.out.println("Digite uma descrição para a terefa: ");
        this.descricao = sc.nextLine();
        System.out.println("Digite uma prioridade para a tarefa de 1 a 5:");
        this.prioridade = sc.nextInt();
        sc.nextLine();
        Tarefa nova = new Tarefa(this.descricao, this.prioridade);
        this.agenda.add(nova);
    }
    public ArrayList<Tarefa> getLista() {
        return this.agenda;
    }
    public void removerPelaDesc() {
        System.out.println("Digite a descricao que queres remover:");
        String desc = sc.nextLine();
        for (int i = 0; i < agenda.size(); i++) {
            if (desc.equalsIgnoreCase(this.agenda.get(i).descricao)){
                this.agenda.remove(i);
                i--;
            }
        }
    }
    public void exibirMaiorPrio() {
        if (this.agenda.isEmpty()) {
            System.out.println("Não há tarefas no momento!");
            return;
        }
        Tarefa maiorPrio = this.agenda.get(0);
        for (int i = 0; i < this.agenda.size(); i++) {
            if (this.agenda.get(i).prioridade > maiorPrio.prioridade) {
                maiorPrio = this.agenda.get(i);
            }
        }
        System.out.println("Tarefa de maior prioridade: " + maiorPrio);
    }
    public int getQuantTaref() {
        return this.agenda.size();
    }
    @Override
    public String toString() {
        return "Tarefa: " + this.descricao + " (Prioridade: " + this.prioridade + ")";
    }
}