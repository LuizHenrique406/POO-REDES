public class Main {
    public static void main(String[] args) {
        Filme catalogo = new Filme();
        catalogo.adicionarFilme();
        catalogo.adicionarFilme();
        catalogo.filmeLongo();
        catalogo.fimeMaisAntigo();
        System.out.println(catalogo.getFilmes());
    }
}
