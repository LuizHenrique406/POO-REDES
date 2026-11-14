package Comercio;
import java.util.ArrayList;

public class Categoria {
    private ArrayList<String> codigo;
    public Categoria(int codigo) {
        this.codigo = new ArrayList<>();
    }
    public void adiconarCodigo() {
        this.codigo.add(String.valueOf(codigo));
    }
}
