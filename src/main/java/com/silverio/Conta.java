package main.java.com.silverio;

public class Conta {
    private String nomeCliente;
    private float saldo;

    public Conta(String nomeCliente, float saldo) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    private boolean setSaldo(float valor) {
        if (valor > 0 && valor <= getSaldo()) {
            saldo = valor;
            return true;
        } else {
            System.out.println("Valor proibido");
        }
        return false;
    }

    public void saque(float valor) {
        setSaldo((getSaldo() - valor));
    }

    public void deposito(float valor) {
        setSaldo((getSaldo() + valor));
    }
}
