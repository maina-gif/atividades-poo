public class Carro {
    public String marca;
    public String modelo;
    public double velocidade;

    public void acelerar() {
        velocidade = velocidade + 10.0;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
    }
}
