public class Principal{
    public static void main(String[] args) {
        Carro carro1 = new Carro("H3JS7", "BMW", "R2", 254);
        Carro carro2 = new Carro("KJ35S", "Fiat", "Uno", 301);
        Carro carro3 = new Carro("HG75H", "Fiat", "Estrada", 143);
        Carro carro4 = carro1;
        Carro carro5 = null;

        // carro1.exibir();
        // carro2.exibir();
        // carro3.exibir();

        // for (int i = 0; i < 2; i++) {
        //     carro1.acelerar();
        // }
        // carro2.freiar();
        // for (int j = 0; j < 3; j++) {
        //     carro3.acelerar();
        // }
        if (carro5 != null) {
            carro5.acelerar();
        }
        // carro1.exibir();
        // carro2.exibir();
        // carro3.exibir();
        // carro4.acelerar();
        // carro4.exibir();
        // carro1.exibir();
    }
}