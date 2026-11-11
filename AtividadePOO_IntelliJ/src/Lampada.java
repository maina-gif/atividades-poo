public class Lampada {
    public String comodo;
    public boolean estaLigada;

    public void ligar() {
        estaLigada = true;
    }

    public void desligar() {
        estaLigada = false;
    }

    public void observar() {
        if (estaLigada) {
            System.out.println("Lâmpada da " + comodo + ": LIGADA");
        } else {
            System.out.println("Lâmpada da " + comodo + ": DESLIGADA");
        }
    }
}
