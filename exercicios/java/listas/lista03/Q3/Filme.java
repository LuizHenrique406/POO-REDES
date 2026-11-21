import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Filme {
    Scanner sc = new Scanner(System.in);
    private List<Filme> filmes;
    private String titulo;
    private int ano;
    private double duracao;
    public Filme() {
        this.filmes = new ArrayList<>();
    }
    public Filme(String titulo, int ano, double duracao) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }
    public void adicionarFilme() {
        System.out.println("\nDigite o título do filme:");
        this.titulo = sc.nextLine();
        System.out.println("\nDigite o ano do filme:");
        this.ano = sc.nextInt();
        System.out.println("\nDigite a duração do filme:");
        this.duracao = sc.nextDouble();
        sc.nextLine();
        Filme catalogo = new Filme(this.titulo, this.ano, this. duracao);
        this.filmes.add(catalogo);
    }
    public List<Filme> getFilmes() {
        return this.filmes;
    }
    public void buscaTitulo() {
        System.out.println("\nQual filmes queres pesquisar?:");
        String nomeFilme = sc.nextLine();
        for (int i = 0; i < this.filmes.size(); i++) {
            if (this.filmes.get(i).titulo.equalsIgnoreCase(nomeFilme)) {
                System.out.println(this.filmes.get(i));
                return;
            }
        }
    }
    public void fimeMaisAntigo() {
        Filme maisAntigo = this.filmes.get(0);
        for (int i  = 0; i < this.filmes.size(); i++){
            if (this.filmes.get(i).ano > maisAntigo.ano) {
                maisAntigo = this.filmes.get(i);
            }
        }
        System.out.printf("%nFilme mais antigo: %s%n", maisAntigo);
    }
    public void filmeLongo() {
        Filme maiorDura = this.filmes.get(0);
        for (int i  = 0; i < this.filmes.size(); i++){
            if (this.filmes.get(i).duracao > maiorDura.duracao) {
                maiorDura = this.filmes.get(i);
            }
        }
        System.out.printf("%nFilme mais longo: %s%n", maiorDura);
    }
    @Override
    public String toString() {
        return "Filme: " + this.titulo + " | ano: " + this.ano + " | duração: " + this.duracao; 
    }
}
