package Atividades2.Atividade3;

import Atividades2.Atividade3.funcionarios.Gerente;

public class Main {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente();

        gerente1.setNome("José");
        gerente1.setCargo("Gerente");
        gerente1.setSalario(4000);
        gerente1.addBonus();
        gerente1.exibeSalario();


    }

}
