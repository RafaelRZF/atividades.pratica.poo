package carro;

public class Carro {
    public String marca;
    public String modelo;
    public double velocidade;

    public void acelerar() {
        velocidade += 10.0;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Velocidade: " + velocidade);
    }
}
