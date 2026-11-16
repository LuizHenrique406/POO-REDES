package comercio;
import java.util.ArrayList;

public class Pratileira {
    private ArrayList<Produto> produto;
    public Pratileira(Produto item) {
        this.produto = new ArrayList<>();
    }
    public void adiconarProduto(Produto produto) {
        this.produto.add(produto);
    }
    public void removerProduto(Produto produto) {
        this.produto.remove(produto);
    }
    public Produto getProduto(int indice) {
        return this.produto.get(indice);
    }
}