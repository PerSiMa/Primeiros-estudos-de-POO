package Atividades.Atividade12;

import Atividades.Atividade12.conversor.ConversorTemperaturaPadrao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConversorTemperaturaPadrao temp = new ConversorTemperaturaPadrao();
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos graus de temperatura celsius você deseja converter ?");
        System.out.println("A temperatura em Fahrenheit é " + temp.celsiusParaFarenheit(input.nextDouble()));
        System.out.println("Quantos graus de temperatura Fahrenheit você deseja converter ?");
        System.out.println("A temperatura em Fahrenheit é " + temp.farenheitParaCelsius(input.nextDouble()));

    }

}
