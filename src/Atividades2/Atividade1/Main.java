package Atividades2.Atividade1;

import Atividades2.Atividade1.pessoa.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(18);
        pessoa1.setAltura(1.9);


        pessoa1.exibeDados();

    }

}
