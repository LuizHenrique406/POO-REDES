package lista03;

import java.util.ArrayList;

public class Tarefa {
    private String descricao;
    private int prioridade;
    private ArrayList<Tarefa> agenda;
    public Tarefa(String descrincao, int prioridade) {
        this.descricao = descrincao;
        this.prioridade = prioridade;
        this.agenda = new ArrayList();        
    }
    public void adicionarTarefas() {

    }
}
