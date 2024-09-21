package Atividades.Atividade8.banco;

public class ContaBancaria {

    String nome;
    protected double saldo;

    public void depositar (int valor) {
        saldo += valor;
    }

    public void sacar (int valor) {
        saldo -= valor;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é " + saldo);
    }



}
