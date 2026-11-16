package comercio;
import java.util.ArrayList;

public class Dados {
    private ArrayList<Cliente> clientes;
    private Cliente cliente;
    public Dados(Cliente cliente) {
        this.clientes = new ArrayList<>();
    }
    public void adicionarCliente() {
        this.clientes.add(cliente);
    }
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }
    
}