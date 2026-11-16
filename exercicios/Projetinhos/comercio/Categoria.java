package comercio;
import java.util.ArrayList;

public class Categoria {
    private ArrayList<Integer> lista_codigos;
    private int codigo;
    public Categoria(int codigo) {
        this.lista_codigos = new ArrayList<>();
        this.codigo = codigo;
    }
    public void adiconarCodigo() {
        this.lista_codigos.add(this.codigo);
    }
}
