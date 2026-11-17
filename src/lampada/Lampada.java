package lampada;

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
            System.out.println("A lâmpada do(a) " + comodo + " está LIGADA.");
        } else {
            System.out.println("A lâmpada do(a) " + comodo + " está DESLIGADA.");
        }
    }
}
