package Atividades.Atividade8;

import Atividades.Atividade8.banco.ContaCorrente;

public class Principal {

    public static void main(String[] args) {

        ContaCorrente contacorrente1 = new ContaCorrente();

        contacorrente1.depositar(200);
        contacorrente1.sacar(30);
        contacorrente1.consultarSaldo();
        contacorrente1.cobrarTarifaMensal();
        contacorrente1.consultarSaldo();

    }

}
