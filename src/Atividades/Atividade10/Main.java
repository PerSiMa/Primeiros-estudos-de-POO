package Atividades.Atividade10;

import Atividades.Atividade10.calculos.CalculadoraSalaRetangular;

public class Main {

    public static void main(String[] args) {

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();


        System.out.println("A área do retangulo é " + calculadora.calcularArea(50, 20));
        System.out.println("O perímetro do retangulo é " + calculadora.calcularPerimetro(50, 20));



    }

}
