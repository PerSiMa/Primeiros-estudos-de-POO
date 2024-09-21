package Atividades.Atividade8.banco;

public class ContaCorrente extends ContaBancaria {

    private double tarifaMensal = 50.00;

    public void cobrarTarifaMensal (){
        saldo -= tarifaMensal;
    }



}
