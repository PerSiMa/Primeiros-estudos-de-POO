package Atividades2.Atividade4;

import Atividades2.Atividade4.formageometrica.Circulo;
import Atividades2.Atividade4.formageometrica.Retangulo;

public class Main {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();

        circulo1.setRaio(4.5);


        Retangulo retangulo1 = new Retangulo();

        retangulo1.setAltura(10);
        retangulo1.setBase(10);


        System.out.println("A área do círculo é " + circulo1.calcularArea());
        System.out.println("A área do retângulo é " + retangulo1.calcularArea());


        
    }
    
}
