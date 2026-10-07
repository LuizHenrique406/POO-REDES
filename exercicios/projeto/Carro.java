public class Carro{
    private String Placa;
    private String marca;
    private String modelo;
    private int velocidade;
    public carro(String Placa, String marca, String modelo, int velocidade){
        this.Placa = Placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;

    }
    public void acelerar(){
        velocidade += 10;
    }
    public void frear(){
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }  
    }
    public void exibir(){
        System.out.printf("%s - %s %s - velocidade: %d km/h", Placa, marca, modelo, velocidade);
    }
}