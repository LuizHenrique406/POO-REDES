package src,modelo;

public class Carro{
    private String Placa;
    private String marca;
    private String modelo;
    private int velocidade;
    private static int quantidade;
    public Carro(String Placa, String marca, String modelo, int velocidade){
        this.Placa = Placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        quantidade++;
    }
    public void acelerar(){
        velocidade += 10;
    }
    public void freiar(){
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
    public void exibir(){
        System.out.println(Placa + " - " + marca + " " + modelo + " - " + "velocidade: " + velocidade + " km/h");
    }
    public static int getQuantidade() {
        return quantidade;
    }
    public String getPlaca(){
        return this.Placa;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
}