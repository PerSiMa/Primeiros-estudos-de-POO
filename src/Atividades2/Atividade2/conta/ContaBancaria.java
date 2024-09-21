package Atividades2.Atividade2.conta;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        saldo -= saque;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é " + saldo);
    }

}
