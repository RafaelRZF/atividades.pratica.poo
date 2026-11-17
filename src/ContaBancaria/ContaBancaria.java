package ContaBancaria;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo atual: R$ " + saldo);
    }
}
