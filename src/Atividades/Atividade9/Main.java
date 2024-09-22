package Atividades.Atividade9;

import Atividades.Atividade9.conversor.ConversorMoeda;

public class Main {

    public static void main(String[] args) {

        ConversorMoeda valor1 = new ConversorMoeda();

        valor1.setSaldoDolar(200);
        System.out.println("O valor atual de " + valor1.getSaldoDolar() + " Dólares para Reais é " + valor1.converterDolarParaReal(5.52));

    }

}
