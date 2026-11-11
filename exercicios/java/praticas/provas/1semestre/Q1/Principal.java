package Q1;

public class Principal {
    public static void main(String[] args) {
        CartaoTransporte cartao = new CartaoTransporte(12.00);

        cartao.mostrarCartao();
        cartao.pagarPassagem();
        cartao.pagarPassagem();

        cartao.mostrarCartao();

        cartao.adicionarCreditos(5.00);

        cartao.mostrarCartao();

        cartao.pagarPassagem();
        cartao.mostrarCartao();
        cartao.pagarPassagem();
        cartao.mostrarCartao();
        cartao.pagarPassagem();
        cartao.mostrarCartao();
        cartao.pagarPassagem();

        cartao.mostrarCartao();

        cartao.zerarPassagem();

        cartao.mostrarCartao();
    }
}